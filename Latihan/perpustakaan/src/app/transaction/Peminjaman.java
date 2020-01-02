package app.transaction;

import java.util.*;
import java.text.SimpleDateFormat;

import app.data.*;

public class Peminjaman{

    private String kode;
    private HashMap<String, Buku> books = new HashMap<>();

    public Peminjaman(Member member){
        setKode(member);
    }

    public String getKode() {
        return kode;
    }

    private void setKode(Member member) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        String fmt = format.format(today);
        this.kode = member.getName() + "-" + fmt;
    }

    public HashMap<String, Buku> getBooks() {
        return books;
    }

    public void addBook(Buku buku){
        this.books.put(buku.getISBN(), buku);
    }

    public Buku getBook(String isbn){
        return books.get(isbn);
    }

}