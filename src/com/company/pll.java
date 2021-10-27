package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class pll {
    ArrayList<String> cornerAlg = new ArrayList<>(Arrays.asList("R", "U", "R'", "U'", "R'", "F", "R2", "U'", "R'", "U'", "R", "U", "R'", "F'"));
    ArrayList<String> clockwise = new  ArrayList<>(Arrays.asList("F2", "U", "L", "R'", "F2", "L'", "R", "U", "F2"));
    ArrayList<String> counterClockwise = new ArrayList<>(Arrays.asList("F2", "U'", "L", "R'", "F2", "L'", "R", "U'", "F2"));
    ArrayList<String> cornerMoves = new ArrayList<>();
    ArrayList<String> edgeMoves = new ArrayList<>();
    ArrayList<String> aufMoves = new ArrayList<>();
    String edgeCase, cornerCase;


    public void pllCornerSolver(){
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
        ms.ollCornerIntegration();
        ms.moveLogic();

        if(ms.color.get(9).equals(ms.color.get(11)) && ms.color.get(12).equals(ms.color.get(14)) && ms.color.get(15).equals(ms.color.get(17)) && ms.color.get(18).equals(ms.color.get(20))){
            cornerCase = "solved";
        }
        else if((ms.color.get(9).equals("Green") && ms.color.get(11).equals("Green")) || (ms.color.get(9).equals("Orange") && ms.color.get(11).equals("Orange"))
                || (ms.color.get(9).equals("Red") && ms.color.get(11).equals("Red")) || (ms.color.get(9).equals("Blue") && ms.color.get(11).equals("Blue"))){
            cornerMoves.addAll(cornerAlg);
        }
        else if((ms.color.get(12).equals("Green") && ms.color.get(14).equals("Green")) || (ms.color.get(12).equals("Orange") && ms.color.get(14).equals("Orange"))
                || (ms.color.get(12).equals("Red") && ms.color.get(14).equals("Red")) || (ms.color.get(12).equals("Blue") && ms.color.get(14).equals("Blue"))){
            cornerMoves.add("U");
            cornerMoves.addAll(cornerAlg);
        }
        else if((ms.color.get(15).equals("Green") && ms.color.get(17).equals("Green")) || (ms.color.get(15).equals("Orange") && ms.color.get(17).equals("Orange"))
                || (ms.color.get(15).equals("Red") && ms.color.get(17).equals("Red")) || (ms.color.get(15).equals("Blue") && ms.color.get(17).equals("Blue"))){
            cornerMoves.add("U2");
            cornerMoves.addAll(cornerAlg);

        }
        else if((ms.color.get(18).equals("Green") && ms.color.get(20).equals("Green")) || (ms.color.get(18).equals("Orange") && ms.color.get(20).equals("Orange"))
                || (ms.color.get(18).equals("Red") && ms.color.get(20).equals("Red")) || (ms.color.get(18).equals("Blue") && ms.color.get(20).equals("Blue"))){
            cornerMoves.add("U'");
            cornerMoves.addAll(cornerAlg);
        }
        else{
            cornerMoves.addAll(cornerAlg);
            cornerMoves.add("U2");
            cornerMoves.addAll(cornerAlg);
        }
    }
    public void pllEdgeSolver(){
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
        ms.ollCornerIntegration();
        ms.pllCornerIntegration();
        ms.moveLogic();

        if((ms.color.get(10).equals(ms.color.get(15)) && ms.color.get(16).equals(ms.color.get(12))) || (ms.color.get(13).equals(ms.color.get(18)) && ms.color.get(19).equals(ms.color.get(15)))
            || (ms.color.get(16).equals(ms.color.get(9)) && ms.color.get(10).equals(ms.color.get(18))) || (ms.color.get(19).equals(ms.color.get(12)) && ms.color.get(13).equals(ms.color.get(9)))){
            edgeCase = "clockwise";
        }
        else if((ms.color.get(10).equals(ms.color.get(12)) && ms.color.get(16).equals(ms.color.get(9))) || (ms.color.get(13).equals(ms.color.get(15)) && ms.color.get(19).equals(ms.color.get(12)))
                || (ms.color.get(16).equals(ms.color.get(18)) && ms.color.get(10).equals(ms.color.get(15))) || (ms.color.get(19).equals(ms.color.get(9)) && ms.color.get(13).equals(ms.color.get(18)))){
            edgeCase = "counter-clockwise";
        }
        else if(ms.color.get(9).equals(ms.color.get(10)) && ms.color.get(12).equals(ms.color.get(13)) && ms.color.get(15).equals(ms.color.get(16)) && ms.color.get(18).equals(ms.color.get(19))){
            edgeCase = "solved";
        }
        else if((ms.color.get(10).equals(ms.color.get(12)) && ms.color.get(16).equals(ms.color.get(18))) || (ms.color.get(13).equals(ms.color.get(15)) && ms.color.get(19).equals(ms.color.get(9)))){
            edgeCase = "z";
        }
        else if(ms.color.get(10).equals(ms.color.get(15)) && ms.color.get(16).equals(ms.color.get(9))){
            edgeCase = "h";
        }


        switch (edgeCase) {
            case "h":
                edgeMoves.addAll(clockwise);
                edgeMoves.add("U'");
                edgeMoves.addAll(clockwise);
                break;
            case "z":
                if ((ms.numbers.get(13).equals(ms.numbers.get(16) - 3) || ms.numbers.get(13).equals(ms.numbers.get(16) + 9)) && (ms.color.get(12).equals(ms.color.get(16)))) {
                    edgeMoves.add("U");
                }
                edgeMoves.addAll(clockwise);
                edgeMoves.add("U");
                edgeMoves.addAll(clockwise);
                break;
            case "clockwise":
                if (ms.color.get(9).equals(ms.color.get(10))) {
                    edgeMoves.add("U");
                } else if (ms.color.get(12).equals(ms.color.get(13))) {
                    edgeMoves.add("U2");
                } else if (ms.color.get(15).equals(ms.color.get(16))) {
                    edgeMoves.add("U'");
                }

                edgeMoves.addAll(clockwise);
                break;

            case "counter-clockwise":
                if (ms.color.get(9).equals(ms.color.get(10))) {
                    edgeMoves.add("U");
                } else if (ms.color.get(12).equals(ms.color.get(13))) {
                    edgeMoves.add("U2");
                } else if (ms.color.get(15).equals(ms.color.get(16))) {
                    edgeMoves.add("U'");
                }

                edgeMoves.addAll(counterClockwise);
        }
    }
    public void auf(){
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
        ms.ollCornerIntegration();
        ms.pllCornerIntegration();
        ms.pllEdgeIntegration();
        ms.moveLogic();

        if(ms.color.get(9).equals("Green")){
            aufMoves.add("U");
        }
        else if(ms.color.get(9).equals("Red")){
            aufMoves.add("U2");
        }
        else if(ms.color.get(9).equals("Blue")){
            aufMoves.add("U'");
        }
    }
}
