import java.util.Scanner;

public class LoopWhile{
    public static void main(String[] args){
        
        // int battery = 0;

        // do{
        //     System.out.println("Hp On");
        //     battery--;
        // } while(battery > 0);

        boolean run = true;
        while(run){

            Scanner scan = new Scanner(System.in);
            System.out.println("Pilih y untuk lanjut");
            System.out.println("Pilih n untuk berhenti");
            String i = scan.nextLine();
            switch (i) {
                case "y":
                System.out.println("Lanjut");
                    break;

                case "n":
                    run = false;
                    break;
            
                default:
                    System.out.println("Lanjut");
                    break;
            }

        }

    }
}