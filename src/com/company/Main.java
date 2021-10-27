package com.company;


public class Main {


/*
Using a java applet, this code solves the Rubik's Cube using 8 steps:
    1. Getting white edges with white facing the yellow center
    2. Using R2, L2, B2, or F2 to get solve the white edges, lining up the edge with the correct center
       and using U to line up the edges
    3. Solve the white corners in a certain order that is TBD
    4. Solve the middle edges in an order that is TBD
    5. Orient the yellow edges using one of three algorithms
    6. Orient the yellow corners repeating an algorithm until solved
    7. Permute the yellow corners using a certain algorithm either 1 or 2 times, depending on the case
    8. Permute the yellow edges one of two algorithms, repeating 1 or 2 times or using both depending on the case
Steps can be skipped.
 */

    public static void main(String[] args) {

        moveSelector ms = new moveSelector();
        cross crs = new cross();
        corners cor = new corners();
        edges edg = new edges();
        oll oll = new oll();
        pll pll = new pll();
//        System.out.println(ms.moveList);
//
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
        ms.aufIntegration();
//
        ms.moveLogic();
//
//        crs.blueSolver();
//        crs.orangeSolver();
//        crs.redSolver();
//        crs.greenSolver();
//        cor.rbCornerSolver();
//        cor.obCornerSolver();
//        cor.ogCornerSolver();
//        cor.rgCornerSolver();
//        edg.firstSolver();
//        edg.secondSolver();
//        edg.thirdSolver();
//        edg.lastSolver();
//        oll.ollEdgeSolver();
//        oll.ollCornerSolver();
//        pll.pllCornerSolver();
//        pll.pllEdgeSolver();
//        pll.auf();

        System.out.print(crs.blueMoves);
        System.out.print(crs.orangeMoves);
        System.out.print(crs.redMoves);
        System.out.println(crs.greenMoves);
        System.out.println(cor.rbMoves);
        System.out.println(cor.obMoves);
        System.out.println(cor.ogMoves);
        System.out.println(cor.rgMoves);
        System.out.println(edg.firstMoves);
        System.out.println(edg.secondMoves);
        System.out.println(edg.thirdMoves);
        System.out.println(edg.lastMoves);
        System.out.println(oll.edgeMoves);
        System.out.println(oll.cornerMoves);
        System.out.println(pll.cornerMoves);
        System.out.print(pll.edgeMoves);
        System.out.print(pll.aufMoves);

        ms.guiDisplay();

    }
}
