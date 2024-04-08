public class maxsubarraysum {
    public static void max(int numbers[]) {
        int current = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                current = 0;
                for (int k = start; k <= j; k++) {
                    current += numbers[k];
                }
                System.out.print(current);
                if (maxsum < current) {
                    maxsum = current;
                }
                System.out.println();
            }
        }
        System.out.println("maximum sum is=" + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        max(numbers);
    }
}
