public class Q3QuickSort {
    public static void printA(int arr[]){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void quickS(int arr[],int si,int ei){
        if(si>=ei)  return;
        //For Partition : LastElement is passed
        int pIdx=partition(arr,si,ei);
        quickS(arr, si, pIdx-1);    
        quickS(arr, pIdx+1, ei);    

    } 
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //Swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //i=pivot's position-1, 
        System.out.println("PIVOT : "+pivot+" position : "+ei);
        printA(arr);
        i++;  
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        printA(arr);
        return i;
    }  
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5,2};
        quickS(arr, 0, arr.length-1);
        printA(arr);
    }
}
