public class CekGanjilGenap{
    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);
        int resNum = num%2;
        String hasil = resNum == 0 ? "Genap" : "Ganjil";

        System.out.println(num + " = " + hasil);
    }
}