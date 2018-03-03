package com.example.patel.smartscheduler.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Patel on 3/2/2018.
 */

public class Schedule {
    private Map<Day, List<String>> sched = new HashMap<>();
    private List<Date> busy = new ArrayList<>();

    public Schedule(Map<Day, List<String>> sched, List<Date> busy) {
        this.sched = sched;
        this.busy = busy;
    }

    public Map<Day, List<String>> getSched() {
        return sched;
    }

    public void setSched(Map<Day, List<String>> sched) {
        this.sched = sched;
    }

    public List<Date> getBusy() {
        return busy;
    }

    public void setBusy(List<Date> busy) {
        this.busy = busy;
    }

    public void addDate(Date date) {
        busy.add(date);
    }

    public void removeDate(Date date) {
        busy.remove(date);
    }

    public void editDay(Day day, List<String> times) {
        sched.put(day, times);
    }

}

