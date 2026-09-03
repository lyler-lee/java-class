package study.Operators;

public class dualEquals {
    public static void main(String[] args){
        // 한 줄마다 변수 값이 바뀐다
        int total = 0;
        total += 3_500;
        // total + 3500
        total += 2_000;
        // total = 3500 + 2000
        total -= 500;
        // total = 5500 - 500
        System.out.println(total);
    }
}
