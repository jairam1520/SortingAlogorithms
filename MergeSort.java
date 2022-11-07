import java.util.*;
import java.lang.*;
import java.io.*;


class MergeSort {
    public static void main(String[] args) {
        int arr[]={23,21,4,14,4,9};
        int n=arr.length;
        int low=0;
        int high=n-1;
        
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergeSort(int[]arr,int low,int high){
        
       //divide array recursively only if we have atleast two element
       if(low<high){
           //calculating mid
           int mid = (low+high)/2;
           
           //dividing left half of array
           mergeSort(arr,low,mid);
           //dividing right half of array
           mergeSort(arr,mid+1,high);
           
           //merging left and right half
           merge(arr,low,mid,high);
       }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        
        int i=low;//keeps track of left half array
        int j=mid+1;//keeps track of right half
        int c=0;//keeps track of temp array
        int[] temp = new int[high-low+1];
        
        //traversing right and left array, comparing elements
        //and storing them in temp array
        while(i<=mid && j<=high ){
            if(arr[i]<arr[j])
                temp[c++]=arr[i++];
                
            else
                temp[c++]=arr[j++];
        }
        
        //if left half array is not fully traversed,add the remaining
        //element to temp array
        while(i<=mid){
            temp[c++]=arr[i++];
        }
        
        //if right half array is not fully traversed,add the remaining
        //element to temp array
        while(j<=high){
            temp[c++]=arr[j++];
        }
        
       //copy the elements from temp array to original array
        for(c=0,i=low;c<temp.length;c++,i++) {
            arr[i]=temp[c];
        }
    }
   
}
