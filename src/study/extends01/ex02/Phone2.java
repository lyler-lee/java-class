package study.extends01.ex02;


class Phone {
    String model;
    Phone(String model) {
        this.model = model;
        System.out.println(
                "부모 초기화: " + model);
    }
}
class SmartPhone extends Phone {
    SmartPhone(String model) {
        super(model);
        System.out.println("자식 초기화 완료");
    }
}
 public class Phone2 {
    public static void main(String[] args) {
        SmartPhone phone = new
                SmartPhone("학습용폰");
        System.out.println(
                phone.model);
    }
}
