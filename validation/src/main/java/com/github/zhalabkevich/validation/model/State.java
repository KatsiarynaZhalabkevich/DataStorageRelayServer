package com.github.zhalabkevich.validation.model;

import java.util.Date;
import java.util.Objects;

public class State {
    private Long id;
    private Long carId;
    private String timeIn;
    private String timeOut;
    private Date date; //Calendar or date
    private boolean isAbsent; //lastFlag

    public State(Long id, Long carId, String timeIn, String timeOut, Date date, boolean isAbsent) {
        this.id = id;
        this.carId = carId;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.date = date;
        this.isAbsent = isAbsent;
    }

    public State() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAbsent() {
        return isAbsent;
    }

    public void setAbsent(boolean absent) {
        isAbsent = absent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return isAbsent() == state.isAbsent() &&
                Objects.equals(getId(), state.getId()) &&
                Objects.equals(getCarId(), state.getCarId()) &&
                Objects.equals(getTimeIn(), state.getTimeIn()) &&
                Objects.equals(getTimeOut(), state.getTimeOut()) &&
                Objects.equals(getDate(), state.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarId(), getTimeIn(), getTimeOut(), getDate(), isAbsent());
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", carId=" + carId +
                ", timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                ", date=" + date +
                ", isAbsent=" + isAbsent +
                '}';
    }
}
