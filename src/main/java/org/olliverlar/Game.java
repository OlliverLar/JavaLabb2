package org.olliverlar;

public class Game {
    public static void main(String[] args) {
        Maze maze = new Maze(10, 10);
        Player player = new Player("Player1", 1, 1);
        Monster monster = new Monster(2, 2, 50, 15);

        maze.placeItem(1, 2, '#');
        maze.placeItem(2, 2, 'T');

        player.move(1, 0, maze);
        player.move(0, 1, maze);

        monster.move(1, 0, maze);
    }
}