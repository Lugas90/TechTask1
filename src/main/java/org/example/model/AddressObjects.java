package org.example.model;


import java.util.List;

public class AddressObjects {

    private List<Objects> objects;

    public AddressObjects() {
    }

    public void setObject(List<Objects> objects) {
        this.objects = objects;
    }

    public List<Objects> getObjects() {
        return objects;
    }

    @Override
    public String toString() {
        return "AddressObjects{" +
                "objects=" + objects +
                '}';
    }
}
