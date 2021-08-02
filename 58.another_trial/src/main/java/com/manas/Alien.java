package com.manas;


public class Alien {
    private String name;
    private Integer points;

    public Alien() {
    }

    public Alien(String name, Integer points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
