package com.github.zhalabkevich.car_server.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@DynamicUpdate
@SequenceGenerator(name = "PK", sequenceName = "t_state_seq")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK")
    private Long id;
    @OneToOne(mappedBy = "state")
    private Car car;
    private String timeIn;
    private String timeOut;
    private Date  date; //Calendar or date
    private boolean isAbsent; //lastFlag

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
                getCar().equals(state.getCar()) &&
                Objects.equals(getTimeIn(), state.getTimeIn()) &&
                Objects.equals(getTimeOut(), state.getTimeOut()) &&
                Objects.equals(getDate(), state.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCar(), getTimeIn(), getTimeOut(), getDate(), isAbsent());
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", car=" + car +
                ", timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                ", date=" + date +
                ", isAbsent=" + isAbsent +
                '}';
    }
}
