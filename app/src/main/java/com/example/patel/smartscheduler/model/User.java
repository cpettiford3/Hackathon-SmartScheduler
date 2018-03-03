/**
 * Created by Patel on 3/2/2018.
 */
package com.example.patel.smartscheduler.model;

import java.util.List;

public class User {
    private List<User> friends;
    private List<Goals> goals;
    private BodyInfo bodyInfo;
    private Schedule schedule;
    private List<String> foodLog;
    private List<String> interests;
    private String location;
    private String email;
    private String password;


    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public BodyInfo getBodyInfo() {
        return bodyInfo;
    }

    public void setBodyInfo(BodyInfo bodyInfo) {
        this.bodyInfo = bodyInfo;
    }

    public List<Goals> getGoals() {
        return goals;
    }

    public void setGoals(List<Goals> goals) {
        this.goals = goals;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
}
