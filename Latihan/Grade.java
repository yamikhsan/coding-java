public class Grade{
    public static void main(String[] args){
        try {

            int num = Integer.parseInt(args[0]);
            if(num > 100 || num < 0){

                System.out.println("nilai tidak valid");
                
            }else{
                
                if(num >= 85){
                    System.out.println("A");
                } else if(num >= 75){
                    System.out.println("B");
                } else if(num >= 65){
                    System.out.println("C");
                } else if(num >= 45){
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
            
        } catch (Exception e) {
            System.out.println("type data harus int");
        }
        
    }
}