import java.util.Scanner;
import java.util.Scanner;

public class DeveloperProfile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
        String name = scanner.nextLine().trim();

        System.out.print("희망 직무: ");
        String role = scanner.nextLine().trim();

        System.out.print("GitHub 주소: ");
        String githubUrl = scanner.nextLine().trim();

        System.out.print("Java 학습 개월 수: ");
        int studyMonths = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("프로젝트 수: ");
        int projectCount = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("즉시 취업 가능(true/false): ");
        boolean available = Boolean.parseBoolean(scanner.nextLine().trim());

        scanner.close();

        System.out.println(); // 줄바꿈 공백
        System.out.printf("%s | %s%n", name, role);
        System.out.printf("Java %d개월 | 프로젝트 %d개%n", studyMonths, projectCount);
        System.out.printf("취업 가능: %b%n", available);
    }
}