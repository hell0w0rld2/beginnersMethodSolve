package com.company;

import java.util.ArrayList;


public class cross {
    ArrayList<String> blueMoves = new ArrayList<>();
    ArrayList<String> orangeMoves = new ArrayList<>();
    ArrayList<String> redMoves = new ArrayList<>();
    ArrayList<String> greenMoves = new ArrayList<>();

    int bluePiecePosition;
    int orangePiecePosition;
    int redPiecePosition;
    int greenPiecePosition;

    public void blueSolver(){  //solves the blue/white piece
        moveSelector ms = new moveSelector();
        ms.moveLogic();
        for(int i = 0; i < ms.numbers.size(); i++){
            if (ms.numbers.get(i) == 11) {
                bluePiecePosition = i;
            }
        }
        if(bluePiecePosition == 1){
            blueMoves.add("U2");
            blueMoves.add("F2");
        }
        else if(bluePiecePosition == 3){
            blueMoves.add("U'");
            blueMoves.add("F2");
        }
        else if(bluePiecePosition == 5){
            blueMoves.add("U");
            blueMoves.add("F2");
        }
        else if(bluePiecePosition == 7){
            blueMoves.add("F2");
        }
        else if(bluePiecePosition == 10){
            blueMoves.add("L");
            blueMoves.add("F'");
            blueMoves.add("L'");
        }
        else if(bluePiecePosition == 13){
            blueMoves.add("U'");
            blueMoves.add("R'");
            blueMoves.add("F");
            blueMoves.add("R");
        }
        else if(bluePiecePosition == 16){
            blueMoves.add("R'");
            blueMoves.add("F");
            blueMoves.add("R");
        }
        else if(bluePiecePosition == 19){
            blueMoves.add("U");
            blueMoves.add("R'");
            blueMoves.add("F");
            blueMoves.add("R");
        }
        else if(bluePiecePosition == 21){
            blueMoves.add(("B"));
            blueMoves.add("D2");
        }
        else if(bluePiecePosition == 23){
            blueMoves.add(("F'"));
        }
        else if(bluePiecePosition == 24){
            blueMoves.add("L");
            blueMoves.add("D");
        }
        else if(bluePiecePosition == 26){
            blueMoves.add("R'");
            blueMoves.add("D");
        }
        else if(bluePiecePosition == 27){
            blueMoves.add("F");
        }
        else if(bluePiecePosition == 29){
            blueMoves.add("B'");
            blueMoves.add("D2");
        }
        else if(bluePiecePosition == 30){
            blueMoves.add("R");
            blueMoves.add("D'");
        }
        else if(bluePiecePosition == 32){
            blueMoves.add("L'");
            blueMoves.add("D");
        }
        else if(bluePiecePosition == 34){
            blueMoves.add("L'");
            blueMoves.add("F'");
        }
        else if(bluePiecePosition == 37){
            blueMoves.add("F2");
            blueMoves.add("U'");
            blueMoves.add("R'");
            blueMoves.add("F");
            blueMoves.add("R");
        }
        else if(bluePiecePosition == 40){
            blueMoves.add("R");
            blueMoves.add("F");
        }
        else if(bluePiecePosition == 43){
            blueMoves.add("B2");
            blueMoves.add("U");
            blueMoves.add("R'");
            blueMoves.add("F");
            blueMoves.add("R");
        }
        else if(bluePiecePosition == 48){
            blueMoves.add("D");
        }
        else if(bluePiecePosition == 50){
            blueMoves.add("D'");
        }
        else if(bluePiecePosition == 52){
            blueMoves.add("D2");
        }
    }

    public void orangeSolver(){ //solves orange/white edge
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.moveLogic();
        for(int i = 0; i < ms.numbers.size(); i++) {

            if (ms.numbers.get(i) == 13){
                orangePiecePosition = i;
            }
        }
        if(orangePiecePosition == 1){
            orangeMoves.add("U'");
            orangeMoves.add("L2");
        }
        else if(orangePiecePosition == 3){
            orangeMoves.add("L2");
        }
        else if(orangePiecePosition == 5){
            orangeMoves.add("U2");
            orangeMoves.add("L2");
        }
        else if(orangePiecePosition == 7){
            orangeMoves.add("U");
            orangeMoves.add("L2");
        }
        else if(orangePiecePosition == 10){
            orangeMoves.add("U'");
            orangeMoves.add("F'");
            orangeMoves.add("L");
            orangeMoves.add("F");
        }
        else if(orangePiecePosition == 13){
            orangeMoves.add("F'");
            orangeMoves.add("L");
            orangeMoves.add("F");
        }
        else if(orangePiecePosition == 16){
            orangeMoves.add("U");
            orangeMoves.add("F'");
            orangeMoves.add("L");
            orangeMoves.add("F");
        }
        else if(orangePiecePosition == 19){
            orangeMoves.add("B");
            orangeMoves.add("L'");
            orangeMoves.add("B'");
        }
        else if(orangePiecePosition == 21){
            orangeMoves.add("D'");
            orangeMoves.add("B");
            orangeMoves.add("D");
        }
        else if(orangePiecePosition == 23){
            orangeMoves.add("D");
            orangeMoves.add("F'");
            orangeMoves.add("D'");
        }
        else if(orangePiecePosition == 24){
            orangeMoves.add("L");
        }
        else if(orangePiecePosition == 26){
            orangeMoves.add("F2");
            orangeMoves.add("L");
            orangeMoves.add("F2");
        }
        else if(orangePiecePosition == 27){
            orangeMoves.add("D");
            orangeMoves.add("F");
            orangeMoves.add("D'");
        }
        else if(orangePiecePosition == 29){
            orangeMoves.add("D'");
            orangeMoves.add("B'");
            orangeMoves.add("D");
        }
        else if(orangePiecePosition == 30){
            orangeMoves.add("B2");
            orangeMoves.add("L'");
            orangeMoves.add("B2");
        }
        else if(orangePiecePosition == 32){
            orangeMoves.add("L'");
        }
        else if(orangePiecePosition == 34){
            orangeMoves.add("L2");
            orangeMoves.add("U'");
            orangeMoves.add("F'");
            orangeMoves.add("L");
            orangeMoves.add("F");
        }
        else if(orangePiecePosition == 40){
            orangeMoves.add("R2");
            orangeMoves.add("U");
            orangeMoves.add("F'");
            orangeMoves.add("L");
            orangeMoves.add("F");
        }
        else if(orangePiecePosition == 43){
            orangeMoves.add("B'");
            orangeMoves.add("L'");
        }
        else if(orangePiecePosition == 50){
            orangeMoves.add("R2");
            orangeMoves.add("U2");
            orangeMoves.add("L2");
        }
        else if(orangePiecePosition == 52){
            orangeMoves.add("B2");
            orangeMoves.add("U'");
            orangeMoves.add("L2");
        }
    }

    public void redSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.moveLogic();
        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 15){
                redPiecePosition = i;
            }

        }
        if(redPiecePosition == 1){
            redMoves.add("U");
            redMoves.add("R2");
        }
        else if(redPiecePosition == 3){
            redMoves.add("U2");
            redMoves.add("R2");
        }
        else if(redPiecePosition == 5){
            redMoves.add("R2");
        }
        else if(redPiecePosition == 7){
            redMoves.add("U'");
            redMoves.add("R2");
        }
        else if(redPiecePosition == 10){
            redMoves.add("U'");
            redMoves.add("F");
            redMoves.add("R'");
            redMoves.add("F'");
        }
        else if(redPiecePosition == 13){
            redMoves.add("F");
            redMoves.add("R'");
            redMoves.add("F'");
        }
        else if(redPiecePosition == 16){
            redMoves.add("U");
            redMoves.add("F");
            redMoves.add("R'");
            redMoves.add("F'");
        }
        else if(redPiecePosition == 19){
            redMoves.add("B'");
            redMoves.add("R");
            redMoves.add("B");
        }
        else if(redPiecePosition == 21){
            redMoves.add("D");
            redMoves.add("B");
            redMoves.add("D'");
        }
        else if(redPiecePosition == 23){
            redMoves.add("D'");
            redMoves.add("F'");
            redMoves.add("D");
        }
        else if(redPiecePosition == 24){
            redMoves.add("F2");
            redMoves.add("R'");
            redMoves.add("F2");
        }
        else if(redPiecePosition == 26){
            redMoves.add("R'");
        }
        else if(redPiecePosition == 27){
            redMoves.add("D'");
            redMoves.add("F");
            redMoves.add("D");
        }
        else if(redPiecePosition == 29){
            redMoves.add("D");
            redMoves.add("B'");
            redMoves.add("D'");
        }
        else if(redPiecePosition == 30){
            redMoves.add("R");
        }
        else if(redPiecePosition == 32){
            redMoves.add("B2");
            redMoves.add("R");
            redMoves.add("B2");
        }
        else if(redPiecePosition == 40){
            redMoves.add("R2");
            redMoves.add("U");
            redMoves.add("F");
            redMoves.add("R'");
            redMoves.add("F'");
        }
        else if(redPiecePosition == 43){
            redMoves.add("B");
            redMoves.add("R");
        }
        else if(redPiecePosition == 52){
            redMoves.add("B2");
            redMoves.add("U");
            redMoves.add("R2");
        }
    }
    public void greenSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.moveLogic();
        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 17){
                greenPiecePosition = i;
            }
        }
        if(greenPiecePosition == 1){
            greenMoves.add("B2");
        }
        else if(greenPiecePosition == 3){
            greenMoves.add("U");
            greenMoves.add("B2");
        }
        else if(greenPiecePosition == 5){
            greenMoves.add("U'");
            greenMoves.add("B2");
        }
        else if(greenPiecePosition == 7){
            greenMoves.add("U2");
            greenMoves.add("B2");
        }
        else if(greenPiecePosition == 10){
            greenMoves.add("L'");
            greenMoves.add("B");
            greenMoves.add("L");
        }
        else if(greenPiecePosition == 13){
            greenMoves.add("U'");
            greenMoves.add("R");
            greenMoves.add("B'");
            greenMoves.add("R'");
        }
        else if(greenPiecePosition == 16){
            greenMoves.add("R");
            greenMoves.add("B'");
            greenMoves.add("R'");
        }
        else if(greenPiecePosition == 19){
            greenMoves.add("U");
            greenMoves.add("R");
            greenMoves.add("B'");
            greenMoves.add("R'");
        }
        else if(greenPiecePosition == 21){
            greenMoves.add("B");
        }
        else if(greenPiecePosition == 23){
            greenMoves.add("L2");
            greenMoves.add("B");
            greenMoves.add("L2");
        }
        else if(greenPiecePosition == 24){
            greenMoves.add("D");
            greenMoves.add("L");
            greenMoves.add("D'");
        }
        else if(greenPiecePosition == 26){
            greenMoves.add("D'");
            greenMoves.add("R'");
            greenMoves.add("D");
        }
        else if(greenPiecePosition == 27){
            greenMoves.add("R2");
            greenMoves.add("B'");
            greenMoves.add("R2");
        }
        else if(greenPiecePosition == 29){
            greenMoves.add("B'");
        }
        else if(greenPiecePosition == 30){
            greenMoves.add("D'");
            greenMoves.add("R");
            greenMoves.add("D");
        }
        else if(greenPiecePosition == 32){
            greenMoves.add("D");
            greenMoves.add("L'");
            greenMoves.add("D'");
        }
        else if(greenPiecePosition == 43){
            greenMoves.add("B2");
            greenMoves.add("U");
            greenMoves.add("R'");
            greenMoves.add("B'");
            greenMoves.add("R");
        }
    }

}

