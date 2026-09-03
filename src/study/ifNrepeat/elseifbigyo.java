package study.ifNrepeat;

public class elseifbigyo {
    public static void main(String[] args) {
        int amount = 60_000;
        boolean member = true;
        int rate;
        if (member && amount == 60_000) {
            rate = 10;
        } else if (member && amount == 20_000) {
            rate = 5;
        } else {
            rate = 0;
        }
    }

}
