import java.util.Scanner;

public class Methoden1 {


    public static void main(String[] args) {
        summe(4, 6);
        summe1(4,6);
        stringLength("StringMitMehrAls20Characters");
        checkStrForFancy("fancyis");
        andererMethodenAufruf();
        summeScanner();



    }

    public static void summe(int a, int b){
        int summe = a + b;
        System.out.println(summe);
    }
    public static void summe1(int a, int b){
        System.out.println("Summe:"+(a+b));
    }

    public static void groeßerAls(int a, int b){
        if(a > 100 || b > 100){
            System.out.println("a oder b ist groeßer als 100");
        }
    }

    public static void summeScanner(){
        int summe = 0;

        Scanner scanner = new Scanner(System.in);
        int zahl1 = Integer.parseInt(scanner.next());
        int zahl2 = Integer.parseInt(scanner.next());
        summe = zahl1 + zahl2;

        System.out.println("Summer der beiden Zahlen: "+summe);
    }

    public static void stringLength(String s){
        if(s.length() > 20){
            System.out.println("Der übergebene String hat mehr als 20 Chars!");
        }
        else{
            System.out.println("Der übergebene String hat weniger als 20 Chars!");
        }
    }

    public static void checkStrForFancy(String s){
        if(s.contains("fancy")){
            System.out.println("String contains the partial string");
        }
        else{
            System.out.println("Enthält den Teilstring nicht!");
        }
    }


    public static int tripleSeven(){

        return 777;
    }

    public static void andererMethodenAufruf(){
        System.out.println("Route "+tripleSeven());
    }


}
