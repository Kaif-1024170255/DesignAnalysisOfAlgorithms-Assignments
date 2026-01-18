public class Q1BinarySearch{
    public static int findElementBinarySearch(int arr[],int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<k)
                left=mid+1;
            else if(arr[mid]>k)
                right=mid-1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,5,67,97,109};
        System.out.println(findElementBinarySearch(arr, 109));
    }
}