package com.example.mygymapplication.model;

import java.util.ArrayList;
import java.util.Date;

public class WorkoutCycle {
    private final ArrayList<Day> workoutDays = new ArrayList<>();
    private Date startDate;
    private Date endDate;

    public ArrayList<Day> getWorkoutDay() {
        return this.workoutDays;
    }
    public void addDay(Day day) {
        this.workoutDays.add(day);
    }
    public void removeDay(Day day) {
        this.workoutDays.remove(day);
    }
}
