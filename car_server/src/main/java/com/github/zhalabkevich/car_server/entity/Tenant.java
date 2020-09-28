package com.github.zhalabkevich.car_server.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "PK", sequenceName = "t_tenant_seq")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "tenant")
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
        return getName().equals(tenant.getName()) &&
                Objects.equals(getCars(), tenant.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCars());
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
