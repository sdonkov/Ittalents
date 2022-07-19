import java.util.Scanner;

public class TrainingExamTask2 {
      /*
    Write a method that takes a String variable that holds some text. The method must
    output the sentence with the longest word, the longest sentence and the number of sentences.
    It`s given that each sentence ends with a dot and each word is separated with a space.
    Example: Today is a good day for test. The sun is shining. The students are happy. The birds are blue.
    Output: Total sentences: 4
    Longest sentence: Today is a good day for test.
    Sentence with the longest word: The students are happy.
     */
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter text: ");
          String text = sc.nextLine();
          examMethod(text);
      }
      static void examMethod(String text){
          String[] sentences = text.split("\\.");
          int longestSentence = 0;
          int idx =-1;
          for(int i =0; i<sentences.length;i++){
              if(sentences[i].length() > longestSentence){
                  longestSentence = sentences[i].length();
                  idx= i;
              }
          }
          int maxWord=0;
          int countMax = 0;
          int indexMaxWord= -1;
          for(int i =0; i<text.length(); i++){
              if(text.charAt(i) != '.' && text.charAt(i) != ' '){
                  countMax++;
              }else{
                  if(countMax > maxWord){
                      maxWord = countMax;
                      indexMaxWord = i-maxWord;
                  }
                  countMax=0;
              }
          }
          String longestWord = text.substring(indexMaxWord, indexMaxWord + maxWord);
          for(int i=0; i<sentences.length; i++){
              if(sentences[i].contains(longestWord)){
                  System.out.println("Total sentences: " + sentences.length);
                  System.out.println("Longest sentence: " + sentences[idx]);
                  System.out.print("Sentence with longest word:");
                  System.out.print(sentences[i]);
                  System.out.print(".");
                  break;
              }
          }
      }
}
