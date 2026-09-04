package com.example.mygymapplication.model;

public class CadioExercise extends Exercise {
    private float time;
    private float distance;
    private float intensity;
    private int rpm;

    public float getTime() {
        return this.time;
    }
    public float getDistance() {
        return this.distance;
    }
    public float getIntensity() {
        return this.intensity;
    }
    public int getRpm() {
        return this.rpm;
    }
    public void setTime(float time) {
        if (time <= 0) time = 0;
        this.time = time;
    }
    public void setDistance(float distance) {
        if (distance <= 0) distance = 0;
        this.distance = distance;
    }
    public void setIntensity(float intensity) {
        if (intensity <= 0) intensity = 0;
        this.intensity = intensity;
    }
    public void setRpm (int rpm) {
        if (rpm <= 0) rpm = 0;
        this.rpm = rpm;
    }
}
