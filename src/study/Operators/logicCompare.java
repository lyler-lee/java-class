package study.Operators;

public class logicCompare {
    public static void main(String[] args){
        // 범위는 두 비교식의 AND
        int age = 27;
        boolean atLeast19 = age >= 19;
        boolean atMost34 = age <= 34;
        boolean inRange
                = atLeast19 && atMost34;
        System.out.println(inRange); // true
    }
}
