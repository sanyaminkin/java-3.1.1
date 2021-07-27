package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentStationBelowMaxStation() {
        Radio radio = new Radio();
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationEqualMaxStation() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationEqualMinStation() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationAboveMinStation() {
        Radio radio = new Radio();
        int currentStation = 3;
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationEqualMinStation() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationEqualMaxStation() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test void shouldReturnCurrentStationAboveMaxStation() {
        Radio radio = new Radio();
        int currentStation = 12;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test void shouldReturnCurrentStationBelowMinStation() {
        Radio radio = new Radio();
        int currentStation = -5;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBelowMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolumeAboveMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 2;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolumeEqualMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test void shouldReturnCurrentVolumeAboveMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 15;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test void shouldReturnCurrentVolumeBelowMinVolume() {
        Radio radio = new Radio();
        int currentVolume = -8;
        radio.setCurrentVolume(currentVolume);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}