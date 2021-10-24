package Algorithms;

import java.util.*;
class Main{
    public static void MergeSort(int a[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            MergeSort(a,low,mid);
            MergeSort(a,mid+1,high);
            Merge(a,low,mid,high);
        }

    }

    public static void Merge(int a[],int low,int mid,int high){
        int n1= mid-low+1;
        int n2=high-mid;

        int arr[]= new int[n1];
        int arr1[]=new int[n2];

        for(int i=0;i<n1;i++)
            arr[i]=a[low+i];
        for(int j=0;j<n2;j++)
            arr1[j]=a[mid+1+j];

        int i=0;
        int j=0;
        int k=low;
        while(i<n1&&j<n2){
            if(arr[i]<=arr1[j]){
                a[k]=arr[i];
                i++;
            }
            else{
                a[k]=arr1[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=arr[i];
            i++;
            k++;
        }

        while(j<n2){
            a[k]=arr1[j];
            j++;
            k++;
        }




    }



    public static void main(String [] args){
        int a[]={4,4,4,4,7,7,7,0,2,2};
        // int n= a.length;
        MergeSort(a,0,a.length-1);
        for(int e: a){
            System.out.print(e+" ");
        }
    }
}