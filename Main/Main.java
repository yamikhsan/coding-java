public class Main{
    public static void main(String[] args){
        // System.out.println("Hello");

        // Car bmw = new Car("BMW i3000");
        // bmw.forward();

        // Test String[] args
        if(args.length > 0){
            for(String a: args){
                System.out.println(a);
            }
        } else {
            System.out.print("args tidak boleh kosong");
        }
    }
}