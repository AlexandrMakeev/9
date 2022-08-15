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

    public int setCurrentVolume(int getCurrentVolume) {
        if (currentVolume < 0) {
            return getCurrentVolume;
        }
        if (currentVolume > 100) {
            return getCurrentVolume;
        }

        return getCurrentVolume;
    }
}

