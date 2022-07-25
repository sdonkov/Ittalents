public class Task2 {

    public static void main(String[] args) {



        /*
        Write a method that takes a String variable that holds some text. The method must
        output the sentence with the longest word, the longest sentence and the number of sentences.
        It`s given that each sentence ends with a dot and each word is separated with a space.

        Example:
        Today is a good day for test. The sun is shining. The students are happy. The birds are blue.
         */

        partitionText("Today is a good day for test.The sun is shining.The students are happy.The birds are blue.");
    }

    static void partitionText(String text){
        String[] sentences = text.split("\\.");
        System.out.println(sentences.length);
        String longest = "";
        for (int i = 0; i < sentences.length; i++) {
            if(longest.length() < sentences[i].length()){
                longest = sentences[i];
            }
        }
        System.out.println("Longest sentence = " + longest);
        String longestWord = "";
        int longestSentenceIdx = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                if(words[j].length() > longestWord.length()){
                    longestWord = words[j];
                    longestSentenceIdx = i;
                }
            }
        }
        System.out.println("Sentence with longest word = " + sentences[longestSentenceIdx]);
    }

}
