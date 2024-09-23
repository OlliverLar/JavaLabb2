package org.olliverlar;

import java.util.ArrayList;
import java.util.List;

public class Player implements Movable {
    private String playerName;
    private int x, y;
    private int playerHealth;
    private int playerStrength;
    private List<Item> inventory;

    public Player(String playerName, int playerPositionX, int playerPositionY) {
        this.playerName = playerName;
        this.x = playerPositionX;
        this.y = playerPositionY;
        this.playerHealth = 100;
        this.playerStrength = 10;
        this.inventory = new ArrayList<>();
    }

    @Override
    public void move(int changeX, int changeY, Maze maze) {
        int newX = x + changeX;
        int newY = y + changeY;


    if (maze.getItem(newX, newY) != '#') {
        x = newX;
        y = newY;
        System.out.println(playerName + " moved to " + x + ", " + y);
    }
    else {
        System.out.println("There is a wall in the way!");
    }
}   public void pickUpItem(Item item) {
        if (item.getPosition()[0] == x && item.getPosition()[1] == y) {
            item.onPickUp(this);
            System.out.println(playerName + " picked up an item");
        } else {
            System.out.println("No item to pick up");
        }
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
