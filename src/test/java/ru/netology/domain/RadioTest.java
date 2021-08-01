package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldIncreaseCurrentStationBelowMaxStation() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation() - 1;
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationEqualMaxStation() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation();
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        int expected = radio.getMinStation();
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
        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationEqualMaxStation() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation();
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        int expected = radio.getMaxStation() - 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCurrentStationAboveMaxStation() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation() + 5;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCurrentStationBelowMinStation() {
        Radio radio = new Radio();
        int currentStation = radio.getMinStation() - 5;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBelowMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 98;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int expected = 100;
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

    @Test
    public void shouldReturnCurrentVolumeAboveMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 115;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCurrentVolumeBelowMinVolume() {
        Radio radio = new Radio();
        int currentVolume = -8;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation77() {
        Radio radio = new Radio(77);
        int currentStation = radio.getMaxStation();
        radio.setCurrentStation(currentStation);
        int expected = 77;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }


}