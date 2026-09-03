import java.util.Scanner;

public class ExactPriceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("단가(원): ");
        long priceWon = scanner.nextLong();
        System.out.print("수량(개): ");
        long count = scanner.nextLong();
        System.out.print("할인율(%): ");
        long discountRate = scanner.nextLong();

        long subtotalWon = (priceWon * count);
        ///  long 타입에서 바로 15%를 곱할 수 없기 떄문에,
        ///  (37,500 * 15) = 먼저 562,500으로 만든 뒤에 100으로 나눔 -> 5,625
        long discountWon = (subtotalWon * discountRate) / 100;
        long paymentWon = subtotalWon - discountWon;

        System.out.printf("소계: %,d원%n", subtotalWon);
        System.out.printf("할인: %,d원%n", discountWon);
        System.out.printf("결제: %,d원%n", paymentWon);

        scanner.close();


    }
}
