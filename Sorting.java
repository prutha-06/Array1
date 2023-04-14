import java.util.*;
public class Sorting{
    public static void InsertionSortDescending(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr= arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        
        
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,4,5,2,7,1,1,6,9,8};
        InsertionSortDescending(arr);
        printArr(arr);
    }
}