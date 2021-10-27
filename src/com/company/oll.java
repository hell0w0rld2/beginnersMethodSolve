package com.company;
import java.util.Arrays;
import java.util.ArrayList;

public class oll {
    ArrayList<String> lineCase = new ArrayList<>(Arrays.asList("F", "R", "U", "R'", "U'", "F'"));
    ArrayList<String> lCase = new ArrayList<>(Arrays.asList("F", "U", "R", "U'", "R'", "F'"));
    ArrayList<String> sune = new ArrayList<>(Arrays.asList("R", "U", "R'", "U", "R", "U2", "R'"));
    String edgeCase, cornerCase;
    ArrayList<String> edgeMoves = new ArrayList<>();
    ArrayList<String> cornerMoves = new ArrayList<>();

    public void ollEdgeSolver() {
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.obMoveIntegration();
        ms.ogMoveIntegration();
        ms.rgMoveIntegration();
        ms.firstIntegration();
        ms.secondIntegration();
        ms.thirdIntegration();
        ms.lastIntegration();
        ms.moveLogic();


        if (ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(3) >= 37 && ms.numbers.get(3) <= 44 &&
                ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) {
            edgeCase = "solved";
        }
        else if ((ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(3) >= 37 && ms.numbers.get(3) <= 44) ||
                (ms.numbers.get(3) >= 37 && ms.numbers.get(3) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) ||
                (ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) ||
                (ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44)) {
            edgeCase = "lCase";
        }
        else if((ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) ||
                (ms.numbers.get(3) >= 37 && ms.numbers.get(3) <= 44 && ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44)){
            edgeCase = "lineCase";
        }
        else {
            edgeCase = "dotCase";
        }

        switch (edgeCase) {
            case "lCase":
                if (ms.numbers.get(3) >= 37 && ms.numbers.get(3) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) {
                    edgeMoves.add("U");
                } else if (ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) {
                    edgeMoves.add("U2");
                } else if (ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(5) >= 37 && ms.numbers.get(5) <= 44) {
                    edgeMoves.add("U'");

                }
                edgeMoves.addAll(lCase);
                break;
            case "lineCase":
                if (ms.numbers.get(1) >= 37 && ms.numbers.get(1) <= 44 && ms.numbers.get(7) >= 37 && ms.numbers.get(7) <= 44) {
                    edgeMoves.add("U");
                }
                edgeMoves.addAll(lineCase);
                break;
            case "dotCase":
                edgeMoves.addAll(lineCase);
                edgeMoves.add("U2");
                edgeMoves.addAll(lCase);
                break;
        }
    }

    public void ollCornerSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.obMoveIntegration();
        ms.ogMoveIntegration();
        ms.rgMoveIntegration();
        ms.firstIntegration();
        ms.secondIntegration();
        ms.thirdIntegration();
        ms.lastIntegration();
        ms.ollEdgeIntegration();
        ms.moveLogic();


        if(ms.numbers.get(0) >= 37 && ms.numbers.get(0) <= 44 && ms.numbers.get(2) >= 37 && ms.numbers.get(2) <= 44 &&
                ms.numbers.get(6) >= 37 && ms.numbers.get(6) <= 44 && ms.numbers.get(8) >= 37 && ms.numbers.get(8) <= 44){
            cornerCase = "solved";
        }
        else if((ms.color.get(0).equals("Yellow") && ms.color.get(11).equals("Yellow") && ms.color.get(14).equals("Yellow") && ms.color.get(17).equals("Yellow"))
                || (ms.color.get(2).equals("Yellow") && ms.color.get(11).equals("Yellow") && ms.color.get(14).equals("Yellow") && ms.color.get(20).equals("Yellow"))
                || (ms.color.get(6).equals("Yellow") && ms.color.get(20).equals("Yellow") && ms.color.get(14).equals("Yellow") && ms.color.get(17).equals("Yellow"))
                || (ms.color.get(8).equals("Yellow") && ms.color.get(11).equals("Yellow") && ms.color.get(20).equals("Yellow") && ms.color.get(17).equals("Yellow"))){
            cornerCase = "sune";
        }
        else if((ms.color.get(0).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(15).equals("Yellow") && ms.color.get(18).equals("Yellow"))
                || (ms.color.get(2).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(15).equals("Yellow") && ms.color.get(9).equals("Yellow"))
                || (ms.color.get(6).equals("Yellow") && ms.color.get(9).equals("Yellow") && ms.color.get(15).equals("Yellow") && ms.color.get(18).equals("Yellow"))
                || (ms.color.get(0).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(9).equals("Yellow") && ms.color.get(18).equals("Yellow"))){
            cornerCase = "anti-sune";
        }
        else if((ms.color.get(9).equals("Yellow") && ms.color.get(11).equals("Yellow") && ms.color.get(15).equals("Yellow") && ms.color.get(17).equals("Yellow"))
                || (ms.color.get(12).equals("Yellow") && ms.color.get(14).equals("Yellow") && ms.color.get(18).equals("Yellow") && ms.color.get(20).equals("Yellow"))){
            cornerCase = "h";
        }
        else if((ms.color.get(0).equals("Yellow") && ms.color.get(2).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(14).equals("Yellow"))
                || (ms.color.get(2).equals("Yellow") && ms.color.get(8).equals("Yellow") && ms.color.get(9).equals("Yellow") && ms.color.get(11).equals("Yellow"))
                || (ms.color.get(6).equals("Yellow") && ms.color.get(8).equals("Yellow") && ms.color.get(18).equals("Yellow") && ms.color.get(20).equals("Yellow"))
                || (ms.color.get(0).equals("Yellow") && ms.color.get(6).equals("Yellow") && ms.color.get(15).equals("Yellow") && ms.color.get(17).equals("Yellow"))){
            cornerCase = "u";
        }
        else if((ms.color.get(0).equals("Yellow") && ms.color.get(2).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(15).equals("Yellow"))
                || (ms.color.get(2).equals("Yellow") && ms.color.get(8).equals("Yellow") && ms.color.get(12).equals("Yellow") && ms.color.get(20).equals("Yellow"))
                || (ms.color.get(6).equals("Yellow") && ms.color.get(8).equals("Yellow") && ms.color.get(9).equals("Yellow") && ms.color.get(17).equals("Yellow"))
                || (ms.color.get(0).equals("Yellow") && ms.color.get(6).equals("Yellow") && ms.color.get(14).equals("Yellow") && ms.color.get(18).equals("Yellow"))){
            cornerCase = "t";
        }
        else if((ms.color.get(0).equals("Yellow") && ms.color.get(8).equals("Yellow")) || (ms.color.get(1).equals("Yellow") && ms.color.get(6).equals("Yellow"))){
            cornerCase = "l";
        }
        else{
            cornerCase = "pi";
        }

        switch (cornerCase) {
            case "sune":
                if (ms.color.get(0).equals("Yellow")) {
                    cornerMoves.add("U'");
                } else if (ms.color.get(2).equals("Yellow")) {
                    cornerMoves.add("U2");
                } else if (ms.color.get(8).equals("Yellow")) {
                    cornerMoves.add("U");
                }
                cornerMoves.addAll(sune);
                break;
            case "anti-sune":
                if (ms.color.get(0).equals("Yellow")) {
                    cornerMoves.add("U'");
                } else if (ms.color.get(2).equals("Yellow")) {
                    cornerMoves.add("U2");
                } else if (ms.color.get(8).equals("Yellow")) {
                    cornerMoves.add("U");
                }
                cornerMoves.addAll(sune);
                cornerMoves.add("U2");
                cornerMoves.addAll(sune);
                break;
            case "h":
                if (ms.color.get(12).equals("Yellow")) {
                    cornerMoves.add("U");
                }
                cornerMoves.addAll(sune);
                cornerMoves.addAll(sune);
                break;
            case "pi":
                if (ms.color.get(12).equals("Yellow") && ms.color.get(14).equals("Yellow")) {
                    cornerMoves.add("U");
                } else if (ms.color.get(15).equals("Yellow") && ms.color.get(17).equals("Yellow")) {
                    cornerMoves.add("U2");
                } else if (ms.color.get(18).equals("Yellow") && ms.color.get(20).equals("Yellow")) {
                    cornerMoves.add("U'");
                }
                cornerMoves.addAll(sune);
                cornerMoves.add("U'");
                cornerMoves.addAll(sune);
                break;
            case "u":
                if (ms.color.get(2).equals("Yellow") && ms.color.get(8).equals("Yellow")) {
                    cornerMoves.add("U'");
                } else if (ms.color.get(6).equals("Yellow") && ms.color.get(8).equals("Yellow")) {
                    cornerMoves.add("U2");
                } else if (ms.color.get(0).equals("Yellow") && ms.color.get(6).equals("Yellow")) {
                    cornerMoves.add("U");
                }
                cornerMoves.addAll(sune);
                cornerMoves.add("U'");
                cornerMoves.addAll(sune);
                cornerMoves.add("U2");
                cornerMoves.addAll(sune);
                break;
            case "t":
                if (ms.color.get(0).equals("Yellow") && ms.color.get(2).equals("Yellow")) {
                    cornerMoves.add("U");
                } else if (ms.color.get(6).equals("Yellow") && ms.color.get(8).equals("Yellow")) {
                    cornerMoves.add("U'");
                } else if (ms.color.get(0).equals("Yellow") && ms.color.get(6).equals("Yellow")) {
                    cornerMoves.add("U2");
                }
                cornerMoves.addAll(sune);
                cornerMoves.add("U");
                cornerMoves.addAll(sune);
                cornerMoves.add("U2");
                cornerMoves.addAll(sune);
                break;
            case "l":
                if (ms.color.get(0).equals("Yellow") && ms.color.get(11).equals("Yellow")) {
                    cornerMoves.add("U2");
                } else if (ms.color.get(2).equals("Yellow") && ms.color.get(9).equals("Yellow")) {
                    cornerMoves.add("U'");
                } else if (ms.color.get(2).equals("Yellow") && ms.color.get(20).equals("Yellow")) {
                    cornerMoves.add("U");
                }
                cornerMoves.addAll(sune);
                cornerMoves.addAll(sune);
                cornerMoves.add("U2");
                cornerMoves.addAll(sune);
                break;
        }
    }
}
