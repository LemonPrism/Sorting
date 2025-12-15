
public class insertionSort
{
    public static void main ( String []args){

        int[] arr = {64, 25, 12, 22, 11};

        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void insertionSort (int []arr){
        int temp; 

        for ( int i = 1; i < arr.length; i ++ ) {
            temp = arr[i]; 

            for ( int b = i-1; b < arr.length; b++){
                if ( arr[b] < temp ){
                    arr[b+1] = arr[b]; 
                    b--;

                }

                arr[b+1] = temp; 

            }

        }
    }
}
