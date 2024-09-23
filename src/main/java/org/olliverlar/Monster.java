package org.olliverlar;

public class Monster implements Movable{
    private int x, y;
    private int health;
    private int strength;

    public Monster(int x, int y, int health, int strength) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.strength = strength;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void move(int changeX, int changeY, Maze maze) {
        int newX = x + changeX;
        int newY = y + changeY;

        if (maze.getItem(newX, newY) != '#') {
            x = newX;
            y = newY;
            System.out.println("Monster moved to " + x + ", " + y);
        }
        else {
            System.out.println("Monster tried to move through a wall!");
        }
}}
