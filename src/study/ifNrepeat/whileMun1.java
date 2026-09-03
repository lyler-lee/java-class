package study.ifNrepeat;

import java.util.Scanner;

public class whileMun1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int speed = 0;
        while (running) {
            int menu = scanner.nextInt();
            if (menu == 1) speed++;
            else if (menu == 2) speed--;
            else if (menu == 3) running =
                    false;
        }
        System.out.println("종료");
    }

}
