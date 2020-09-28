package com.github.zhalabkevich.car_server.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "PK", sequenceName = "t_car_seq")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK")
    private Long id;
    @NonNull
    private String number;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant = null;
    @OneToOne
    @PrimaryKeyJoinColumn
    private State state = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getBrand().equals(car.getBrand()) &&
                getModel().equals(car.getModel()) &&
                Objects.equals(getTenant(), car.getTenant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getTenant());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model=" + model +
                ", tenant=" + tenant +
                ", state=" + state +
                '}';
    }
}
