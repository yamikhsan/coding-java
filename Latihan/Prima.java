public class Prima{
    public static void main(String[] args){

        // try {
                
        //     for(String arg: args){

        //         int num = Integer.parseInt(arg);
        //         cekPrima(num);

        //     }

        // } catch (Exception e) {
        //     System.out.println("harus ada inputan int");
        // }

        int[] data = {3, 10, 7, 11, 15, 16, 23, 50};
        for (int num : data) {
            
            boolean prima = true;

            if(num <= 1){

                prima = false;
                
            } else {

                for(int i=num/2; i>=2; i--){
                    if(num % i == 0){
                        prima = false;
                        break;                    
                    }
                }       
            }

            if(prima){
                System.out.println(num + " => Prima");
            }
            
        }

    }

    private static void cekPrima(int num){

        boolean prima = true;

        if(num <= 1){

            prima = false;
            
        } else {

            for(int i=num/2; i>=2; i--){
                if(num % i == 0){
                    prima = false;
                    break;                    
                }
            }       
        }

        if(prima){
            System.out.println(num + " => Prima");
        }

    }

}