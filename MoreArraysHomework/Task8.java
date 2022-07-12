public class Task8 {
    /*
    8. Напишете програма, която за матрица от булеви стойности,
проверява дали се съдържа елемент със стойност true над
втория диагонал.
     */
    public static void main(String[] args) {
        boolean[][] matrix ={
                {false,false,false,false},
                {false,true,true,false},
                {false,true,true,false},
                {true,false,true,false}
        };

        boolean thereIsTrueValue = false;

        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                if(i + j < matrix.length - 1 && matrix[i][j]){
                    thereIsTrueValue = true;
                }
            }
        }
        System.out.println(thereIsTrueValue ? "true value" : "No true value");
    }
}
