// s23022
// 中央値を求める課題


public class d49Q6kadai02 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("引数がありません。少なくとも1つの引数を指定してください。");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        double average = calculateAverage(numbers);
        System.out.println("平均値: " + average);

        int range = calculateRange(numbers);
        System.out.println("値の範囲: " + range);

        int aboveAverageCount = countAboveAverage(numbers, average);
        int belowAverageCount = countBelowAverage(numbers, average);
        System.out.println("平均より大きい値の個数: " + aboveAverageCount);
        System.out.println("平均より小さい値の個数: " + belowAverageCount);

        int median = calculateMedian(numbers);
        System.out.println("中央値: " + median);
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

    public static int calculateMedian(int[] numbers) {
        Arrays.sort(numbers);

        int middleIndex = numbers.length / 2;

        return numbers[middleIndex];
    }
}

