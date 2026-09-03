public class FinalOrderKiosk {
    /*
    01 while은 사용자가 결제하거나 취소할 때까지 메뉴를 반복한다.

02 switch 표현식은 메뉴 번호를 상품명과 가격으로 바꾼다.

03 do-while은 수량이 1 이상이 될 때까지 다시 입력받는다.

04 if, for, continue, break는 할인, 영수증, 잘못된 선택, 프로그램 종료를 각각 처리한다.
     */
    public static void main(String[] args){
    /*
    주문값은 반복문 밖에 둔다

    상품을 여러 번 담아도 수량과 금액이 유지되어야 한다. 누
    적 변수는 while 밖에서 한 번만 초기화한다.
     */
        // 각 상품 수량은 0에서 시작한다.
        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        // orderAmount도 0원에서 시작한다.
        int orderAmount = 0;
        // paid는 결제 여부를 기억한다.
        boolean paid = false;
        // orderLoop 레이블은 바깥 반복을 끝낼 때 사용한다.
        orderLoop:
        while () {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            int menu =

            if () {
                String productName = switch (menu) {
                    case 1:
                        coffeeCount++;
                    case 2:
                        sandwichCount++;
                    default:
                        waterCount++;

                }
                };
                int price = switch () {
                };

                int quantity;
                do {
                    System.out.print("수량: ");
                    quantity =
                } while ();
                if ()
else if ()
else
                orderAmount
                continue;
            }

            if () {
                if () {
                    System.out.println("상품을 선택하세요.");
                    continue;
                }
                int discountRate;
                if () {
                } else if () {
                } else {
                }
                int discountAmount
                        =
                int paymentAmount
                        =
                for () {
                    System.out.print("=");
                }
                System.out.println();
                System.out.println("결제 금액: " +
                        paymentAmount);
                paid = true;
                break orderLoop;
    }
}
