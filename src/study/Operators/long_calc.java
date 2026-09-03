package study.Operators;

public class long_calc {
    public static void main(String[] args){
        long subtotalWon = 14_000;
        long discountRate = 10;
        long wrong
                = subtotalWon * (discountRate / 100);
        long correct
                = subtotalWon * discountRate / 100;
        System.out.println(wrong); // 0
        System.out.println(correct); // 1400
    }
}
