package study.arrays;

public class StringArrayDefaults {
    public static void main(String[] args){
        String[] participants = new
                String[3];
        System.out.println(participants.length);
        System.out.println(participants[0]
        );
        participants[0] = "김서윤";
        System.out.println(
                participants[0].length()
        );

    }
}
