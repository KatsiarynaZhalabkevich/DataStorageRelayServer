package com.github.zhalabkevich.validation.model;

import java.util.Objects;

public class Car {
    private Long id;
    private String number;
    private Long brandId;
    private Long modelId;
    private Long tenantId = null;
    private Long stateId = null;

    public Car() {

    }

    public Car(Long id, String number, Long brandId, Long modelId, Long tenantId, Long stateId) {
        this.id = id;
        this.number = number;
        this.brandId = brandId;
        this.modelId = modelId;
        this.tenantId = tenantId;
        this.stateId = stateId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(getId(), car.getId()) &&
                Objects.equals(getNumber(), car.getNumber()) &&
                Objects.equals(getBrandId(), car.getBrandId()) &&
                Objects.equals(getModelId(), car.getModelId()) &&
                Objects.equals(getTenantId(), car.getTenantId()) &&
                Objects.equals(getStateId(), car.getStateId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), getBrandId(), getModelId(), getTenantId(), getStateId());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", brandId=" + brandId +
                ", modelId=" + modelId +
                ", tenantId=" + tenantId +
                ", stateId=" + stateId +
                '}';
    }
}
