public class Sort{
    public static void main(String[] args){
        int[] data = {3, 10, 5, 50, 51, 2, 4, -2, 6};

        for(int i=0; i<data.length; i++){

            int min = i;
            for(int j=min; j<data.length; j++){
                if(data[min] > data[j]){
                    min = j;
                }
            }

            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }

        for(int d: data){
            System.out.print(d + " ");
        }

    }
}