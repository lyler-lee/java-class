package study.arrays;

public class FindName {
    public static void main(String[] args){
        // 5.8 String 배열의 생성 직후
        /**
         * 배열 자체와 배열 항목의 상태를 나누어 본다
         *
         * participants 변수는 길이 3인 String 배열 객체를
         * 가리킨다. 따라서 participants.length는 사용할 수
         * 있다.
         *
         * 각 항목은 아직 String 객체를 가리키지 않으므로
         * null이다.
         *
         * participants[0]에 이름을 대입한 뒤에야 첫 번째 항
         * 목으로 String 메소드를 호출할 수 있다.
         */
        String[] participants = new
                String[3];
        System.out.println(participants.length);
        System.out.println(participants[0]
        );
        participants[0] = "김서윤";
        System.out.println(
                participants[0].length()
        );

        // 5.8 일부 항목만 채워진 배열 출력
        /**
         * null인 칸은 빈 자리로 표시한다
         *
         * 배열 객체는 만들어졌어도 각 String 항목은 아직 객
         * 체를 가리키지 않을 수 있다.
         *
         * 항목을 읽은 뒤 null인지 먼저 확인한다. null일 때
         * 는 빈 자리라고 출력하고 다음 칸으로 넘어간다.
         *
         * null이 아닌 칸에서는 그제야 이름을 출력한다. 최
         * 종 실습의 명단 조회도 같은 순서로 작성한다.
         */
        String[] names = {"김서윤", null};
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                System.out.println("빈 자리");
                continue;
            }
            System.out.println(names[i]);
        }
        // 5.8 null 안전성을 지키는 이름 검색
        /**
         * null 확인을 먼저 하고 equals()를 호출한다
         *
         * participant가 null이면 participant.equals()를 호
         * 출할 수 없다.
         *
         * &&의 왼쪽에서 null이 아님을 확인하면 오른쪽 내
         * 용 비교는 안전하게 실행된다.
         *
         * 찾은 뒤에는 found를 true로 바꾸고 break로 반복
         * 을 끝낸다.
         */
        boolean found = false;
        for (String participant :
                participants) {
            String searchName = "";
            if (participant != null && participant.equals(searchName)) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
