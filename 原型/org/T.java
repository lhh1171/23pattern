package org;

class T extends Object implements Cloneable {
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private int color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
