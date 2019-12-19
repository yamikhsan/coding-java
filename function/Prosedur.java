import java.lang.System;

public class Prosedur{
    public static void main(String[] args){

        countSquare(5, 4);

    }

    public static void countSquare(double p, double l){
        double result = p * l;
        print(result);
    }

    public static void println(Object obj){
        System.out.println(obj);
    }

    public static void print(Object obj){
        System.out.print(obj);
    }

}