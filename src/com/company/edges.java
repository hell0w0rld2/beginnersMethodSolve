package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class edges {

    ArrayList<String> leftInsert = new ArrayList<>(Arrays.asList("U'", "L'", "U", "L", "U", "y'", "R", "U'", "R'"));
    ArrayList<String> rightInsert = new ArrayList<>(Arrays.asList("U", "R", "U'", "R'", "U'", "y", "L'", "U", "L"));
    ArrayList<Integer> rbArray = new ArrayList<>(Arrays.asList(0, 0));
    ArrayList<Integer> rgArray = new ArrayList<>(Arrays.asList(0, 0));
    ArrayList<Integer> obArray = new ArrayList<>(Arrays.asList(0, 0));
    ArrayList<Integer> ogArray = new ArrayList<>(Arrays.asList(0, 0));
    ArrayList<String> firstMoves = new ArrayList<>();
    ArrayList<String> secondMoves = new ArrayList<>();
    ArrayList<String> thirdMoves = new ArrayList<>();
    ArrayList<String> lastMoves = new ArrayList<>();
    String first = "none", second = "none", third = "none", last = "none";

    public void firstSolver(){
        moveSelector ms = new moveSelector();
        ms.blueMoveIntegration();
        ms.orangeMoveIntegration();
        ms.redMoveIntegration();
        ms.greenMoveIntegration();
        ms.rbMoveIntegration();
        ms.obMoveIntegration();
        ms.ogMoveIntegration();
        ms.rgMoveIntegration();
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 4){
                ogArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 6){
                rgArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 22){
                obArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 24){
                ogArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 31){
                rgArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 33){
                rbArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 49){
                rbArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 51){
                obArray.set(1, i);
            }
        }

        if((rbArray.get(0) >= 9 && rbArray.get(0) <= 20) || (rbArray.get(1) >= 9 && rbArray.get(1) <= 20)){
            first = "rb";
        }
        else if((rgArray.get(0) >= 9 && rgArray.get(0) <= 20) || (rgArray.get(1) >= 9 && rgArray.get(1) <= 20)){
            first = "rg";
        }
        else if((obArray.get(0) >= 9 && obArray.get(0) <= 20) || (obArray.get(1) >= 9 && obArray.get(1) <= 20)){
            first = "ob";
        }
        else if((ogArray.get(0) >= 9 && ogArray.get(0) <= 20) || (ogArray.get(1) >= 9 && ogArray.get(1) <= 20)){
            first = "og";
        }

        switch (first) {
            case "rb":
                if (rbArray.get(0) >= 9 && rbArray.get(0) <= 20) {
                    firstMoves.add("y");
                    if (rbArray.get(0) == 10) {
                        firstMoves.add("U2");
                    } else if (rbArray.get(0) == 13) {
                        firstMoves.add("U'");
                    } else if (rbArray.get(0) == 19) {
                        firstMoves.add("U");
                    }

                    firstMoves.addAll(leftInsert);
                } else if (rbArray.get(1) >= 9 || rbArray.get(1) <= 20) {
                    if (rbArray.get(1) == 10) {
                        firstMoves.add("U'");
                    } else if (rbArray.get(1) == 16) {
                        firstMoves.add("U");
                    } else if (rbArray.get(1) == 19) {
                        firstMoves.add("U2");
                    }

                    firstMoves.addAll(rightInsert);
                    firstMoves.add("y'");
                }
                break;
            case "rg":
                if (rgArray.get(0) >= 9 && rgArray.get(0) <= 20) {
                    firstMoves.add("y");
                    if (rgArray.get(0) == 10) {
                        firstMoves.add("U2");
                    } else if (rgArray.get(0) == 13) {
                        firstMoves.add("U'");
                    } else if (rgArray.get(0) == 19) {
                        firstMoves.add("U");
                    }

                    firstMoves.addAll(rightInsert);
                    firstMoves.add("y2");
                } else if (rgArray.get(1) >= 9 && rgArray.get(1) <= 20) {
                    firstMoves.add("y2");
                    if (rgArray.get(1) == 10) {
                        firstMoves.add("U");
                    } else if (rgArray.get(1) == 13) {
                        firstMoves.add("U2");
                    } else if (rgArray.get(1) == 16) {
                        firstMoves.add("U'");
                    }

                    firstMoves.addAll(leftInsert);
                    firstMoves.add("y'");
                }
                break;
            case "og":
                if (ogArray.get(0) >= 9 && ogArray.get(0) <= 20) {
                    firstMoves.add("y'");
                    if (ogArray.get(0) == 13) {
                        firstMoves.add("U");
                    } else if (ogArray.get(0) == 16) {
                        firstMoves.add("U2");
                    } else if (ogArray.get(0) == 19) {
                        firstMoves.add("U'");
                    }

                    firstMoves.addAll(leftInsert);
                    firstMoves.add("y2");
                } else if (ogArray.get(1) >= 9 && ogArray.get(1) <= 20) {
                    firstMoves.add("y2");
                    if (ogArray.get(1) == 10) {
                        firstMoves.add("U");
                    } else if (ogArray.get(1) == 13) {
                        firstMoves.add("U2");
                    } else if (ogArray.get(1) == 16) {
                        firstMoves.add("U'");
                    }

                    firstMoves.addAll(rightInsert);
                    firstMoves.add("y");
                }
                break;
            case "ob":
                if (obArray.get(0) >= 9 && obArray.get(0) <= 20) {
                    firstMoves.add("y'");
                    if (obArray.get(0) == 13) {
                        firstMoves.add("U");
                    } else if (obArray.get(0) == 16) {
                        firstMoves.add("U2");
                    } else if (obArray.get(0) == 19) {
                        firstMoves.add("U'");
                    }

                    firstMoves.addAll(rightInsert);
                } else if (obArray.get(1) >= 9 && obArray.get(1) <= 20) {
                    if (obArray.get(1) == 10) {
                        firstMoves.add("U'");
                    } else if (obArray.get(1) == 16) {
                        firstMoves.add("U");
                    } else if (obArray.get(1) == 19) {
                        firstMoves.add("U2");
                    }
                    firstMoves.addAll(leftInsert);
                    firstMoves.add("y");
                }
                break;
        }
    }
    public void secondSolver(){
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
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 4){
                ogArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 6){
                rgArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 22){
                obArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 24){
                ogArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 31){
                rgArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 33){
                rbArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 49){
                rbArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 51){
                obArray.set(1, i);
            }
        }
        if((rbArray.get(0) >= 9 && rbArray.get(0) <= 20) || (rbArray.get(1) >= 9 && rbArray.get(1) <= 20)){
            second = "rb";
        }
        else if((rgArray.get(0) >= 9 && rgArray.get(0) <= 20) || (rgArray.get(1) >= 9 && rgArray.get(1) <= 20)){
            second = "rg";
        }
        else if((obArray.get(0) >= 9 && obArray.get(0) <= 20) || (obArray.get(1) >= 9 && obArray.get(1) <= 20)){
            second = "ob";
        }
        else if((ogArray.get(0) >= 9 && ogArray.get(0) <= 20) || (ogArray.get(1) >= 9 && ogArray.get(1) <= 20)){
            second = "og";
        }

        switch (second) {
            case "rb":
                if (rbArray.get(0) >= 9 && rbArray.get(0) <= 20) {
                    secondMoves.add("y");
                    if (rbArray.get(0) == 10) {
                        secondMoves.add("U2");
                    } else if (rbArray.get(0) == 13) {
                        secondMoves.add("U'");
                    } else if (rbArray.get(0) == 19) {
                        secondMoves.add("U");
                    }

                    secondMoves.addAll(leftInsert);
                } else if (rbArray.get(1) >= 9 && rbArray.get(1) <= 20) {
                    if (rbArray.get(1) == 10) {
                        secondMoves.add("U'");
                    } else if (rbArray.get(1) == 16) {
                        secondMoves.add("U");
                    } else if (rbArray.get(1) == 19) {
                        secondMoves.add("U2");
                    }

                    secondMoves.addAll(rightInsert);
                    secondMoves.add("y'");
                }
                break;
            case "rg":
                if (rgArray.get(0) >= 9 && rgArray.get(0) <= 20) {
                    secondMoves.add("y");
                    if (rgArray.get(0) == 10) {
                        secondMoves.add("U2");
                    } else if (rgArray.get(0) == 13) {
                        secondMoves.add("U'");
                    } else if (rgArray.get(0) == 19) {
                        secondMoves.add("U");
                    }

                    secondMoves.addAll(rightInsert);
                    secondMoves.add("y2");
                } else if (rgArray.get(1) >= 9 && rgArray.get(1) <= 20) {
                    secondMoves.add("y2");
                    if (rgArray.get(1) == 10) {
                        secondMoves.add("U");
                    } else if (rgArray.get(1) == 13) {
                        secondMoves.add("U2");
                    } else if (rgArray.get(1) == 16) {
                        secondMoves.add("U'");
                    }

                    secondMoves.addAll(leftInsert);
                    secondMoves.add("y'");
                }
                break;
            case "og":
                if (ogArray.get(0) >= 9 && ogArray.get(0) <= 20) {
                    secondMoves.add("y'");
                    if (ogArray.get(0) == 13) {
                        secondMoves.add("U");
                    } else if (ogArray.get(0) == 16) {
                        secondMoves.add("U2");
                    } else if (ogArray.get(0) == 19) {
                        secondMoves.add("U'");
                    }

                    secondMoves.addAll(leftInsert);
                    secondMoves.add("y2");
                } else if (ogArray.get(1) >= 9 && ogArray.get(1) <= 20) {
                    secondMoves.add("y2");
                    if (ogArray.get(1) == 10) {
                        secondMoves.add("U");
                    } else if (ogArray.get(1) == 13) {
                        secondMoves.add("U2");
                    } else if (ogArray.get(1) == 16) {
                        secondMoves.add("U'");
                    }

                    secondMoves.addAll(rightInsert);
                    secondMoves.add("y");
                }
                break;
            case "ob":
                if (obArray.get(0) >= 9 && obArray.get(0) <= 20) {
                    secondMoves.add("y'");
                    if (obArray.get(0) == 13) {
                        secondMoves.add("U");
                    } else if (obArray.get(0) == 16) {
                        secondMoves.add("U2");
                    } else if (obArray.get(0) == 19) {
                        secondMoves.add("U'");
                    }

                    secondMoves.addAll(rightInsert);
                } else if (obArray.get(1) >= 9 && obArray.get(1) <= 20) {
                    if (obArray.get(1) == 10) {
                        secondMoves.add("U'");
                    } else if (obArray.get(1) == 16) {
                        secondMoves.add("U");
                    } else if (obArray.get(1) == 19) {
                        secondMoves.add("U2");
                    }
                    secondMoves.addAll(leftInsert);
                    secondMoves.add("y");
                }
                break;
        }
    }
    public void thirdSolver(){
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
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 4){
                ogArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 6){
                rgArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 22){
                obArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 24){
                ogArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 31){
                rgArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 33){
                rbArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 49){
                rbArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 51){
                obArray.set(1, i);
            }
        }
        if((rbArray.get(0) >= 9 && rbArray.get(0) <= 20) || (rbArray.get(1) >= 9 && rbArray.get(1) <= 20)){
            third = "rb";
        }
        else if((rgArray.get(0) >= 9 && rgArray.get(0) <= 20) || (rgArray.get(1) >= 9 && rgArray.get(1) <= 20)){
            third = "rg";
        }
        else if((obArray.get(0) >= 9 && obArray.get(0) <= 20) || (obArray.get(1) >= 9 && obArray.get(1) <= 20)){
            third = "ob";
        }
        else if((ogArray.get(0) >= 9 && ogArray.get(0) <= 20) || (ogArray.get(1) >= 9 && ogArray.get(1) <= 20)){
            third = "og";
        }
        else{
            third = "solved";
        }

        switch (third) {
            case "rb":
                if (rbArray.get(0) >= 9 && rbArray.get(0) <= 20) {
                    thirdMoves.add("y");
                    if (rbArray.get(0) == 10) {
                        thirdMoves.add("U2");
                    } else if (rbArray.get(0) == 13) {
                        thirdMoves.add("U'");
                    } else if (rbArray.get(0) == 19) {
                        thirdMoves.add("U");
                    }

                    thirdMoves.addAll(leftInsert);
                } else if (rbArray.get(1) >= 9 && rbArray.get(1) <= 20) {
                    if (rbArray.get(1) == 10) {
                        thirdMoves.add("U'");
                    } else if (rbArray.get(1) == 16) {
                        thirdMoves.add("U");
                    } else if (rbArray.get(1) == 19) {
                        thirdMoves.add("U2");
                    }

                    thirdMoves.addAll(rightInsert);
                    thirdMoves.add("y'");
                }
                break;
            case "rg":
                if (rgArray.get(0) >= 9 && rgArray.get(0) <= 20) {
                    thirdMoves.add("y");
                    if (rgArray.get(0) == 10) {
                        thirdMoves.add("U2");
                    } else if (rgArray.get(0) == 13) {
                        thirdMoves.add("U'");
                    } else if (rgArray.get(0) == 19) {
                        thirdMoves.add("U");
                    }

                    thirdMoves.addAll(rightInsert);
                    thirdMoves.add("y2");
                } else if (rgArray.get(1) >= 9 && rgArray.get(1) <= 20) {
                    thirdMoves.add("y2");
                    if (rgArray.get(1) == 10) {
                        thirdMoves.add("U");
                    } else if (rgArray.get(1) == 13) {
                        thirdMoves.add("U2");
                    } else if (rgArray.get(1) == 16) {
                        thirdMoves.add("U'");
                    }

                    thirdMoves.addAll(leftInsert);
                    thirdMoves.add("y'");
                }
                break;
            case "og":
                if (ogArray.get(0) >= 9 && ogArray.get(0) <= 20) {
                    thirdMoves.add("y'");
                    if (ogArray.get(0) == 13) {
                        thirdMoves.add("U");
                    } else if (ogArray.get(0) == 16) {
                        thirdMoves.add("U2");
                    } else if (ogArray.get(0) == 19) {
                        thirdMoves.add("U'");
                    }

                    thirdMoves.addAll(leftInsert);
                    thirdMoves.add("y2");
                } else if (ogArray.get(1) >= 9 && ogArray.get(1) <= 20) {
                    thirdMoves.add("y2");
                    if (ogArray.get(1) == 10) {
                        thirdMoves.add("U");
                    } else if (ogArray.get(1) == 13) {
                        thirdMoves.add("U2");
                    } else if (ogArray.get(1) == 16) {
                        thirdMoves.add("U'");
                    }

                    thirdMoves.addAll(rightInsert);
                    thirdMoves.add("y");
                }
                break;
            case "ob":
                if (obArray.get(0) >= 9 && obArray.get(0) <= 20) {
                    thirdMoves.add("y'");
                    if (obArray.get(0) == 13) {
                        thirdMoves.add("U");
                    } else if (obArray.get(0) == 16) {
                        thirdMoves.add("U2");
                    } else if (obArray.get(0) == 19) {
                        thirdMoves.add("U'");
                    }

                    thirdMoves.addAll(rightInsert);
                } else if (obArray.get(1) >= 9 && obArray.get(1) <= 20) {
                    if (obArray.get(1) == 10) {
                        thirdMoves.add("U'");
                    } else if (obArray.get(1) == 16) {
                        thirdMoves.add("U");
                    } else if (obArray.get(1) == 19) {
                        thirdMoves.add("U2");
                    }
                    thirdMoves.addAll(leftInsert);
                    thirdMoves.add("y");
                }
                break;
            case "solved":
                System.out.println("solved");
                break;
        }

    }
    public void lastSolver(){
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
        ms.moveLogic();

        for(int i = 0; i < ms.numbers.size(); i++){
            if(ms.numbers.get(i) == 4){
                ogArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 6){
                rgArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 22){
                obArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 24){
                ogArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 31){
                rgArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 33){
                rbArray.set(0, i);
            }
            else if(ms.numbers.get(i) == 49){
                rbArray.set(1, i);
            }
            else if(ms.numbers.get(i) == 51){
                obArray.set(1, i);
            }
        }
        if((rbArray.get(0) >= 9 && rbArray.get(0) <= 20) || (rbArray.get(1) >= 9 && rbArray.get(1) <= 20)){
            last = "rb";
        }
        else if((rgArray.get(0) >= 9 && rgArray.get(0) <= 20) || (rgArray.get(1) >= 9 && rgArray.get(1) <= 20)){
            last = "rg";
        }
        else if((obArray.get(0) >= 9 && obArray.get(0) <= 20) || (obArray.get(1) >= 9 && obArray.get(1) <= 20)){
            last = "ob";
        }
        else if((ogArray.get(0) >= 9 && ogArray.get(0) <= 20) || (ogArray.get(1) >= 9 && ogArray.get(1) <= 20)){
            last = "og";
        }

        switch (last) {
            case "rb":
                if (rbArray.get(0) >= 9 && rbArray.get(0) <= 20) {
                    lastMoves.add("y");
                    if (rbArray.get(0) == 10) {
                        lastMoves.add("U2");
                    } else if (rbArray.get(0) == 13) {
                        lastMoves.add("U'");
                    } else if (rbArray.get(0) == 19) {
                        lastMoves.add("U");
                    }

                    lastMoves.addAll(leftInsert);
                } else if (rbArray.get(1) >= 9 && rbArray.get(1) <= 20) {
                    if (rbArray.get(1) == 10) {
                        lastMoves.add("U'");
                    } else if (rbArray.get(1) == 16) {
                        lastMoves.add("U");
                    } else if (rbArray.get(1) == 19) {
                        lastMoves.add("U2");
                    }

                    lastMoves.addAll(rightInsert);
                    lastMoves.add("y'");
                }
                break;
            case "rg":
                if (rgArray.get(0) >= 9 && rgArray.get(0) <= 20) {
                    lastMoves.add("y");
                    if (rgArray.get(0) == 10) {
                        lastMoves.add("U2");
                    } else if (rgArray.get(0) == 13) {
                        lastMoves.add("U'");
                    } else if (rgArray.get(0) == 19) {
                        lastMoves.add("U");
                    }

                    lastMoves.addAll(rightInsert);
                    lastMoves.add("y2");
                } else if (rgArray.get(1) >= 9 && rgArray.get(1) <= 20) {
                    lastMoves.add("y2");
                    if (rgArray.get(1) == 10) {
                        lastMoves.add("U");
                    } else if (rgArray.get(1) == 13) {
                        lastMoves.add("U2");
                    } else if (rgArray.get(1) == 16) {
                        lastMoves.add("U'");
                    }

                    lastMoves.addAll(leftInsert);
                    lastMoves.add("y'");
                }
                break;
            case "og":
                if (ogArray.get(0) >= 9 && ogArray.get(0) <= 20) {
                    lastMoves.add("y'");
                    if (ogArray.get(0) == 13) {
                        lastMoves.add("U");
                    } else if (ogArray.get(0) == 16) {
                        lastMoves.add("U2");
                    } else if (ogArray.get(0) == 19) {
                        lastMoves.add("U'");
                    }

                    lastMoves.addAll(leftInsert);
                    lastMoves.add("y2");
                } else if (ogArray.get(1) >= 9 && ogArray.get(1) <= 20) {
                    lastMoves.add("y2");
                    if (ogArray.get(1) == 10) {
                        lastMoves.add("U");
                    } else if (ogArray.get(1) == 13) {
                        lastMoves.add("U2");
                    } else if (ogArray.get(1) == 16) {
                        lastMoves.add("U'");
                    }

                    lastMoves.addAll(rightInsert);
                    lastMoves.add("y");
                }
                break;
            case "ob":
                if (obArray.get(0) >= 9 && obArray.get(0) <= 20) {
                    lastMoves.add("y'");
                    if (obArray.get(0) == 13) {
                        lastMoves.add("U");
                    } else if (obArray.get(0) == 16) {
                        lastMoves.add("U2");
                    } else if (obArray.get(0) == 19) {
                        lastMoves.add("U'");
                    }

                    lastMoves.addAll(rightInsert);
                } else if (obArray.get(1) >= 9 && obArray.get(1) <= 20) {
                    if (obArray.get(1) == 10) {
                        lastMoves.add("U'");
                    } else if (obArray.get(1) == 16) {
                        lastMoves.add("U");
                    } else if (obArray.get(1) == 19) {
                        lastMoves.add("U2");
                    }
                    lastMoves.addAll(leftInsert);
                    lastMoves.add("y");
                }

                break;
            case "none":
                System.out.println("solved");
                break;
        }
    }
}
