import java.util.*;
import java.lang.*;
import java.io.*;


class InsertionSort {
    public static void main(String[] args) {
        int arr[]={23,21,4,14,9,4};
        int n=arr.length;
        
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr,int n){
        
       
       //ith index kepps track of unsorted part
        for(int i=1;i<n;i++){
            int current=arr[i];
            
            //jth index keeps tarck of sorted part
            int j=i-1;
            while(j>=0 && arr[j]>current){
                //shifting greater elements one index ahead in sorted part
                //so that new element can be accomodated
                arr[j+1]=arr[j];
                j--;
            }
            //insertion of current element at correct index in sorted part
            arr[j+1]=current;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
