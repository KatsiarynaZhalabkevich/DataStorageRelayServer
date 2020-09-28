package com.github.zhalabkevich.registration.model;

public enum Permission {
    CARS_READ("cars:read"),
    CARS_WRITE("cars:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
