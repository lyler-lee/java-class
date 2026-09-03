import java.util.Scanner;

public class FinalMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("시작 단(2~9): ");
        int dan = scanner.nextInt();
        int startDan = 2;


        System.out.print("끝 단(2~9): ");
        int number = scanner.nextInt();
        int endDan = 9;

        boolean invalid = !(dan < number);
        if (invalid) {
            System.out.println(
                    "2~9 범위를 순서대로 입력하세요.");
        }
        else {
            for (int i = dan; dan <= number; dan++) {
                System.out.println("[" + dan + "단]");
                for (int j = 1; j <= 9; j++) {
                    int result = dan * j;
                            System.out.println(dan + " x "
                                    + j + " = " + result);
                }
                System.out.println();
            }
        }
    }
}
