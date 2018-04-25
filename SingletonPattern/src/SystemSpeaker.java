class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
        // do nothing
        volume = 5;
    }

    static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }

    int getVolume() {
        return volume;
    }

    void volumeUp() {
        if (volume < 10) {
            volume++;
        }
    }

    void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }
}
