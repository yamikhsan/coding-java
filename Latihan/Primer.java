public class Primer{
    public static void main(String[] args){

        if(args.length > 0){

            try {
                
                // final int num = Integer.parseInt(args[0]);

                // if(num < 1){

                //     System.out.println("data tidak bisa diterima");

                // } else {

                //     boolean status = true;
    
                //     if(num > 1){
    
                //         for(int i=num-1; i>1; i--){
                //             if(num % i == 0){
                //                 status = false;
                //                 break;
                //             }
                //         }
    
                //     }
    
                //     final String result = status? "Primer": "Non Primer";
    
                //     System.out.println(num + " => " + result);
                    
                // }

                // if(args.length > 1){
                //     System.out.println("cukup input 1 data int");
                // }

                for(String arg: args){

                    int num = Integer.parseInt(arg);
                    String res = checkPrimer(num);
                    System.out.println(num + " => " + res);

                }

            } catch (Exception e) {
                System.out.println("type data harus int");
            }


        } else {
            System.out.println("argument harus diisi");
        }

    }

    private static String checkPrimer(int num){

        if(num < 1){

            return "data tidak bisa diterima";
            
        } else {

            boolean status = true;

            if(num > 1){

                for(int i=num-1; i>1; i--){
                    if(num % i == 0){
                        status = false;
                        break;
                    }
                }

            }

            String result = status? "Primer": "Non Primer";

            return result;
            
        }

    }

}