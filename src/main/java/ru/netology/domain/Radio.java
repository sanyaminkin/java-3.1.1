package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int quantityStation =10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantityStation) {

        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public void increaseStation() {
        if (currentStation < quantityStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = quantityStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > quantityStation)
            return;
        if (currentStation < minStation)
            return;
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

//    public int getMinVolume() {
//        return minVolume;
//    }
//
//    public int getMaxVolume() {
//        return maxVolume;
//    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }
}

