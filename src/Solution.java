import java.util.*;
import java.text.NumberFormat;
import java.lang.*;

public class Solution {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        //System.out.println(currency.format(value));
        System.out.print("US: "+currency.format(value)+"\n");
        currency = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.print("India: "+currency.format(value)+"\n");
        currency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.print("China: "+currency.format(value)+"\n");
        currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.print("France: "+currency.format(value)+"\n");

        currency.format(value);
}
}
