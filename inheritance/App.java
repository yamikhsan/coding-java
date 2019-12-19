public class App{
    public static void main(String[] args) {

        // Musisi apel = new Musisi();
        // aple.nama = "Apel";
        // aple.menyayi();
        // System.out.println(" ");

        Pianis banana = new Pianis();
        banana.setNama("Banana");
        banana.menyayi();
        banana.bacaNada();
        banana.mainPiano();
    }
}

class Musisi{
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    protected void menyayi(){
        System.out.println(this.nama + " menyayi...");
    }

    protected void bacaNada(){
        System.out.println(this.nama + " bacaNada...");
    }

}

class Pianis extends Musisi{
    void mainPiano(){
        System.out.println(getNama() + " mainPiano...");
    }
}