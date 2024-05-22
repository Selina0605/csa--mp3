import java.util.*;
public class Main {
  public static void main(String[] args) {
    System.out.println("2024 Q3!");
    ArrayList<String> word1 = new ArrayList<String>();
    word1.add("an");
    word1.add("band");
    word1.add("band");
    word1.add("abandon");
    WordChecker w1 = new WordChecker(word1);
    System.out.println(w1.isWordChain());
    
    ArrayList<String> word2 = new ArrayList<String>();
    word2.add("catch");
    word2.add("bobcat");
    word2.add("catchacat");
    word2.add("cat");
    word2.add("at");
    WordChecker w2 = new WordChecker(word2);
    System.out.println(w2.createList("catch"));
    
  }

}
