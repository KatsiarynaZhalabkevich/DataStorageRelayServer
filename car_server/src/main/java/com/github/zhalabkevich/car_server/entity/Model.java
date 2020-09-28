package com.github.zhalabkevich.car_server.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@SequenceGenerator(name = "PK", sequenceName = "t_model_seq")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK")
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @OneToMany(mappedBy = "model")
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return getName().equals(model.getName()) &&
                Objects.equals(getBrand(), model.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBrand());
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                '}';
    }

}
