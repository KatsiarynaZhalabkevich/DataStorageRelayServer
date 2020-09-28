package com.github.zhalabkevich.validation.model;

import java.util.List;
import java.util.Objects;

public class Model {
    private Long id;
    private String name;
    private Brand brand;
    private List<Car> cars;

    public Model() {
    }

    public Model(Long id, String name, Brand brand, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.brand = brand;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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
        Model model = (Model) o;
        return Objects.equals(getId(), model.getId()) &&
                Objects.equals(getName(), model.getName()) &&
                Objects.equals(getBrand(), model.getBrand()) &&
                Objects.equals(getCars(), model.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBrand(), getCars());
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", cars=" + cars +
                '}';
    }
}
