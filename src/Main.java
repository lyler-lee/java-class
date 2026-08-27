import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        Scanner scanner = new Scanner(System.in);


        // 예외 이름을 외우기보다 상황을 이해한다
        String input = scanner.nextLine().trim();
        try {
            int count = Integer.parseInt(input);
            System.out.println("프로젝트: " + count);
        } catch (NumberFormatException e) {
            System.err.println("정수로 입력해 주세요." + e.getMessage());
        }
    }
}