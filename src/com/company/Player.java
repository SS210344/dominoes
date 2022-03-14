package com.company;

import java.util.ArrayList;

public class Player {
    public String name;
    ArrayList<dominoes>tiles;

    public Player(String name, ArrayList<dominoes> tiles) {
        this.name = name;
        this.tiles = tiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<dominoes> getTiles() {
        return tiles;
    }

    public void setTiles(ArrayList<dominoes> tiles) {
        this.tiles = tiles;
    }
}
