public class DemoText {
    public static void main(String[] args) {
//        String text = "OpaO tropa mopa dopa";
//        String[] textArr = {"text", "mext", "next"};
//        StringBuilder sb = new StringBuilder("Ala bala nica ");
//        System.out.println(sb.charAt(5));
//        System.out.println(text.toCharArray());
//
//        String joinText = String.join(":",textArr);
//        System.out.println(joinText);
//
        String text= "Osem Osem Kosem bosem";
        String[] splitText = text.split(" ");

        for(int i=0; i< splitText.length;i++){
            for(int j = i+1; j< splitText.length; j++){
                if(splitText[i].equals(splitText[j])){
                    System.out.println("Ima ednakvi dumi");
                }
            }
        }

    }

}
