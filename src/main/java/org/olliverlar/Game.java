package org.olliverlar;

public class Game {
    public static void main(String[] args) {
        Maze maze = new Maze(10, 10);
        Player player = new Player("Player1", 1, 1);
        Monster monster = new Monster(2, 2, 50, 15);


        Item item1 = new Item(1, 2);
        Item item2 = new Item(2, 2);
        maze.placeItem(1, 2, '#');

        player.move(0, 1, maze);
        player.pickUpItem(item1);
        player.move(1, 0, maze);
        player.pickUpItem(item2);

        monster.move(1, 0, maze);
    }
}