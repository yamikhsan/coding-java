public class Mobil{
    
    private boolean mesin = false;
    private String merk;
    private String warna;
    private int platNomor;
    private int jmhKursi;


    public void hidupMesin(){
        this.mesin = true;
    }

    public void maju(){
        if(mesin){
            System.out.println("Mobil Maju");
        }
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setPlatNomor(int platNomor){
        this.platNomor = platNomor;
    }

    public void setJmlKursi(int jmhKursi){
        this.jmhKursi = jmhKursi;
    }

    public String getMerk(){
        return merk;
    }

    public String getWarna(){
        return warna;
    }

    public int getPlatNomor(){
        return platNomor;
    }

    public int getJmhKursi(){
        return jmhKursi;
    }

}