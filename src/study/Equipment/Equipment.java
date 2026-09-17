package study.Equipment;

public class Equipment {
    public static void main(String[] args) {
        Equipment a = new Equipment();
        Equipment b = new Equipment();
        System.out.println(a == b);
        b = a;
        System.out.println(a == b);
    }
}
