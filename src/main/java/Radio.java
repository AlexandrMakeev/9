public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int firstStation = 0;
    private int currentStation = firstStation;
    private int currentVolume = minVolume;

    private int currentCoint;


    public Radio(int currentCoint) {
        this.currentCoint = currentCoint;
    }


    public void next() {
        if (currentStation < currentCoint - 1) {
            currentStation++;
        } else {
            currentStation = firstStation;
        }
    }

    public void prev() {
        if (currentStation > firstStation) {
            currentStation--;
        } else {
            currentStation = currentCoint -1;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation < firstStation ) {
            return currentStation;
        }
        if (currentStation > currentCoint -1) {
            return currentStation;
        }

        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return currentVolume;
        }
        if (currentVolume > maxVolume) {
            return currentVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }
}