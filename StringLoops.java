public class StringLoops {

  // static methods go here
  public static String reverseCharacters(String str){
    int index = str.length();
    String newWord = "";
    for(index = str.length(); index >= 0; index --){
      if(index == str.length()){
        newWord += str.substring(index);
      }
      else{
        newWord += str.substring(index, index +1);
      }
    }
    
    return newWord;

  }

  public static void indexesOfAll(String str, String searchTerm){
    int[] value = new int [] {};
    int index = 0;
    for(index = 0; index <= str.length();index ++){
      if(str.substring(index, index + 1) .equals(searchTerm)){
        value[index] = index;
      }
    }
    
  }
  public static void main(String[] args) {
    System.out.println(reverseCharacters("taco cat"));
    // testing of static methods goes here

  }
}