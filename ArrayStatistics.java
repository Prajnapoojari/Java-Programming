class ArrayStatistics {

    static void calculateStats(int[] arr) {
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double average = (double) sum / arr.length;

        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        calculateStats(numbers);
    }
}
