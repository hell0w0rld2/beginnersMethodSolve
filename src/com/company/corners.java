package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class corners {
    ArrayList<String> rbMoves = new ArrayList<>();
    ArrayList<String> obMoves = new ArrayList<>();
    ArrayList<String> rgMoves = new ArrayList<>();
    ArrayList<String> ogMoves = new ArrayList<>();
    ArrayList<String> rightFrontSexy = new ArrayList<>(Arrays.asList("R", "U", "R'"));
    ArrayList<String> leftFrontSexy = new ArrayList<>(Arrays.asList("L'", "U'", "L"));
    ArrayList<String> rightBackSexy = new ArrayList<>(Arrays.asList("R'", "U'", "R"));
    ArrayList<String> leftBackSexy = new ArrayList<>(Arrays.asList("L", "U", "L'"));

    int rbPosition, obPosition, rgPosition, ogPosition;
    public void rbCornerSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.moveLogic();


        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 12){
                rbPosition = i;
            }
        }
        if(rbPosition == 0){
            rbMoves.add("U2");
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 2){
            rbMoves.add("U");
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 6){
            rbMoves.add("U'");
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 8){
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 9){
            rbMoves.add("U2");
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 11){
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 12){
            rbMoves.add("U'");
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 14){
            rbMoves.add("U");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 15){
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 17){
            rbMoves.add("U2");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 18){
            rbMoves.add("U");
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 20){
            rbMoves.add("U'");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 33){
            rbMoves.addAll(leftBackSexy);
            rbMoves.add("U");
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 35){
            rbMoves.addAll(leftFrontSexy);
            rbMoves.add("U");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 36){
            rbMoves.addAll(leftFrontSexy);
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 38){
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
            rbMoves.add("U");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 39){
            for(int i = 0; i < 2; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 41){
            rbMoves.addAll(rightBackSexy);
            rbMoves.add("U'");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 42){
            rbMoves.addAll(rightBackSexy);
            rbMoves.add("U2");
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 44){
            rbMoves.addAll(leftBackSexy);
            rbMoves.add("U");
            for(int i = 0; i < 3; i++){
                rbMoves.addAll(rightFrontSexy);
                rbMoves.add("U'");
            }
        }
        else if(rbPosition == 45){
            rbMoves.addAll(leftFrontSexy);
            rbMoves.addAll(rightFrontSexy);
        }
        else if(rbPosition == 51){
            rbMoves.addAll(leftBackSexy);
            rbMoves.add("U2");
            rbMoves.add("R");
            rbMoves.add("U'");
            rbMoves.add("R'");
        }
        else if(rbPosition == 53){
            rbMoves.addAll(rightBackSexy);
            rbMoves.add("U2");
            rbMoves.addAll(rightFrontSexy);
        }
    }
    public void obCornerSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.moveLogic();
        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 10){
                obPosition = i;
            }
        }
        if(obPosition == 0){
            obMoves.add("U'");
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 2){
            obMoves.add("U2");
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 6){
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 8){
            obMoves.add("U");
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 9){
            obMoves.add("U2");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 11){
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 12){
            obMoves.add("U'");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 14){
            obMoves.add("U");
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 15){
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 17){
            obMoves.add("U2");
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 18){
            obMoves.add("U");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 20){
            obMoves.add("U'");
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 33){
            obMoves.addAll(leftBackSexy);
            obMoves.add("U");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 35){
            for(int i = 0; i < 2; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 36){
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
            obMoves.add("U'");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 38){
            obMoves.addAll(rightFrontSexy);
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 39){
            obMoves.addAll(rightFrontSexy);
            obMoves.add("U'");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
        else if(obPosition == 41){
            obMoves.addAll(rightBackSexy);
            obMoves.add("U'");
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 42){
            obMoves.addAll(rightBackSexy);
            obMoves.add("U'");
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 44){
            obMoves.addAll(leftBackSexy);
            obMoves.add("U2");
            for(int i = 0; i < 3; i++){
                obMoves.addAll(leftFrontSexy);
                obMoves.add("U");
            }
        }
        else if(obPosition == 51){
            obMoves.addAll(leftBackSexy);
            obMoves.add("U2");
            obMoves.addAll(leftFrontSexy);
        }
        else if(obPosition == 53){
            obMoves.addAll(rightBackSexy);
            obMoves.add("U2");
            obMoves.add("L'");
            obMoves.add("U");
            obMoves.add("L");
        }
    }
    public void ogCornerSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.obMoveIntegration();
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 16){
                ogPosition = i;
            }
        }
        if(ogPosition == 0){
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 2){
            ogMoves.add("U'");
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 6){
            ogMoves.add("U");
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 8){
            ogMoves.add("U2");
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 9){
            ogMoves.addAll(leftBackSexy);
        }
        else if(ogPosition == 11){
            ogMoves.add("U2");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 12){
            ogMoves.add("U");
            ogMoves.addAll(leftBackSexy);
        }
        else if(ogPosition == 14){
            ogMoves.add("U'");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 15){
            ogMoves.add("U2");
            ogMoves.addAll(leftBackSexy);
        }
        else if(ogPosition == 17){
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 18){
            ogMoves.add("U'");
            ogMoves.addAll(leftBackSexy);
        }
        else if(ogPosition == 20){
            ogMoves.add("U");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 33){
            for(int i = 0; i < 2; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 35){
            ogMoves.addAll(leftFrontSexy);
            ogMoves.add("U'");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 36){
            ogMoves.addAll(leftFrontSexy);
            ogMoves.add("U2");
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 38){
            ogMoves.addAll(rightFrontSexy);
            ogMoves.add("U");
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 39){
            ogMoves.addAll(rightFrontSexy);
            ogMoves.add("U");
            ogMoves.addAll(leftBackSexy);
        }
        else if(ogPosition == 41){
            ogMoves.addAll(rightBackSexy);
            ogMoves.add("U");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 42){
            ogMoves.addAll(rightBackSexy);
            for(int i = 0; i < 3; i++){
                ogMoves.addAll(leftBackSexy);
                ogMoves.add("U'");
            }
        }
        else if(ogPosition == 44){
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
            ogMoves.add("U");
            ogMoves.add("L");
            ogMoves.add("U'");
            ogMoves.add("L'");
        }
        else if(ogPosition == 53){
            ogMoves.addAll(rightBackSexy);
            ogMoves.addAll(leftBackSexy);
        }
    }
    public void rgCornerSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.obMoveIntegration();
        ms.ogMoveIntegration();
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 18){
                rgPosition = i;
            }
        }
        if(rgPosition == 0){
            rgMoves.add("U");
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 2){
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 6){
            rgMoves.add("U2");
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 8){
            rgMoves.add("U'");
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 9){
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 11){
            rgMoves.add("U2");
            rgMoves.addAll(rightBackSexy);
        }
        else if(rgPosition == 12){
            rgMoves.add("U");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 14){
            rgMoves.add("U'");
            rgMoves.addAll(rightBackSexy);
        }
        else if(rgPosition == 15){
            rgMoves.add("U2");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 17){
            rgMoves.addAll(rightBackSexy);
        }
        else if(rgPosition == 18){
            rgMoves.add("U'");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 20){
            rgMoves.add("U");
            rgMoves.addAll(rightBackSexy);
        }
        else if(rgPosition == 33){
            rgMoves.addAll(leftBackSexy);
            rgMoves.add("U'");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 35){
            rgMoves.addAll(leftFrontSexy);
            rgMoves.add("U'");
            rgMoves.addAll(rightBackSexy);
        }
        else if(rgPosition == 36){
            rgMoves.addAll(leftFrontSexy);
            rgMoves.add("U'");
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 38){
            rgMoves.addAll(rightFrontSexy);
            rgMoves.add("U2");
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 39){
            rgMoves.addAll(rightFrontSexy);
            rgMoves.add("U");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 41){
            for(int i = 0; i < 2; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
        else if(rgPosition == 42){
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
            rgMoves.add("U'");
            rgMoves.add("R'");
            rgMoves.add("U");
            rgMoves.add("R");
        }
        else if(rgPosition == 44){
            rgMoves.addAll(leftBackSexy);
            for(int i = 0; i < 3; i++){
                rgMoves.addAll(rightBackSexy);
                rgMoves.add("U");
            }
        }
    }
}
