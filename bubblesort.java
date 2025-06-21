// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;

class myTry {
static void bubbleSort(int arr[], int a){
    
    int j, i, temp;
    boolean swapped;
    
    for (i = 0; i < a - 1; i++){
        swapped = false;
        for (j = 0; j < a - i - 1; j++){
            if (arr[j] > arr[j + 1]){
                
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (swapped == false)
                break;
    }
}

    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
}

    public static void main(String args[]) {
        int arr[] = {14, 2, 27, 48, 31, 19};
        int a = arr.length;
        bubbleSort(arr, a);
        System.out.println("Sorted array: ");
        printArray(arr, a);
    }
}
