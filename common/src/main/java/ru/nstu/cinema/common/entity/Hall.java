package ru.nstu.cinema.common.entity;

import org.json.simple.JSONObject;

/**
 * Объект описания зала кинотеатра
 */
public class Hall {

    private int id;
    private String name;
    private String description;
    private JSONObject structure;

    public Hall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JSONObject getStructure() {
        return structure;
    }

    public void setStructure(JSONObject structure) {
        this.structure = structure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hall hall = (Hall) o;

        return id == hall.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", structure=" + structure +
                '}';
    }
}
