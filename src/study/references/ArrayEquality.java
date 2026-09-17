package study.references;

public class ArrayEquality {
    public static void main(String[] args){
        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = {10, 20, 30};
        int[] numbers3 = numbers1;
        System.out.println(numbers1 ==
                numbers2);
        System.out.println(numbers1 == numbers3);
        //System.out.println(Arrays.equals(numbers1,    numbers2));
    }
}
