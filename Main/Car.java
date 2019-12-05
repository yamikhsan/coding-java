public class Car{

    private String merk;

    public Car(String merk){
        this.merk = merk;
    }

    public void forward(){
        System.out.println("Mobil " + merk + "maju kedepan");
    }

}