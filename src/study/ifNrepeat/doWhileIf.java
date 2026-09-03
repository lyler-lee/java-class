package study.ifNrepeat;

import java.util.Scanner;

public class doWhileIf
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String savedPin = "2580";
        String inputPin;
        int attempt = 0;
        do {
            inputPin = scanner.nextLine();
            attempt++;
        } while (!inputPin.equals(savedPin)
                && attempt < 3);
        if (inputPin.equals(savedPin)) {
            System.out.println("로그인 성공");
        }
    }
}
