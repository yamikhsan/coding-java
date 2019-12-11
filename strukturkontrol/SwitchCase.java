public class SwitchCase{
    public static void main(String[] args){

        if(args.length > 0){
            try {

                final int day = Integer.parseInt(args[0]);

                switch (day) {
                    case 1:
                        System.out.println("Minggu");
                        break;
                    case 2:
                        System.out.println("Senin");
                        break;
                    case 3:
                        System.out.println("Selasa");
                        break;
                    case 4:
                        System.out.println("Rabu");
                        break;
                    case 5:
                        System.out.println("Kamis");
                        break;
                    case 6:
                        System.out.println("Jum'at");
                        break;
                    case 7:
                        System.out.println("Sabtu");
                        break;
                    default:
                        System.out.println("Hari tidak dikenali");
                        break;
                }

                if(args.length > 1){
                    System.out.println("Data yang diambil hanya index pertama");
                }
                
            } catch (Exception e) {
                System.out.println("harus type data int");
            }
        }

    }
}