// s23022
// d50Q5をアレンジして下記出力結果の例のようにソート途中の内容も出力するようにしてください

class d50Q5 {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
                printArray(num, "ソート途中");
            }
        }

        System.out.println("-------------------");
        printArray(num, "ソート結果");
    }
    private static void printArray(int[] array, String message) {
        System.out.print(message + ":");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

