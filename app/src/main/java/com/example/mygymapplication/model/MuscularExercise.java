package com.example.mygymapplication.model;

import com.example.mygymapplication.constant.ExerciseTool;

public class MuscularExercise extends Exercise {
    private int repetition;
    private int set;
    private ExerciseTool tool;
    private int duration;
    private int restTime;
    private float weight;
    private String muscleGroup;
    private String muscle;

    public int getRepetition() {
        return this.repetition;
    }
    public int getSet() {
        return this.set;
    }
    public ExerciseTool getTool () {
        return this.tool;
    }
    public int getDuration() {
        return this.duration;
    }
    public int getRestTime() {
        return this.restTime;
    }
    public float getWeight() {
        return this.weight;
    }

    public String getMuscleGroup() {
        return this.muscleGroup;
    }

    public String getMuscle() {
        return this.muscle;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }
    public void setSet(int set) {
        this.set = set;
    }
    public void getTool(ExerciseTool tool) {
        this.tool = tool;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }
}
