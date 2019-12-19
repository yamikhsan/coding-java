public class App{
    public static void main(String[] args) {
        Mobil bmw = new Mobil();
        bmw.setMerk("BMW");
        System.out.println("Merk = " + bmw.getMerk());
        bmw.hidupMesin();
        bmw.maju();

        // Mobil ferrari = new Mobil();
        // ferrari.setMerk("Ferrari");
        // System.out.println("Merk = " + ferrari.getMerk());
    }
}