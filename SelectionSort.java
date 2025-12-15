
public class SelectionSort
{

    public static void main (String [] args){

        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }

    public static void selectionSort( int[] arr) {

        int min= 0 ; 
        int temp= 0 ; 

        for ( int i =0; i < arr.length; i ++){
            min = arr [ i ]; 
            int minI = i; 

            for ( int j = i+1; j < arr.length; j++){
                if ( arr [ j ] < arr[minI]) {
                    minI = j; 

                }
            }

            temp = arr[ i ]; 

            arr[i] = arr[minI];
            arr[minI] = temp;

        }

    }
    
}