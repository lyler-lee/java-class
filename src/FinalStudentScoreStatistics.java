import java.util.Scanner;

public class FinalStudentScoreStatistics {

    public static void main(String[] args) {
        /*
            먼저 몇 명의 점수를 받을지 정한다.
            학생 수가 0명 이하이면 평균을 계산할 수 없다. 잘못된 학
            생 수를 먼저 막고, 정상일 때만 else 블록에서 통계를 계산
            한다.
        */

        // Scanner로 학생 수를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수: ");
        int studentCount =
                scanner.nextInt();

        // 0명 이하는 통계를 만들 수 없는 입력이다.

        if (studentCount <= 0) {
            System.out.println("1명 이상 입력하세요.");
        } else {
            // 통계 변수와 반복문이 이어진다.
        /* 반복할 때마다 0으로 바꾸면 누적값이 사라진다.
        합계와 등급별 인원은 학생 한 명을 처리할 때마다 계속 쌓
        인다. 따라서 while 문에 들어가기 전에 한 번만 초기화한다. */

            /// 성적 통계에 필요한 값을 먼저 나눈다

            // validCount는 정상으로 받은 점수 개수를 센다.
            int validCount = 0;
            /// totalScore는 점수를 계속 더하고, maxScore와 minScore는 현재까지의 최고점과 최저점을 기억한다.
            // 합계와 인원은 더하기 위해 0에서 시작한다.
            int totalScore = 0;

            // 최고점은 정상 점수의 최솟값인 0에서 시작한다.
            int maxScore = 0;
            // 최저점은 정상 점수의 최댓값인 100에서 시작한다.
            int minScore = 100;


            /// aCount부터 fCount까지는 각 점수의 등급을 판단한 뒤 해당 등급의 인원만 1명 증가시킨다.
            int aCount = 0;
            int bCount = 0;
            int cCount = 0;
            int dCount = 0;
            int fCount = 0;

        /*
        입력 횟수와 정상 점수 개수는 다를 수 있다
        잘못된 점수를 입력해도 학생 한 명의 입력을 끝낸 것으로
        세면 안 된다. 정상 점수를 저장한 뒤에만 validCount를 증
        가시킨다.
         */

        // while 조건은 validCount < studentCount이다.
        while (validCount < studentCount) {
            // studentCount가 1명 이상일 때 통계를 시작한다.
            int number = validCount + 1;

            System.out.print( number + "번 점수: ");

            // 정상 점수만 아래의 통계 계산으로 내려간다.
            int score = scanner.nextInt();

            // 0 미만이나 100 초과 점수는 continue로 제외한다.
            if (score >= 101 || score < 0) {
                System.out.println(
                        "0~100만 입력하세요.");
                continue;
            }
            /*
            점수 한 개를 받을 때마다 통계를 갱신한다.
            모든 점수를 저장하지 않아도 합계와 현재 최고점, 현재 최
            저점만 기억하면 마지막 통계를 계산할 수 있다.
             */
            // totalScore에 현재 score를 더한다.
            totalScore += score;
            // 현재 점수가 maxScore보다 크면 최고점을 바꾼다.
            if (score > maxScore) {
                maxScore = score;

            }
            if (score < minScore) {
                minScore = score;

            }
            validCount++;
            /*
            else-if 묶음으로 등급을 하나만 선택한다
            95점은 A 조건에서 바로 선택되고 아래 조건은 검사하지 않
            는다. 여러 개의 if를 쓰면 조건을 잘못 작성했을 때 한 학생
            을 두 번 셀 수 있다.
             */
            // 90점 이상은 A이다.
            if (score >= 90) {
                aCount++;

                // 80점 이상은 B, 70점 이상은 C이다.
            } else if (score >= 80) {
                bCount++;

            } else if (score >= 70) {
                cCount++;

                // 60점 이상은 D이다.
            } else if (score >= 60) {
                dCount++;

                // 앞 조건에 해당하지 않는 0부터 59점은 F이다.
            } else {
                fCount++;

            }

        }
        double average = (double) totalScore / studentCount;

        System.out.println("합계: "+ totalScore);
        System.out.printf("평균: %.1f%n",
                average);
        System.out.println("최고점: "
                + maxScore);
        System.out.println("최저점: "
                + minScore);

        System.out.printf(
                "A: %d명%n", aCount);
        System.out.printf(
                "B: %d명%n", bCount);
        System.out.printf(
                "C: %d명%n", cCount);
        System.out.printf(
                "D: %d명%n", dCount);
        System.out.printf(
                "F: %d명%n", fCount);
    }
    scanner.close();

    }
}
