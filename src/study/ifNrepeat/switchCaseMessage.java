package study.ifNrepeat;

public class switchCaseMessage {
    public static void main(String[] args){
        String status = "PAYMENT";
        String message = switch (status) {
            case "PAYMENT" -> "결제 확인 중";
            case "PREPARING" -> "상품 포장 중";
            case "SHIPPING" -> "배송 중";
            case "COMPLETED" -> "배송 완료";
            default -> "알 수 없는 상태";
        };
        System.out.println(message);
    }

}
