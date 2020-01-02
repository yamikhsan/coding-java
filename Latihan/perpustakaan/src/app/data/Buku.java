package app.data;

public class Buku{

    private String judul, ISBN, penulis, penerbit;
    private int jmhHalaman, tahun, stock;

    public Buku(){

    }

    public Buku(final String judul, final String iSBN, final String penulis, final String penerbit,
            final int jmhHalaman, int tahun, int stock) {
        this.judul = judul;
        ISBN = iSBN;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jmhHalaman = jmhHalaman;
        this.tahun = tahun;
        this.stock = stock;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(final String judul) {
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(final String iSBN) {
        ISBN = iSBN;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(final String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(final String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJmhHalaman() {
        return jmhHalaman;
    }

    public void setJmhHalaman(final int jmhHalaman) {
        this.jmhHalaman = jmhHalaman;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void diPinjam(){
        this.stock--;
    }

}