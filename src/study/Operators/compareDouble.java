package study.Operators;

public class compareDouble {
    public static void main(String[] args){
        // ==는 참조, equals는 내용
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // true 가능
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
    }
}
