import java.util.Scanner;

class StudentEntry {
    String studentId;
    String name;
}

public class FinalEventCheckIn_student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];

        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("학번과 이름을 모두 입력해 주세요.");
                        break;
                    }

                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    boolean duplicate = false;
                    for (int i = 0; i < entries.length; i++) {
                        // 해당 칸이 비어있지 않고, 그 칸의 학번이 입력한 학번과 같다면 중복
                        if (entries[i] != null && entries[i].studentId.equals(studentId)) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("이미 신청한 학생입니다.");
                        break;
                    }

                    // TODO 3 & 4. null인 첫 칸을 찾고, 빈 칸이 없으면 정원 마감 처리
                    int emptyIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            emptyIndex = i; // 빈 칸의 위치를 저장
                            break;
                        }
                    }

                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    if (emptyIndex == -1) {
                        System.out.println("정원이 마감되었습니다.");
                        break;
                    }

                    // TODO 3. StudentEntry 객체를 저장하세요.
                    StudentEntry newEntry = new StudentEntry();
                    newEntry.studentId = studentId;
                    newEntry.name = name;
                    entries[emptyIndex] = newEntry;
                    System.out.println(name + " 학생의 신청이 완료되었습니다.");
                    break;

                case "2":
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    int displayed = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            displayed++;
                            System.out.println((i + 1) + "번 자리 - 학번: " + entries[i].studentId + ", 이름: " + entries[i].name);
                        }
                    }
                    if (displayed == 0) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;

                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();

                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    int canceledIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        // 빈 칸이 아니고, 입력한 학번과 일치하는 칸을 찾음
                        if (entries[i] != null && entries[i].studentId.equals(cancelId)) {
                            canceledIndex = i;
                            break;
                        }
                    }

                    if (canceledIndex == -1) {
                        System.out.println("해당 학번의 신청 내역이 없습니다.");
                    } else {
                        String canceledName = entries[canceledIndex].name;
                        entries[canceledIndex] = null; // 해당 칸을 null로 비워 취소 처리
                        System.out.println(canceledName + " 학생의 신청이 취소되었습니다.");
                    }
                    break;

                case "4":
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    int currentCount = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            currentCount++;
                        }
                    }
                    int remaining = entries.length - currentCount;
                    System.out.println("현재 신청 인원: " + currentCount + "명, 남은 자리: " + remaining + "자리");
                    break;

                default:
                    System.out.println("0부터 4 사이의 메뉴를 선택하세요.");
            }
        }
    }
}