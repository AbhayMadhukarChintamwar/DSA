public class MergSort {
    public static void mergeSort(int []arr, int l , int r){
        if (l<r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr,l ,m,r);
        }
    }
 
    public static void merge(int [] arr, int l, int m , int r){
        int num1 = m-l+1;
        int num2= r-m;
 
 
        int []L = new int [num1];
        int []R = new int [num2];
 
        for(int i = 0; i<num1;++i){
            L[i] = arr[l+i];
 
        }
 
        for(int j = 0; j<num2 ;++j){
            R[j]= arr[m+1+j];
        }
 
 
        int i = 0;
        int  j = 0;
        int k =l;
 
        while(i<num1 && j<num2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
 
            }
            k++;
        }
        while(i<num1){
            arr[k] =L[i];
            i++;
            k++;
 
        }
        while(j<num2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int a[]={20,40,3,42,13,442,523,5,32,522,24};
        mergeSort(a,0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        
        // System.out.println();
        // System.out.println(a.length);
    }
}
