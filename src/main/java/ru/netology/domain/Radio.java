package ru.netology.domain;

public class Radio {
    private int numberOfStations;
    private int stationNumber;
    private int volume;

    public void volumeUp () {
        if (volume==100) {
            volume = 100;
        } else
            volume++;
    }

    public void volumeDown () {
        if (volume==0) {
            volume = 0;
        } else
            volume--;
    }

    public void stationUp () {
        if (stationNumber==numberOfStations) {
            stationNumber = 0;
        } else
            stationNumber++;
    }

    public void stationDown () {
        if (stationNumber==0) {
            stationNumber = numberOfStations;
        } else
            stationNumber--;
    }

    public Radio() {
    }

    public Radio(int numberOfRadioStations, int stationNumber, int volume) {
        this.numberOfStations = numberOfRadioStations;
        this.stationNumber = stationNumber;
        this.volume = volume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}


