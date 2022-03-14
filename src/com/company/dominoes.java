package com.company;

public class dominoes {
    int Side1;
    int side2;

    public dominoes(int side1, int side2) {
        Side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return Side1;
    }

    public void setSide1(int side1) {
        Side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
