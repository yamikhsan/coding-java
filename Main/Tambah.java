public class Tambah{
    public static void main(String[] args){
        if(args.length == 2){

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int res = num1 + num2;
            System.out.print(res);
            
        }else{
            System.out.print("args harus 2");
        }
    }
}