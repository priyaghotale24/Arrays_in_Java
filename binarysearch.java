public class binarysearch {

    public static int search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                mid = mid + 1;
            } else {
                mid = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 7, 8, 9, 10, 12, 14 };
        int key = 10;
        System.out.println("key is at index: " + search(numbers, key));
    }
}
