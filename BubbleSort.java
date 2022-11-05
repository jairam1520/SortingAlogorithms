import java.util.*;
import java.lang.*;
import java.io.*;


class BubbleSort {
    public static void main(String[] args) {
        int arr[]={23,21,4,14,9,4};
        int n=arr.length;
        
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr,int n){
        
        for(int i=0;i<n-1;i++){
            
            
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap jth and j+1 th index
                    swap(arr,j,j+1);
                }
            }
            //element at last index will be sorted after inner loop is executed
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
