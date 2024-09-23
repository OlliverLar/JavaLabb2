package org.olliverlar;

public class Item {
    protected int x, y;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPosition() {
        return new int[] {x, y};
    }

    public void onPickUp(Player player) {
        System.out.println("Item picked up");
    }
}
