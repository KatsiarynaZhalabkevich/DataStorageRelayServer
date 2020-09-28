package com.github.zhalabkevich.car_server.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@SequenceGenerator(name = "PK", sequenceName = "t_brand_seq")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "brand")
    private List<Model> models;
    @OneToMany(mappedBy = "brand")
    private List<Car> cars;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return getName().equals(brand.getName()) &&
                Objects.equals(getModels(), brand.getModels());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModels());
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", models=" + models +
                '}';
    }
}
