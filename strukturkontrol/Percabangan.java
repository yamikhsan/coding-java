public class Percabangan{
    public static void main(String[] args){
        // boolean hujan = false;
        // if(hujan){
        //     System.out.println("bawa payung");
        // }else{
        //     System.out.println("tidak bawa payung");
        // }

        try {
            
            final int num = Integer.parseInt(args[0]);
        
        if(num > 60){
            System.out.println("A");
        } else if(num > 30){
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        } catch (Exception e) {
            
            System.out.println("harus masukan type data int");

        }
        
    }
}