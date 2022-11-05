import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class InsertionSort {
    public static void main(String[] args) {
        int arr[]={23,21,4,14,9,4};
        int n=arr.length;
        // 23,21,4,14,9,4
        // 4,21,4,14,9,23
        // 4,4,21,14,9,23
        // 4,4,9,14,21,23
        // 4,4,9,14,23,21
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr,int n){
        
        for(int i=0;i<n-1;i++){
            //i be the index for minimum element
            int minIndex=i;
            
            //start j from i+1 and check index having less value then ith index
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            
            //swap ith and jth index
            swap(arr,i,minIndex);
            
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
