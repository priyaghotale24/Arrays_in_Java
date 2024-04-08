import java.util.*;

public class largestarray {
    public static int largest(int numbers[]) {
        int large = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (large < numbers[i]) {
                large = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is:" + smallest);
        return large;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 7, 0, 8 };
        System.out.println("largest of number is=" + largest(numbers));
    }
}
