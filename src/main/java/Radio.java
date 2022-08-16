public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return currentStation;
        }
        if (currentStation > 9) {
            return currentStation;
        }

        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return currentVolume;
        }
        if (currentVolume > 100) {
            return currentVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }
}

