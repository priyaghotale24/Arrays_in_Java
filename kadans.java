public class kadans {
    public static void maxsubarraysum(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < numbers.length; i++) {
            curr = curr + numbers[i];
            if (curr < 0) {
                curr = 0;
            }
            ms = Math.max(ms, curr);
        }
        System.out.println("maximum sum is=" + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxsubarraysum(numbers);
    }
}
