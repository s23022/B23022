//23022
//レンジして基数をもう一つ加えるコマンドラインで指定された値の上限と数に基づき、倍数判定を行い出力するプログラミング
public class d49Q5kadai {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java D49Q5kadai <upper limit> <base1> <base2> <base3>");
            return;
        }

        int upperLimit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);
        int base3 = Integer.parseInt(args[3]);

        for (int i = 1; i <= upperLimit; i++) {
            StringBuilder output = new StringBuilder();
            boolean isMultiple = false;

            if (i % base1 == 0) {
                output.append("base1");
                isMultiple = true;
            }
            if (i % base2 == 0) {
                if (isMultiple) {
                    output.append(" ");
                }
                output.append("base2");
                isMultiple = true;
            }
            if (i % base3 == 0) {
                if (isMultiple) {
                    output.append(" ");
                }
                output.append("base3");
                isMultiple = true;
            }

            if (!isMultiple) {
                output.append(i);
            }

            System.out.println(i + ": " + output.toString());
        }
    }
}

