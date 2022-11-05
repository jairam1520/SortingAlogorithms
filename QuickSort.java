import java.util.*;
import java.lang.*;
import java.io.*;


class QuickSort {
    public static void main(String[] args) {
        int arr[]={23,21,4,14,4,9};
        int n=arr.length;
        int low=0;
        int high=n-1;
        
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void quickSort(int[]arr,int low,int high){
        
        if(low<high){
            //get the pivot index( which will be sorted )
            int p = partition(arr,low,high);
            
            //repeat the partition for left and rigth array
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
            
        }
    }
    public static int partition(int[] arr,int low,int high){
        //set pivot as last element
        int pivot=arr[high];
        
        //keeps track of element greater than pivot
        int j=low;
        //keeps track of element lesser than pivot
        int i=low;
        
        //shift element lesser then pivot to its left
        //shift element greater then pivot to its right
        
        while(j<high){
            if(arr[j]>=pivot){
                j++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        //bring pivot to its correct index
        swap(arr,i,high);
        
        //return pivot index
        return i;
       
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
