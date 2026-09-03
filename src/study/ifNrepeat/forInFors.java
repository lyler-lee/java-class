package study.ifNrepeat;

public class forInFors {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int column = 1;
                 column <= 5; column++) {
                int seat = (row - 1) * 5 +
                        column;
                System.out.print(seat +
                        ")");
            }
            System.out.println();
        }
    }
}
