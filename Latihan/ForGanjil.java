public class ForGanjil{
    public static void main(String[] args){
        int[] data = {10,34,5,23,6,7,55,20,260,273,333};
        for (int d : data) {
            if(d%2==1){
                System.out.println(d);
            }
        }
    }
}