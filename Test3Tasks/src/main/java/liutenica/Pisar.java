package liutenica;

import liutenica.vegetables.DBManager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Pisar extends Thread{
    private static ArrayList<String> momciNames = new ArrayList<>();
private static Connection c = DBManager.INSTANCE.getConnection();
    public static void addToDB(Partida partida) {
        Connection c = DBManager.INSTANCE.getConnection();
        String sql = "INSERT INTO lutenica (date,quantity,baba_name) VALUES (?,?,?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(partida.getDate()));
            ps.setInt(2,partida.getKilos());
            ps.setString(3,partida.getBabaCreator());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("sql PRI PARTIDA " + e.getMessage());
        }
    }

    public static void addMomaReportTODB(String name, String currentVeg, int veggiesNumber,int age) throws SQLException {
        try {
            if(exist(name) && existVeg(currentVeg,name)){
                // update value to current moma
                updateValue(name,currentVeg,veggiesNumber);
            }else{
                addMoma(name,currentVeg,veggiesNumber,age);
            }
        } catch (SQLException e) {
            System.out.println("sql MOMA " + e.getMessage());
        }
    }

    private static void addMoma(String name, String currentVeg, int veggiesNumber,int age) throws SQLException {
        String sql = "INSERT INTO nabrano (moma_name, veggie_name, quantity,godini) VALUES (?,?,?,?)";
        PreparedStatement ps =c.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,currentVeg);
        ps.setInt(3,veggiesNumber);
        ps.setInt(4,age);
        ps.executeUpdate();
    }

    private static void updateValue(String name, String currentVeg, int veggiesNumber) throws SQLException {
        String sql = "UPDATE nabrano SET quantity = quantity + ? WHERE veggie_name = ? AND moma_name = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,veggiesNumber);
        ps.setString(2,currentVeg);
        ps.setString(3,name);
        ps.executeUpdate();
    }

    private static boolean existVeg(String currentVeg, String name) throws SQLException {
        Connection c = DBManager.INSTANCE.getConnection();
        String sql = "SELECT veggie_name FROM nabrano WHERE veggie_name = ? AND moma_name = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1,currentVeg);
        ps.setString(2,name);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    private static boolean exist(String name) throws SQLException {
        Connection c = DBManager.INSTANCE.getConnection();
        PreparedStatement ps = c.prepareStatement("SELECT * from nabrano WHERE moma_name = ?");
        ps.setString(1,name);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static void makeOtcherForMomci(String name, int processingTime) {
        try {
            StringBuffer buffer = new StringBuffer();
            PrintStream ps = new PrintStream(new FileOutputStream("otchet.txt", true));
            if (!momciNames.contains(name)) {
                momciNames.add(name);
                ps.println(name + " -> " + processingTime);
                ps.flush();
            }else{
                // add seconds to current seconds
//                Scanner sc = new Scanner("otchet.txt");
//                System.out.println(sc.findAll(name));
            }
        } catch (FileNotFoundException e) {
            System.out.println("lalala");
        }
    }

    void createStatistics() throws SQLException {
        momaWithMostGetVeggies();
        laziesMomuk();
        partidi();
        mostTakenVegg();
        mostProductiveBaba();
    }

    private void mostProductiveBaba() throws SQLException {
        String sql = "SELECT baba_name FROM lutenica GROUP BY baba_name ORDER BY SUM(quantity) DESC LIMIT 1;";
        Statement st = c.createStatement();
        // ps needs SQL
        // st create statement and then st.execute priema sql
        // ps.execute
//        PreparedStatement ps = c.prepareStatement(sql);
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            System.out.println("Most productive baba is " + rs.getString("baba_name"));
        }
    }

    private void mostTakenVegg() throws SQLException {
        String sql = "SELECT veggie_name FROM nabrano  GROUP BY veggie_name ORDER BY SUM(quantity) DESC LIMIT 1";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            System.out.println("Most taken veggie is " + rs.getString("veggie_name"));
        }
    }

    private void partidi() {

    }

    private void laziesMomuk() {

    }

    private void momaWithMostGetVeggies() throws SQLException {
        String sql = "SELECT moma_name,godini FROM nabrano ORDER BY quantity DESC LIMIT 1";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(sql);
        String moma =" ";
        int age = 1;
        while(rs.next()) {
            moma = rs.getString("moma_name");
            age = rs.getInt("godini");
        }
        System.out.println("Moma name " + moma + " godini " + age);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println(" STATISKITE IDVAI ---------------- ");
                createStatistics();
            } catch (InterruptedException e) {
                System.out.println("lalala");
            } catch (SQLException e) {
                System.out.println("SQL GRESHKA " + e.getMessage());
            }
        }
    }
}
