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

  public static void main(String[] args) {
    System.out.println(Arrays.toString(indexesOfAll("attack", "b")));
    // testing of static methods goes here

  }
}