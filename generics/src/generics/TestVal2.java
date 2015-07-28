package generics;

import bse.Muis;

public class TestVal2 {
    public static void main(String[] args){
        Val2<Muis> val = new Val2<Muis>();
        val.vang(new Muis());
        val.vang(new Muis());
        val.vang(new Muis());
        val.vang(new Muis());
        System.out.println(val.aantalGevangenen());  // 3
        Muis minnie = val.bevrijd();  // bevrijd ding dat laatst gevangen werd
        minnie = val.bevrijd();  // bevrijd ding dat laatst gevangen werd
        System.out.println(val.aantalGevangenen());   // 2
        val.open();  // bevrijd alles
        System.out.println(val.aantalGevangenen());  // 0
    }
}
