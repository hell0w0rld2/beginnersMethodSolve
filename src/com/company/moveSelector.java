package com.company;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class moveSelector extends JFrame{
    //x positions first, followed by y positions
    int[][] xyPosition = {{
                        400, 450, 500,
                        400, 450, 500,
                        400, 450, 500,

        250, 300, 350,  400, 450, 500,  550, 600, 650,  700, 750, 800,
        250, 300, 350,  400, 450, 500,  550, 600, 650,  700, 750, 800,
        250, 300, 350,  400, 450, 500,  550, 600, 650,  700, 750, 800,

                        400, 450, 500,
                        400, 450, 500,
                        400, 450, 500},
                        {
                        200, 200, 200,
                        250, 250, 250,
                        300, 300, 300,

        350, 350, 350,  350, 350, 350,  350, 350, 350,  350, 350, 350,
        400, 400, 400,  400, 400, 400,  400, 400, 400,  400, 400, 400,
        450, 450, 450,  450, 450, 450,  450, 450, 450,  450, 450, 450,

                        500, 500, 500,
                        550, 550, 550,
                        600, 600, 600}};
    ArrayList<String> moveList = new ArrayList<>(Arrays.asList("D2", "U2", "L2", "U2", "F'", "L2", "R2", "F'", "R2", "B'", "R2", "B2", "R'", "F", "R", "F", "U'", "B2", "R'", "F", "U", "B", "x2"));
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<String> color = new ArrayList<>();
    moves mov = new moves();
    cross crs = new cross();
    corners cor = new corners();
    edges edg = new edges();
    oll oll = new oll();
    pll pll = new pll();

    public void moveLogic(){
        numbers.addAll(mov.numberField);
        //for loop that checks the value in the move list, then changes the index
        for (String s : moveList) {
            switch (s) {
                case "U":
                    mov.U();
                    break;
                case "U2":
                    mov.U2();
                    break;
                case "U'":
                    mov.U3();
                    break;
                case "D":
                    mov.D();
                    break;
                case "D2":
                    mov.D2();
                    break;
                case "D'":
                    mov.D3();
                    break;
                case "R":
                    mov.R();
                    break;
                case "R2":
                    mov.R2();
                    break;
                case "R'":
                    mov.R3();
                    break;
                case "L":
                    mov.L();
                    break;
                case "L2":
                    mov.L2();
                    break;
                case "L'":
                    mov.L3();
                    break;
                case "F":
                    mov.F();
                    break;
                case "F2":
                    mov.F2();
                    break;
                case "F'":
                    mov.F3();
                    break;
                case "B":
                    mov.B();
                    break;
                case "B2":
                    mov.B2();
                    break;
                case "B'":
                    mov.B3();
                    break;
                case "x":
                    mov.x();
                    break;
                case "x2":
                    mov.x2();
                    break;
                case "x'":
                    mov.x3();
                    break;
                case "y":
                    mov.y();
                    break;
                case "y2":
                    mov.y2();
                    break;
                case "y'":
                    mov.y3();
                    break;
                case "z":
                    mov.z();
                    break;
                case "z2":
                    mov.z2();
                    break;
                case "z'":
                    mov.z3();
                    break;
            }
            for(int j = 0; j < numbers.size(); j++){
                numbers.set(j, mov.numberField.get(j));
           }
        }

        for(int i = 0; i < mov.numberField.size(); i++){
            if(mov.numberField.get(i) <= 9) {
                color.add(i,"Green");
            }
            else if(mov.numberField.get(i) >= 10 && mov.numberField.get(i) <= 18){
                color.add(i, "White");
            }
            else if(mov.numberField.get(i) >= 19 && mov.numberField.get(i) <= 27){
                color.add(i, "Orange");
            }
            else if(mov.numberField.get(i) >= 28 && mov.numberField.get(i) <= 36){
                color.add(i, "Red");
            }
            else if(mov.numberField.get(i) >= 37 && mov.numberField.get(i) <= 45){
                color.add(i, "Yellow");
            }
            else if(mov.numberField.get(i) >= 46){
                color.add(i, "Blue");
            }
        }
    }
    public void blueMoveIntegration(){
        crs.blueSolver();
        moveList.addAll(crs.blueMoves);
    }
    public void orangeMoveIntegration(){
        crs.orangeSolver();
        moveList.addAll(crs.orangeMoves);
    }
    public void redMoveIntegration(){
        crs.redSolver();
        moveList.addAll(crs.redMoves);
    }
    public void greenMoveIntegration(){
        crs.greenSolver();
        moveList.addAll(crs.greenMoves);
    }
    public void rbMoveIntegration(){
        cor.rbCornerSolver();
        moveList.addAll(cor.rbMoves);
    }
    public void obMoveIntegration(){
        cor.obCornerSolver();
        moveList.addAll(cor.obMoves);
    }
    public void ogMoveIntegration(){
        cor.ogCornerSolver();
        moveList.addAll(cor.ogMoves);
    }
    public void rgMoveIntegration(){
        cor.rgCornerSolver();
        moveList.addAll(cor.rgMoves);
    }
    public void firstIntegration(){
        edg.firstSolver();
        moveList.addAll(edg.firstMoves);
    }
    public void secondIntegration(){
        edg.secondSolver();
        moveList.addAll(edg.secondMoves);
    }
    public void thirdIntegration(){
        edg.thirdSolver();
        moveList.addAll(edg.thirdMoves);
    }
    public void lastIntegration(){
        edg.lastSolver();
        moveList.addAll(edg.lastMoves);
    }
    public void ollEdgeIntegration(){
        oll.ollEdgeSolver();
        moveList.addAll(oll.edgeMoves);
    }
    public void ollCornerIntegration(){
        oll.ollCornerSolver();
        moveList.addAll(oll.cornerMoves);
    }
    public void pllCornerIntegration(){
        pll.pllCornerSolver();
        moveList.addAll(pll.cornerMoves);
    }
    public void pllEdgeIntegration(){
        pll.pllEdgeSolver();
        moveList.addAll(pll.edgeMoves);
    }
    public void aufIntegration(){
        pll.auf();
        moveList.addAll(pll.aufMoves);
    }

    public void guiDisplay(){
        setTitle("Cube");
        setSize(1280, 960);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public void paint(Graphics graphics){
        for(int i = 0; i < color.size(); i++){
            switch (color.get(i)) {
                case "Green":
                    graphics.setColor(Color.GREEN);
                    break;
                case "White":
                    graphics.setColor(Color.WHITE);
                    break;
                case "Orange":
                    graphics.setColor(Color.ORANGE);
                    break;
                case "Red":
                    graphics.setColor(Color.RED);
                    break;
                case "Yellow":
                    graphics.setColor(Color.YELLOW);
                    break;
                case "Blue":
                    graphics.setColor(Color.BLUE);
                    break;
            }

            graphics.fillRect(xyPosition[0][i], xyPosition[1][i], 50, 50);
        }

        graphics.setColor(Color.BLACK);
        graphics.drawRect(300, 350, 50, 150);
        graphics.drawRect(350, 350, 50, 150);
        graphics.drawRect(400, 200, 50, 450);
        graphics.drawRect(450, 200, 50, 450);
        graphics.drawRect(500, 200, 50, 450);
        graphics.drawRect(550, 350, 50, 150);
        graphics.drawRect(600, 350, 50, 150);
        graphics.drawRect(650, 350, 50, 150);
        graphics.drawRect(700, 350, 50, 150);
        graphics.drawRect(750, 350, 50, 150);
        graphics.drawRect(400, 250, 150, 50);
        graphics.drawRect(400, 300, 150, 50);
        graphics.drawRect(250, 350, 600, 50);
        graphics.drawRect(250, 400, 600, 50);
        graphics.drawRect(250, 450, 600, 50);
        graphics.drawRect(400, 500, 150, 50);
        graphics.drawRect(400, 550, 150, 50);
        graphics.drawRect(400, 600, 150, 50);

    }


}
