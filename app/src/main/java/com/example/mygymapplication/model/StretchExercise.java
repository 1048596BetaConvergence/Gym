package com.example.mygymapplication.model;

public class StretchExercise {
    private int duration;
    private int set;
    private String muscleGroup;
    private String muscle;

    public int getDuration() {
        return this.duration;
    }
    public int getSet() {
        return this.set;
    }
    public String getMuscleGroup() {
        return this.muscleGroup;
    }
    public String getMuscle() {
        return this.muscle;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setSet(int set) {
        this.set = set;
    }
    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }
    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

}
