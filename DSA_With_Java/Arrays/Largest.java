package Arrays;

public class Largest {

    void findLargest(int arr[]) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest number in the given array is: " + largest);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 6, 3, 5};
        Largest obj = new Largest();
        obj.findLargest(array);
    }
}

