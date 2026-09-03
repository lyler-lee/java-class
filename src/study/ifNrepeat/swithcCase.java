package study.ifNrepeat;

public class swithcCase {
    public static void main(String[] args){
        int menu = 2;

        switch (menu) {
            case 1:
                System.out.println("결제 문의");
                break;
            case 2:
                System.out.println("배송 문의");
                break;
            default:
                System.out.println("기타 문의");


        }
    }
}
