public class TukarData{
    public static void main(String[] args){

        // String a = "Merah";
        // String b = "Biru";
        // String c;

        // c = a;
        // a = b;
        // b = c;

        // System.out.println("A isinya " + a); // A isinya Biru
        // System.out.println("B isinya " + b); // B isimya Merah


        int a = 1;
        int b = 10;

        b += a;
        a = b - a;
        b -= a;

        System.out.println("A isinya " + a); // A isinya 10
        System.out.println("B isinya " + b); // B isimya 1

    }

}