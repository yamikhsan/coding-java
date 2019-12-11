public class ForEach{
    public static void main(String[] args){
        // for(int i=100; i>0; i-- ){
        //     System.out.println(i);
        // }

        int[] ganjil = {1, 3, 5, 7, 9, 11};

        for(int i=0; i<ganjil.length; i++){
            print(ganjil[i]);
        }

        print("-------------------");

        for (int i : ganjil) {
            print(i);
        }

        // print(1);
    }

    private static void print(Object obj){
        System.out.println(obj);
    }
}