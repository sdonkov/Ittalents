package liutenica;

import java.time.LocalDate;
import java.util.Date;

public class Partida {
    private int kilos;
    private LocalDate date;
    private String babaCreator;

    Partida(int kilos, LocalDate date,String babaCreator){
        this.kilos = kilos;
        this.date = date;
        this.babaCreator = babaCreator;
    }

    public int getKilos() {
        return kilos;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getBabaCreator() {
        return babaCreator;
    }
}
