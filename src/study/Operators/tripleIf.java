package study.Operators;

public class tripleIf {
    public static void main(String[] args){
        // 두 문자열 중 하나를 선택한다
        int score = 65;
        String result
                = score >= 60
                ? "합격"
                : "재시험";
        System.out.println(result); // 합격
    }
}
