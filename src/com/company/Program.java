package com.company;

public class BattleShipsProgram {

        do

    {
        Position shotCoords = humanPlayer.getShotCoordinates();
        computerPlayer.shootAt(shotCoords);
        computerPlayer.renderMap();

        shotCoords = computerPlayer.getShotCoordinates();
        humanPlayer.shootAt(shotCoords);
        humanPlayer.renderMap();

    }while(computerPlayer.hasFloatingShips()&&humanPlayer.hasFloatingShips());

        if(humanPlayer.hasFloatingShips())

    {
        System.out.println("You WON the game!");
    }
        else

    {
        System.out.println("You lost the game!");
    }

}


