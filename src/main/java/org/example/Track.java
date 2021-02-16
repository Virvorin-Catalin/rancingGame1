package org.example;

public class Track {
    private String name;
    private double length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLenght() {
        return length;
    }

    public void setLenght(double lenght) {
        this.length = lenght;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", lenght=" + length +
                '}';
    }
}
