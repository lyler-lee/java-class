package study.extends01.ex04;

class Airplane {
    void fly() {
        System.out.println("일반 비행");
    }
}
class SupersonicAirplane extends
        Airplane {
    boolean supersonic;
    @Override
    void fly() {
        if (supersonic) {
            System.out.println(
                    "초음속 비행");
        } else {
            super.fly();
        }
    }
}
public class AirplaneMain {
    public static void main(
            String[] args) {
        SupersonicAirplane plane =
                new SupersonicAirplane();
        plane.fly();
        plane.supersonic = true;
        plane.fly();
    }
}