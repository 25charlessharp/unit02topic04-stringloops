import java.util.Arrays;

public class StringLoops {

  // static methods go here
  public static String reverseCharacters(String str) {
    int index = str.length();
    String newWord = "";
    for (index = str.length(); index >= 0; index--) {
      if (index == str.length()) {
        newWord += str.substring(index);
      } else {
        newWord += str.substring(index, index + 1);
      }
    }

    return newWord;

  }

  public static int[] indexesOfAll(String str, String searchTerm) {
    int index = 0;
    int count = 0;
    for (index = 0; index < str.length(); index++) {
      if (str.substring(index, index + 1).equals(searchTerm)) {
        count++;
      }
    }
    int arrayPlace = 0;
    int[] value = new int[count];
    for (index = 0; index < str.length(); index++) {
      if (str.substring(index, index + 1).equals(searchTerm)) {
        value[arrayPlace] = index;
        arrayPlace ++;
      }
    }

    return value;
  }


  public static boolean hasRepeatedConsectutives(String str){
    boolean value = false;
    int index = 0;
    for(index = 0; index < str.length()-1; index ++){
      if(str.substring(index, index + 1).equals(str.substring(index + 1, index + 2))){
        value = true;
      }
    }
    return value;
  }
  
  public static String reverseWords(String str){
    String str2 = " " + str + " ";
    String backword = "";
    int index = 0;
    int start = 0;
    for(index = 0; index < str2.length(); index++){
      if(str2.substring(index, index + 1).equals(" ")){
        backword = str2.substring(start, index) + ""+ backword;
        start = index;
      }
    }
    return backword;
  }
  public static void main(String[] args) {
    System.out.println(reverseWords("the quick brown fox"));
    // testing of static methods goes here

  }
}