// s23022
// コマンドライン引数に基づいてメッセージを表示するプログラム

public class d50Q27kadai {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用方法: java d50Q27kadai <数字>");
            return;
        }

        int control;
        try {
            control = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("引数は整数でなければなりません");
            return;
        }

        switch (control) {
            case 1:
                System.out.println("Warm");
                break;
            case 2:
                System.out.println("Cool");
                break;
            case 3:
                System.out.println("Wind");
                break;
            default:
                System.out.println("未知のコマンドです");
                break;
        }
    }
}

