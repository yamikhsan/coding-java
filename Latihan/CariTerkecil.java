public class CariTerkecil{
    public static void main(String[] args){
        int[] data = {10,34,5,23,6,7,55,20,260,273,333};

        // for (int i : data) {
        //     boolean terkecil = true;
        //     for (int j : data) {
        //         if(j<i){
        //             terkecil = false;
        //             break;
        //         }
        //     }
        //     if(terkecil){
        //         System.out.print(i);
        //         break;
        //     }
        // }

        int id_terbesar = 0;
        int id_terkecil = 0;

        for (int i=0; i<data.length; i++) {
            if(data[id_terkecil]>data[i]){
                id_terkecil = i;
            }
            if(data[id_terbesar]<data[i]){
                id_terbesar = i;
            }
        }

        System.out.println("Terkecil = " + data[id_terkecil]);
        System.out.println("Terbesar = " + data[id_terbesar]);

    }
}