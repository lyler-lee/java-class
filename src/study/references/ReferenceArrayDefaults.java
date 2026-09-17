package study.references;

public class ReferenceArrayDefaults {
    public static void main(String[] args){
        String[] names = new String[3];
        System.out.println(names.length);
        System.out.println(names[0]);
// 출력: 3
// 출력: null
// names[0].length();
// NPE 발생
    }
}
