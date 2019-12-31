package app.data;

public class Buku{

    private String judul, ISBN, penulis, penerbit;
    private int jmhHalaman;

    public Buku(){

    }

    public Buku(String judul, String iSBN, String penulis, String penerbit, int jmhHalaman) {
        this.judul = judul;
        ISBN = iSBN;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jmhHalaman = jmhHalaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJmhHalaman() {
        return jmhHalaman;
    }

    public void setJmhHalaman(int jmhHalaman) {
        this.jmhHalaman = jmhHalaman;
    }

    @Override
    public String toString(){
        return "judul = " + judul + "\n" + "ISBN = " + ISBN + "\n" + "Penulis = " + penulis + "\n" + "Penerbit = " + penerbit + "\n" + "Jumlah Halaman = " + jmhHalaman;
    }

}