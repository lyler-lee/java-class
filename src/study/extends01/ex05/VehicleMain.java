package study.extends01.ex05;


    class Vehicle {
        final void stop() {
            System.out.println(
                    "안전하게 정지");
        }
    }
    class Bus extends Vehicle {
// 오류 실험: 다음 줄의 주석을 해제합니다.
// void stop() { }
    }
    final class Ticket {
        String code() { return "T-001";
        }
    }
    // 오류 실험: 다음 줄의 주석을 해제합니다.
// class DiscountTicket extends
// Ticket { }
    public class VehicleMain {
        public static void main(String[] args) {
            new Bus().stop();
            System.out.println(new Ticket().code());
        }
    }

