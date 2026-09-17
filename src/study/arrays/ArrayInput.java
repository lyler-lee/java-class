package study.arrays;


import java.util.Scanner;

public class ArrayInput {
    private static Scanner scanner;

    public static void main(String[] args){
        int[] scores = new int[5];
        for (int index = 0;
             index < scores.length;
             index++) {
            System.out.print((index + 1) + "번 점수: ");
            scores[index] =  scanner.nextInt();
        }
    }
}
