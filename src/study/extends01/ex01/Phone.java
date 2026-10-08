package study.extends01.ex01;

class Phone {
    void call() {
        System.out.println("전화 연결");
    }
}
class SmartPhone extends Phone {
    void internet() {
        System.out.println("인터넷 연결");
    }

     public class Phone {
        public static void main(String[] args) {
            SmartPhone phone = new SmartPhone();
            phone.call();
            phone.internet();
        }
    }
}