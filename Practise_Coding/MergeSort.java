package Practise_Coding;

public class MergeSort {
    public void sort(int arr[],int len, int mid, int start){
        int n = mid-len+1;
        int m = start-mid;
        int a[]=new int[n];
        int b[]=new int[m];

        for(int i=0;i<a.length;i++){
            a[i]=arr[start+i];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }else {
                arr[k]=b[j];
                j++;
            }k++;
        }
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public void divide(int arr[],int len,int start){
        if(start<len) {
            int m = (len + start) / 2;
            divide(arr, start,m);
            divide(arr, start,m+1);
            sort(arr, len, m + 1, start);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,6,9,50,66,3};
        int l=arr.length-1;
        int s = 0;
        MergeSort div = new MergeSort();
        div.divide(arr,l,s);
        printArray(arr);
    }
}
