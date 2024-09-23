package org.olliverlar;

public class Treasure extends Item {
    private int value;

    public Treasure(int x, int y, int value) {
        super(x, y);
        this.value = value;
    }

    @Override
    public void onPickUp(Player player) {
        System.out.println("You picked up a treasure worth " + value + " points!");
    }
}
