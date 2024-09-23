package org.olliverlar;

public class Maze {
        private char[][] mazeGrid;

        public Maze(int rows, int cols) {
            mazeGrid = new char[rows][cols];
        }

        public void placeItem(int x, int y, char symbol) {
            mazeGrid[x][y] = symbol;
        }

        public char getItem(int x, int y) {
            return mazeGrid[x][y];
        }





}
