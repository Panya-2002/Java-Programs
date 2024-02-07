
import java.util.Scanner;
 class bubb{

    public static void printinfo(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
         System.out.println("Please Enter the elements of Array:");
         
         for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
         }
         
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;

                }
                
            }
        }
        printinfo(arr);
    }

 }