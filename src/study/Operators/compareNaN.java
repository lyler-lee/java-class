package study.Operators;

public class compareNaN {
    public static void main(String[] args){
        // ==만 보면 뜻을 잘못 읽을 수 있다
        double nan = 0.0 / 0.0;
        System.out.println(nan == nan); // false
        System.out.println(nan != nan); // true
        boolean check = Double.isNaN(nan);
        System.out.println(check); // true
    }
}
