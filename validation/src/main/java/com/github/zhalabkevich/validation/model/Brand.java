package com.github.zhalabkevich.validation.model;

import java.util.List;
import java.util.Objects;

public class Brand {
    private Long id;
    private String name;
    private List<Model> models;
    private List<Car> cars;

    public Brand(Long id, String name, List<Model> models, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.models = models;
        this.cars = cars;
    }

    public Brand() {
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

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
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
        Brand brand = (Brand) o;
        return Objects.equals(getId(), brand.getId()) &&
                Objects.equals(getName(), brand.getName()) &&
                Objects.equals(getModels(), brand.getModels()) &&
                Objects.equals(getCars(), brand.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getModels(), getCars());
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", models=" + models +
                ", cars=" + cars +
                '}';
    }
}
