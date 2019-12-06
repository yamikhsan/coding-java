public class Tambah{
    public static void main(String[] args){
        if(args.length == 2){
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int res = num1 + num2;
                System.out.print(res);
                
            } catch (Exception e) {
                System.out.println("harus type data int");
            }
            
        }else{
            System.out.print("args harus 2");
        }
    }
}