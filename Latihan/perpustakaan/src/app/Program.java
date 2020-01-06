package app;

import app.data.Buku;
import app.data.Member;
import app.transaction.*;
import java.util.*;

public class Program{  
    
    private static HashMap<Integer, Member> data = new HashMap<>();
    
    public static void main(String[] args) {
        
        member();
        buku();   
    
    }

    private static void member(){

        Member member1 = new Member(1, "Budi", "Male", "Yogyakarta");
        Member member2 = new Member(2, "Nina", "female", "Bandung");

        data.put(member1.getId(), member1);
        data.put(member2.getId(), member2);

        // for (int i : data.keySet()) {
        //     Member member = data.get(i);

        //     println("Id         : " + member.getId());
        //     println("Name       : " + member.getName());
        //     println("Gender     : " + member.getGender());
        //     println("Address    : " + member.getAddress());
        //     println("");

        // }

    }

    private static void buku(){
        Buku buku1 = new Buku("The Power of Habit", "069286", "Charles Duhigg", "Random House Trade Paperbacks", 371, 2014, 50);
        Buku buku2 = new Buku("Big Magic", "851846", "Elizabeth Gilbert", "Mizan Kaifa", 280, 2016, 29);

        HashMap<String, Buku> lemari = new HashMap<>();
        HashMap<String, Peminjaman> daftarTransaksi = new HashMap<>();

        lemari.put(buku1.getISBN(), buku1);
        lemari.put(buku2.getISBN(), buku2);

        for (String i : lemari.keySet()) {
            Buku buku = lemari.get(i);
            println("Judul          : " + buku.getJudul());
            println("ISNB           : " + buku.getISBN());
            // println("Penerbit       : " + buku.getPenerbit());
            // println("Penulis        : " + buku.getPenulis());
            // println("Jumlah Halaman : " + buku.getJmhHalaman());
            // println("Tahun          : " + buku.getTahun());
            println("Stock          : " + buku.getStock());
            println("");
        }
        
        Scanner scan = new Scanner(System.in);
        
        Member member = data.get(1);
        Peminjaman pinjam = new Peminjaman(member);
        println(pinjam.getKode());

        boolean run = true;
        while(run){

            print("Masukkan ISBN = ");
            String isbn = scan.nextLine();
    
            if(lemari.containsKey(isbn)){
                Buku buku = lemari.get(isbn);
                buku.diPinjam();
                pinjam.addBook(buku);
                println("Buku " + pinjam.getBook(isbn).getJudul() + " berhasil ditambah dtransaksi");
            } else {
                println("Failed");
            }

            print("Apa anda ingin lanjut meminjam? [y/n] : ");
            String answer = scan.nextLine();
            
            if(answer.equalsIgnoreCase("n")){
                run = false;
            }
        }

        HashMap<String, Buku> books = pinjam.getBooks();
        if(books.size() > 0){
            for(String key: books.keySet()){
                println("");
                println("Judul  = " + books.get(key).getJudul());
                println("ISBN  = " + books.get(key).getISBN());
            }

            print("Apa anda yakin untuk meminjam ? [y/n] : ");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("y")){
                daftarTransaksi.put(pinjam.getKode(), pinjam);
                println("success");
            } else {
                print("gagal");
            }

        } else {
            println("Anda tidak memesan apa-apa");
        }

    }

    private static void println(Object obj){
        System.out.println(obj);
    }

    private static void print(Object obj){
        System.out.print(obj);
    }
}