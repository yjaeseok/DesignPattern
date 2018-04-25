public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        speaker1.volumeUp();
        // 6, 6
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.volumeDown();
        // 5, 5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
