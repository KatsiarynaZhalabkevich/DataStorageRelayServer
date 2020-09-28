package com.github.zhalabkevich.validation.model;

import java.util.List;
import java.util.Objects;

public class Tenant {
    private Long id;
    private String name;
    private List<Car> cars;

    public Tenant() {
    }

    public Tenant(Long id, String name, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenant tenant = (Tenant) o;
        return Objects.equals(getId(), tenant.getId()) &&
                Objects.equals(getName(), tenant.getName()) &&
                Objects.equals(getCars(), tenant.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCars());
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
