package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldTestVolumeUp() {
        Radio radio = new Radio(10, 5, 50);
        radio.volumeUp();
        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldTestVolumeUpWhenVolumeMax() {
        Radio radio = new Radio(10, 5, 100);
        radio.volumeUp();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldTestVolumeDown() {
        Radio radio = new Radio(10, 7, 50);
        radio.volumeDown();
        assertEquals(49, radio.getVolume());
    }

    @Test
    void shouldTestVolumeDownWhenVolumeMin() {
        Radio radio = new Radio(10, 7, 0);
        radio.volumeDown();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldTestStationUp() {
        Radio radio = new Radio(10, 5, 100);
        radio.stationUp();
        assertEquals(6, radio.getStationNumber());
    }

    @Test
    void shouldTestStationUpWhenStationMax() {
        Radio radio = new Radio(5, 5, 70);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldTestStationDown() {
        Radio radio = new Radio(6, 6, 6);
        radio.stationDown();
        assertEquals(5, radio.getStationNumber());
    }

    @Test
    void shouldTestStationDownWhenStationMin() {
        Radio radio = new Radio(9, 0, 50);
        radio.stationDown();
        assertEquals(9, radio.getStationNumber());
    }

    @Test
    void shouldTestStationAndVolumeNoArgsConstructor() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.setVolume(55);
        radio.stationDown();
        radio.volumeDown();
        assertEquals(4, radio.getStationNumber());
        assertEquals(54, radio.getVolume());
    }
}