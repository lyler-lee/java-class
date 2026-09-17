import java.util.Scanner;

public class FinalOrderKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 주문값은 반복문 밖에 둔다
        // 상품을 여러 번 담아도 수량과 금액이 유지되어야 한다. 누적 변수는 while 밖에서 한 번만 초기화한다.
        // 시작 상태
        // 각 상품 수량은 0에서 시작한다.
        // orderAmount도 0원에서 시작한다.
        // paid는 결제 여부를 기억한다.
        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        int orderAmount = 0;
        boolean paid = false;

        // orderLoop 레이블은 바깥 반복을 끝낼 때 사용한다.
        orderLoop:
        while (true) {
            System.out.println("1. 커피 (2,500원)");
            System.out.println("2. 샌드위치 (4,500원)");
            System.out.println("3. 생수 (1,000원)");
            System.out.println("4. 결제하기 / 0. 주문 취소");
            System.out.print("메뉴 번호 선택: ");
            int menu = scanner.nextInt();


            // 상품 메뉴만 먼저 걸러 낸다
            // 1부터 3까지는 상품 선택이다. 같은 menu 값으로 상품명과 가격을 각각 구하면 뒤의 수량 처리 코드를 공통으로 사용할 수 있다.
            // switch 표현식 두 개
            // 상품이 아니면 이 블록을 실행하지 않는다.
            if (menu >= 1 && menu <= 3) {
                // menu 1은 커피와 2,500원이다.
                // menu 2는 샌드위치와 4,500원이다.
                // menu 3은 default에서 생수와 1,000원이다.
                String productName = switch (menu) {
                    case 1 -> "커피";
                    case 2 -> "샌드위치";
                    default -> "생수";
                };

                int price = switch (menu) {
                    case 1 -> 2500;
                    case 2 -> 4500;
                    default -> 1000;
                };


                // 잘못된 수량은 다시 입력받는다
                // 상품을 선택한 뒤 수량을 최소 한 번 입력받는다. 0 이하이면 같은 상품의 수량을 다시 묻고, 정상 수량만 주문 금액에 더한다.
                // 수량 처리
                // do 블록이 수량을 먼저 입력받는다.
                // quantity가 0 이하이면 다시 반복한다.
                int quantity;
                do {
                    System.out.print("수량: ");
                    quantity = scanner.nextInt();
                } while (quantity <= 0);

                // 상품별 개수를 누적한다.
                if (menu == 1) coffeeCount += quantity;
                else if (menu == 2) sandwichCount += quantity;
                else waterCount += quantity;

                // 가격 곱하기 수량을 주문 금액에 더한다.
                orderAmount += price * quantity;

                System.out.println(productName + " " + quantity + "개가 추가되었습니다. (현재 주문 금액: " + orderAmount + "원)");

                continue;
            }


            // 결제 메뉴를 선택한 경우
            // 주문 금액이 0원이면 결제를 진행하지 않고 메뉴로 돌아간다. 주문이 있으면 높은 할인 기준부터 검사한다.
            if (menu == 4) {
                // 결제 전 검사
                // 빈 주문은 continue로 메뉴로 돌아간다.
                if (orderAmount == 0) {
                    System.out.println("상품을 선택하세요.");
                    continue;
                }

                // 5만원 이상은 10% 할인이다.
                // 3만원 이상은 5% 할인이다.
                // 그 미만은 할인하지 않는다.
                int discountRate;
                if (orderAmount >= 50000) {
                    discountRate = 10;
                } else if (orderAmount >= 30000) {
                    discountRate = 5;
                } else {
                    discountRate = 0;
                }


                // 결제 금액을 단계별로 계산한다
                // 할인 금액과 결제 금액을 따로 계산해 출력한다. 영수증을 확인한 뒤 paid를 true로 바꾸고 바깥 반복을 끝낸다.
                // 마지막 상태
                // discountAmount를 정수로 계산한다.
                int discountAmount = orderAmount * discountRate / 100;
                int paymentAmount = orderAmount - discountAmount;

                // for 문으로 영수증 구분선을 출력한다.
                for (int i = 0; i < 30; i++) {
                    System.out.print("=");
                }
                System.out.println();
                // 상품 수량과 금액을 한 줄씩 출력한다.
                if (coffeeCount > 0) System.out.println("커피: " + coffeeCount + "개 (" + (coffeeCount * 2500) + "원)");
                if (sandwichCount > 0) System.out.println("샌드위치: " + sandwichCount + "개 (" + (sandwichCount * 4500) + "원)");
                if (waterCount > 0) System.out.println("생수: " + waterCount + "개 (" + (waterCount * 1000) + "원)");
                System.out.println("총 주문 금액: " + orderAmount + "원");
                System.out.println("할인율: " + discountRate + "% (" + discountAmount + "원 할인)");
                System.out.println("결제 금액: " + paymentAmount);

                // break orderLoop가 메뉴 반복 전체를 끝낸다.
                paid = true;
                break orderLoop;
            }

            // 주문 취소 및 잘못된 메뉴 번호 처리 (종합 실습 테스트 04)
            if (menu == 0) {
                System.out.println("주문을 취소합니다.");
                break orderLoop;
            } else {
                System.out.println("존재하지 않는 메뉴 번호입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();
    }
}