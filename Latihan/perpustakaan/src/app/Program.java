package app;

import app.data.Buku;
import app.data.Member;
import java.util.HashMap;

public class Program{    
    public static void main(String[] args) {
        
        // buku();
        member();   
    
    }

    private static void member(){

        Member member1 = new Member(1, "Budi", "Male", "Yogyakarta");
        Member member2 = new Member(2, "Nina", "female", "Bandung");

        HashMap<Integer, Member> data = new HashMap<>();
        data.put(member1.getId(), member1);
        data.put(member2.getId(), member2);

        for (int i : data.keySet()) {
            Member member = data.get(i);

            println("Id         : " + member.getId());
            println("Name       : " + member.getName());
            println("Gender     : " + member.getGender());
            println("Address    : " + member.getAddress());
            println("");

        }

    }

    private static void buku(){
        Buku buku1 = new Buku("The Power of Habit", "9781400069286", "Charles Duhigg", "Random House Trade Paperbacks", 371);
        Buku buku2 = new Buku("Big Magic", "9786020851846", "Elizabeth Gilbert", "Mizan Kaifa", 280);

        HashMap<String, Buku> lemari = new HashMap<>();
        lemari.put(buku1.getISBN(), buku1);
        lemari.put(buku2.getISBN(), buku2);

        for (String i : lemari.keySet()) {
            Buku buku = lemari.get(i);
            println("Judul          : " + buku.getJudul());
            println("ISNB           : " + buku.getISBN());
            println("Penerbit       : " + buku.getPenerbit());
            println("Penulis        : " + buku.getPenulis());
            println("Jumlah Halaman : " + buku.getJmhHalaman());
            println("");
        }
    }

    private static void println(Object obj){
        System.out.println(obj);
    }
}