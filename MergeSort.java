import java.util.Scanner;

public class MergeSort {
    public static void divide(int arr[], int i, int j){
        if (i>=j){      // after some time remove it
            return;
        }
        int mid = i+(i-j)/2;
        divide(arr,i,mid);
        divide(arr,mid+1,j);
        conquer(arr,i,mid,j);
    }
    public static void conquer(int arr[], int i, int j,int mid){
        int[] mreged = new int[i-j+1];
        int idx1=i;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=j);
        {
            if (arr[idx1]<=arr[idx2]){

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,4,2,1,5};
        int n = arr.length;
    }
}
