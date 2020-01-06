import java.util.*;

public class Parking{

    private int no, type, in, out, diff, total;
    private String nameType;

    public static void main(String[] args) {
        
        Parking parking = new Parking();
        parking.onCreate();

    }

    private void onCreate(){

        for(int i = 0; i<2; i++ ){
            
            input();
            process();
            output();

        }

    }

    private void input(){
        Scanner scan = new Scanner(System.in);

        try {
            
            print("Plat Nomor               : ");
            no = scan.nextInt();
            
            print("Jenis Kendaraan [1/2]    : ");
            type = scan.nextInt();

            print("Jam Masuk                : ");
            in = scan.nextInt();

            print("Jam Kelur                : ");
            out = scan.nextInt();

        } catch (Exception e) {
            println("Type Data Harus Int");
            println(e.getMessage());
        }
    }

    private void process(){

        if(in > out){
            out += 24;
        }

        diff = out - in;
        if(diff == 0){
            diff = 1;
        }
        
        if(type == 1){

            nameType = "Mobil";
            total = count(5000, 3000); 

        } else if(type == 2){ 

            nameType = "Motor";
            total = count(3000, 1500);

        } else {
            nameType = "tipe tidak trsedia";
            total = 0;
        }

    }

    private int count(int first, int last){
        int res = first;
        if(diff > 1){
            res += (diff - 1) * last;
        }

        return res;
    }

    private void output(){

        println("\nTerima Kasih telah melakukan transaksi dengan rincian sebagai berikut");
        println("Plat Nomor         : " + no);
        println("Jenis Kendaraan    : " + nameType);
        println("Lama Parkir        : " + diff);
        println("Total Bayar        : " + total);
        println("Semoga pelayanan kami memuaskan\n");

    }

    private void println(Object obj){
        System.out.println(obj);
    }

    private void print(Object obj){
        System.out.print(obj);
    }
    
}