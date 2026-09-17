package study.references;

public class ReferenceAlias {
    public static void Main(String args[]){
        // ReferenceAlias
        int[] original = {80, 90, 100};
        int[] alias = original;
        alias[1] = 50;
        System.out.println(original[1]);
        System.out.println(original == alias);
// 출력: 50
// 출력: true
    }
}
