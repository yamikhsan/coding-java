public class Prima{
    public static void main(String[] args){

        if(args.length > 0){

            try {
                
                for(String arg: args){

                    int num = Integer.parseInt(arg);
                    cekPrima(num);

                }

            } catch (Exception e) {
                System.out.println("type data harus int");
            }


        } else {
            System.out.println("argument harus diisi");
        }

    }

    private static void cekPrima(int num){

        String status = "prima";

        if(num <= 1){

            status = "bukan prima";
            
        } else {

            for(int i=num/2; i>=2; i--){
                if(num % i == 0){
                    status = "bukan prima";
                    break;                    
                }
            }       
        }

        System.out.println(num + " => " + status);

    }

}