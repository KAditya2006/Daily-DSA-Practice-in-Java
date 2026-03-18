package Arrays;

public class BinarySearch {
    int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        BinarySearch obj = new BinarySearch();
        int result = obj.binarySearch(numbers, key);
        if(result == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
}
