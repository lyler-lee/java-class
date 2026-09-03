import java.util.Scanner;

public class FinalNumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int attempts= 0;
        int answer = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.print("숫자 입력(1~100): ");
            int guess = scanner.nextInt();



            if ( guess >= 101 || guess <= 0 ) {
                break;
            }

            if ( guess > answer ) {
                System.out.println("정답이 더 작습니다.");
                attempts++;

            } else if (guess < answer) {
                System.out.println("정답이 더 큽니다.");
                attempts++;
            } else {
                System.out.println("정답입니다!");
                break;
            }
        }
        System.out.println("게임을 종료합니다.");
        System.out.printf("시도 횟수 : %d", attempts);
    }
}
