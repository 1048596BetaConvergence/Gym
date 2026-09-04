package com.example.mygymapplication.model;

import java.util.ArrayList;
public class WorkoutDay extends Day {
    private final ArrayList<Exercise> workoutExercises = new ArrayList<>();

    public ArrayList<Exercise> getWorkoutDay() {
        return this.workoutExercises;
    }
    public void addExercise(Exercise exercise) {
        this.workoutExercises.add(exercise);
    }
    public void removeExercise(Exercise exercise) {
        this.workoutExercises.remove(exercise);
    }

}
