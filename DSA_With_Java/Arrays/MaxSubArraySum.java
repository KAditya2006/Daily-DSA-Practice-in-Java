package Arrays;

public class MaxSubArraySum {
    void calculateMaxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum = 0;
            for(int j=i;j<arr.length;j++){
                currentSum  = currentSum + arr[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum of subArray is: " + maxSum);
    }

    public static void main(String [] args){
        int array [] = { 1,-2,6,-1,3};
        MaxSubArraySum obj = new MaxSubArraySum();
        obj.calculateMaxSubArraySum(array);
    }
}
