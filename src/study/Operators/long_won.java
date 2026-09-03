package study.Operators;

public class long_won {
    public static void main(String[] args){
        long priceWon = 3_500; // 3500으로 _를 붙이지 않아도 잘 계산됨.
        long count = 4;
        long discountRate = 10;

        long subtotalWon = priceWon * count;
        long discountWon
                = subtotalWon * discountRate / 100;
        long paymentWon
                = subtotalWon - discountWon;

        System.out.println(paymentWon);
    }
}
