//s23022
//34~35ページの課題

public class StatisticsCalculator {
    public static void main(String[] args) {
        int[] numbers = {6, 456, 232, 400, 500, 250};

        double average = calculateAverage(numbers);
        System.out.println("平均値: " + average);

        int range = calculateRange(numbers);
        System.out.println("値の範囲: " + range);

        int aboveAverageCount = countAboveAverage(numbers, average);
        int belowAverageCount = countBelowAverage(numbers, average);

        System.out.println("平均より大きい値の個数: " + aboveAverageCount);
        System.out.println("平均より小さい値の個数: " + belowAverageCount);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static int calculateRange(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    public static int countAboveAverage(int[] numbers, double average) {
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    public static int countBelowAverage(int[] numbers, double average) {
        int count = 0;
        for (int num : numbers) {
            if (num < average) {
                count++;
            }
        }
        return count;
    }
}

