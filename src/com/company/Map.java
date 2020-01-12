package com.company;

import java.util.ArrayList;

public class Map {

    private enum SquareState {
        NONE,
        MISS,
        HIT,
    }

    public final static int GRID_SIZE = 5;

    private ArrayList<Ship> ships = new ArrayList<>();

    SquareState[][] grid = new SquareState[GRID_SIZE][GRID_SIZE];

    public Map() {
        //Create grid with all values NONE
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                grid[y][x] = SquareState.NONE;
            }
        }

    }


    private String getSymbol(SquareState squareState) {
        switch (squareState) {
            case HIT:
                return "[*]";
            case MISS:
                return "[x]";
            default:
                return "[ ]";
        }
    }

    private boolean isAnyShipHit(Position pos) {
        for (Ship ship : ships) {
            if (ship.hasPosition(pos))
                return true;
        }
        return false;
    }


    public void render() {
        String xValues = " ";
        for (int i = 0; i < GRID_SIZE; i++) {
            xValues += " " + i + " ";
        }


        public boolean addShip (Position pos,int size){
            Position[] positions = Ship.getPositions(size, pos);
            for (Position shipPosition : positions) {
                for (Ship alreadyAddedShip : ships) {
                    if (alreadyAddedShip.hasPosition(shipPosition)) {
                        return false;
                    }
                }
            }

        }

        if (grid[pos.y][pos.x] != SquareState.HIT) {
            grid[pos.y][pos.x] = SquareState.MISS;
            System.out.println("You missed!");
        }
    }
        else

    {
        System.out.println("You have already shot at this square.");
    }


    public boolean hasFloatingShips() {
        for (Ship ship : ships) {
            if (ship.isFloating())
                return true;
        }
        return false;
    }

}