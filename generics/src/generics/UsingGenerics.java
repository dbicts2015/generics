package generics;

import java.util.ArrayList;

public class UsingGenerics {
  public static void main(String[] args){
      // voor Java 5.0:
      ArrayList lijst = new ArrayList();
      lijst.add(new String("hallo"));
      lijst.add(new Integer(5));
      for(Object o:lijst){
          System.out.println(o);
      }
      
      // sinds Java 5.0, met generics:
      ArrayList<Integer> lijst2 = 
              new ArrayList<Integer>();
//      lijst2.add(new String("hallo"));  // niet toegelaten (compileerfout)
      lijst2.add(new Integer(5));
      for(Integer o:lijst2){
          System.out.println(o);
      }      
      
//      ArrayList<int> lijst3 =
//            new ArrayList<int>();  // compileerfout; parameter type mag GEEN primitief type zijn
      
      // sinds java 7 (type inference):
      ArrayList<String> stringLijst = new ArrayList<>();
  }
}
