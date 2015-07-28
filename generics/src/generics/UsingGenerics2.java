package generics;

import java.util.ArrayList;
import java.util.List;

public class UsingGenerics2 {
    
    public static void main(String[] args){
        // class B;class D extends B => toekenning B<T> = D<T> toegelaten, b.v.:
        List<String> stringLijst = new ArrayList<String>();
        stringLijst.add("een");
        stringLijst.add("twee");
        stringLijst.add("drie");
        String s = stringLijst.get(0);
        
        List<Object> objectLijst;
//        objectLijst = stringLijst; // compileerfout;
        
        
//        if(stringLijst instanceof List<String>) // compileerfout !
        // (at run-time is er geen type List<String>)
        if(stringLijst instanceof List){
            System.out.println("stringLijst is een List");
        }
        else{
             System.out.println("stringLijst is geen List");
        }
        
        // gebruik van een subklasse van een generische klasse:
        StringLijst stringLijst2 = new StringLijst();
        stringLijst2.add("en da we toffe jongens zijn ...");
        stringLijst = stringLijst2;
    }
}


// een generische klasse kan gebruikt worden als basisklasse
// van een al dan niet generische subklasse.
// als de subklasse niet generisch is, moet ze een bepaalde instantie
// van de generische klasse uitbreiden, b.v.:
class StringLijst extends ArrayList<String>{}

// generische subklasse willen afleiden van een generische basisklasse:
class SpecialeLijst<T> extends ArrayList<T>{}
