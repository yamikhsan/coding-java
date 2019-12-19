public class Main{
    public static void main(String[] args){
        // System.out.println("Hello");

        // Car bmw = new Car("BMW i3000");
        // bmw.forward();

        // Test String[] args
        // if(args.length > 0){
        //     for(String a: args){
        //         System.out.println(a);
        //     }
        // } else {
        //     System.out.print("args tidak boleh kosong");
        // }

        // try {
            
        //     if(args.length == 1){

        //         final int parm = Integer.parseInt(args[0]);
        //         final String status = primary(parm) ? "Primer" : "Bukan Primer";
        //         System.out.println(status);

        //     }else{
        //         System.out.println("data harus 1 tidak boleh lebih atau kurang");
        //     }
            
        // } catch (Exception e) {
        //     System.out.println("type data harus int");
        // }

        boolean isCheck =  false;
        String a = "ali";
        if(a=="alo"){
            isCheck = true;
        }
        System.out.println(isCheck);
    }

    public static boolean primary(int parm){

        boolean status = true;

        if(parm > 1){

            int nilai = parm;
            nilai--;
            while (nilai > 1) {
                if(parm % nilai == 0){
                    status = false;
                    break;
                }
                nilai--;
            }

        }

        return status;
    }

}