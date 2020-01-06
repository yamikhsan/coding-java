import java.util.Scanner;

public class Tiket{

    private String nama, rute, kelas, jmhKursi;
    private int harga, total;
    private String pesan = "Silahkan membayar di minimarket terdekat";

    public static void main(String[] args) {
        
        new Tiket();

    }

    Tiket(){

        for(int i=0; i<2; i++){
            
            masukkan();
            proses();
            keluaran();

        }

    }

    private void masukkan(){
        Scanner scan = new Scanner(System.in);

        print("Nama pemesan     : ");
        nama = scan.nextLine();

        print("Rute bis [1/2/3] : ");
        rute = scan.nextLine();

        print("Kelas [AC/NA]    : ");
        kelas = scan.nextLine();

        print("Jumlah kursi     : ");
        jmhKursi = scan.nextLine();

    }

    private void proses(){

        switch (rute) {
            case "1":
                rute = "Jakarta - Bandung";
                harga = getHarga(130000, 90000);
                break;

            case "2":
                rute = "Bandung - Jakarta";
                harga = getHarga(150000, 70000);
                break;

            case "3":
                rute = "Jakarta - Tasikmalaya";
                harga = getHarga(70000, 50000);
                break;
        
            default:
                pesan = "Rute tidak tersedia";
                harga = 0;
                break;
        }

        int jmh = Integer.parseInt(jmhKursi);
        total = harga * jmh;

    }

    private int getHarga(int ac, int na){
        int res;
        if(kelas.equalsIgnoreCase("ac")){
            res = ac;
        } else if(kelas.equalsIgnoreCase("na")){
            res = na;
        }
        else {
            pesan = "kelas tidak tersedia";
            res = 0;
        }

        return res;
    }

    private void keluaran(){

        println("\nTerima Kasih telah memesan tiket bis dengan rincian sebagai berikut");
        println("Nama           : " + nama);
        println("Rute           : " + rute);
        println("Kelas          : " + kelas);
        println("Harga Satuan   : " + harga);
        println("Jumlah Kursi   : " + jmhKursi);
        println("Total Bayar    : " + total);
        println(pesan + "\n");

    }

    private void println(Object obj){
        System.out.println(obj);
    }

    private void print(Object obj){
        System.out.print(obj);
    }

}