package study.Operators;

public class double_calc {
    public static void main(String[] args){
        // 실행은 계속되지만 값은 특별하다
        double normal = 10.0 / 2.0;
        double infinity = 10.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println(normal); // 5.0
        System.out.println(infinity); // Infinity
        System.out.println(nan); // NaN
    }
}
