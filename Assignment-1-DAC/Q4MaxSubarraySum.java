public class Q4MaxSubarraySum {
    // O(n^2)
    public static int getMaxSubarraySum1(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>maxSum) maxSum=sum;
            }
        }   
        return maxSum; 
    }
    // O(n)
    public static int getMaxSubarraySum2(int arr[]){
        int maxSum=arr[0];
        int sum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println(getMaxSubarraySum1(arr));
        System.out.println(getMaxSubarraySum2(arr));
    }   
}
