package com.company;

import java.util.ArrayList;
import java.util.Arrays;
public class moves {
    //Positions of each piece in a solved state
    //46 through 54 inverted since that face would be the back of the cube
    ArrayList<Integer> numberField = new ArrayList<> (Arrays.asList(
                           10, 11, 12,
                           13, 14, 15,
                           16, 17, 18,

            19, 20, 21,    1,  2,  3,   28, 29, 30,  46, 47, 48,
            22, 23, 24,    4,  5,  6,   31, 32, 33,  49, 50, 51,
            25, 26, 27,    7,  8,  9,   34, 35, 36,  52, 53, 54,

                           37, 38, 39,
                           40, 41, 42,
                           43, 44, 45));

    ArrayList<Integer> nf = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    ArrayList<Integer> sideMoveSetup = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    ArrayList<Integer> face = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
    public void U(){
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(6));
        numberField.set(1, face.get(3));
        numberField.set(2, face.get(0));
        numberField.set(3, face.get(7));
        numberField.set(5, face.get(1));
        numberField.set(6, face.get(8));
        numberField.set(7, face.get(5));
        numberField.set(8, face.get(2));
    }
    public void U2(){
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++) {
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(8));
        numberField.set(1, face.get(7));
        numberField.set(2, face.get(6));
        numberField.set(3, face.get(5));
        numberField.set(5, face.get(3));
        numberField.set(6, face.get(2));
        numberField.set(7, face.get(1));
        numberField.set(8, face.get(0));
    }
    public void U3(){  //aka U'
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++) {
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(2));
        numberField.set(1, face.get(5));
        numberField.set(2, face.get(8));
        numberField.set(3, face.get(1));
        numberField.set(5, face.get(7));
        numberField.set(6, face.get(0));
        numberField.set(7, face.get(3));
        numberField.set(8, face.get(6));
    }
    public void D(){
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(6));
        numberField.set(46, face.get(3));
        numberField.set(47, face.get(0));
        numberField.set(48, face.get(7));
        numberField.set(50, face.get(1));
        numberField.set(51, face.get(8));
        numberField.set(52, face.get(5));
        numberField.set(53, face.get(2));
    }
    public void D2(){
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(8));
        numberField.set(46, face.get(7));
        numberField.set(47, face.get(6));
        numberField.set(48, face.get(5));
        numberField.set(50, face.get(3));
        numberField.set(51, face.get(2));
        numberField.set(52, face.get(1));
        numberField.set(53, face.get(0));
    }
    public void D3(){   //aka D'
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(2));
        numberField.set(46, face.get(5));
        numberField.set(47, face.get(8));
        numberField.set(48, face.get(1));
        numberField.set(50, face.get(7));
        numberField.set(51, face.get(0));
        numberField.set(52, face.get(3));
        numberField.set(53, face.get(6));
    }
    public void R(){
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(6));
        numberField.set(16, face.get(3));
        numberField.set(17, face.get(0));
        numberField.set(27, face.get(7));
        numberField.set(29, face.get(1));
        numberField.set(39, face.get(8));
        numberField.set(40, face.get(5));
        numberField.set(41, face.get(2));
    }
    public void R2(){
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(8));
        numberField.set(16, face.get(7));
        numberField.set(17, face.get(6));
        numberField.set(27, face.get(5));
        numberField.set(29, face.get(3));
        numberField.set(39, face.get(2));
        numberField.set(40, face.get(1));
        numberField.set(41, face.get(0));
    }
    public void R3(){  //aka R'
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(2));
        numberField.set(16, face.get(5));
        numberField.set(17, face.get(8));
        numberField.set(27, face.get(1));
        numberField.set(29, face.get(7));
        numberField.set(39, face.get(0));
        numberField.set(40, face.get(3));
        numberField.set(41, face.get(6));
    }
    public void L(){
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(6));
        numberField.set(10, face.get(3));
        numberField.set(11, face.get(0));
        numberField.set(21, face.get(7));
        numberField.set(23, face.get(1));
        numberField.set(33, face.get(8));
        numberField.set(34, face.get(5));
        numberField.set(35, face.get(2));
    }
    public void L2(){
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(8));
        numberField.set(10, face.get(7));
        numberField.set(11, face.get(6));
        numberField.set(21, face.get(5));
        numberField.set(23, face.get(3));
        numberField.set(33, face.get(2));
        numberField.set(34, face.get(1));
        numberField.set(35, face.get(0));
    }
    public void L3(){  //aka L'
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(2));
        numberField.set(10, face.get(5));
        numberField.set(11, face.get(8));
        numberField.set(21, face.get(1));
        numberField.set(23, face.get(7));
        numberField.set(33, face.get(0));
        numberField.set(34, face.get(3));
        numberField.set(35, face.get(6));
    }
    public void F(){
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(6));
        numberField.set(13, face.get(3));
        numberField.set(14, face.get(0));
        numberField.set(24, face.get(7));
        numberField.set(26, face.get(1));
        numberField.set(36, face.get(8));
        numberField.set(37, face.get(5));
        numberField.set(38, face.get(2));
    }
    public void F2(){
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(8));
        numberField.set(13, face.get(7));
        numberField.set(14, face.get(6));
        numberField.set(24, face.get(5));
        numberField.set(26, face.get(3));
        numberField.set(36, face.get(2));
        numberField.set(37, face.get(1));
        numberField.set(38, face.get(0));
    }
    public void F3(){ //aka F'
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(2));
        numberField.set(13, face.get(5));
        numberField.set(14, face.get(8));
        numberField.set(24, face.get(1));
        numberField.set(26, face.get(7));
        numberField.set(36, face.get(0));
        numberField.set(37, face.get(3));
        numberField.set(38, face.get(6));
    }
    public void B(){
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }
        numberField.set(18, face.get(6));
        numberField.set(19, face.get(3));
        numberField.set(20, face.get(0));
        numberField.set(30, face.get(7));
        numberField.set(32, face.get(1));
        numberField.set(42, face.get(8));
        numberField.set(43, face.get(5));
        numberField.set(44, face.get(2));
    }
    public void B2(){
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }
        numberField.set(18, face.get(8));
        numberField.set(19, face.get(7));
        numberField.set(20, face.get(6));
        numberField.set(30, face.get(5));
        numberField.set(32, face.get(3));
        numberField.set(42, face.get(2));
        numberField.set(43, face.get(1));
        numberField.set(44, face.get(0));
    }
    public void B3(){  //aka B'
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }

        numberField.set(18, face.get(2));
        numberField.set(19, face.get(5));
        numberField.set(20, face.get(8));
        numberField.set(30, face.get(1));
        numberField.set(32, face.get(7));
        numberField.set(42, face.get(0));
        numberField.set(43, face.get(3));
        numberField.set(44, face.get(6));
    }
    public void x(){
        // R move
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));

        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));
        // L' move
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(6));
        numberField.set(16, face.get(3));
        numberField.set(17, face.get(0));
        numberField.set(27, face.get(7));
        numberField.set(29, face.get(1));
        numberField.set(39, face.get(8));
        numberField.set(40, face.get(5));
        numberField.set(41, face.get(2));
        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(2));
        numberField.set(10, face.get(5));
        numberField.set(11, face.get(8));
        numberField.set(21, face.get(1));
        numberField.set(23, face.get(7));
        numberField.set(33, face.get(0));
        numberField.set(34, face.get(3));
        numberField.set(35, face.get(6));


        // M' move
        sideMoveSetup.set(0, numberField.get(1));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(7));
        sideMoveSetup.set(3, numberField.get(13));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(37));
        sideMoveSetup.set(6, numberField.get(46));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(52));
        sideMoveSetup.set(9, numberField.get(43));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(19));

        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else {
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }

        numberField.set(1, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(7, nf.get(2));
        numberField.set(13, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(37, nf.get(5));
        numberField.set(46, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(52, nf.get(8));
        numberField.set(43, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(19, nf.get(11));
    }
    public void x2(){
        //R2
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(8));
        numberField.set(16, face.get(7));
        numberField.set(17, face.get(6));
        numberField.set(27, face.get(5));
        numberField.set(29, face.get(3));
        numberField.set(39, face.get(2));
        numberField.set(40, face.get(1));
        numberField.set(41, face.get(0));
        //L2
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(8));
        numberField.set(10, face.get(7));
        numberField.set(11, face.get(6));
        numberField.set(21, face.get(5));
        numberField.set(23, face.get(3));
        numberField.set(33, face.get(2));
        numberField.set(34, face.get(1));
        numberField.set(35, face.get(0));
        //M2
        sideMoveSetup.set(0, numberField.get(1));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(7));
        sideMoveSetup.set(3, numberField.get(13));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(37));
        sideMoveSetup.set(6, numberField.get(46));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(52));
        sideMoveSetup.set(9, numberField.get(43));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(19));

        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else {
                nf.set(j, sideMoveSetup.get((j + 6)));
            }

        }

        numberField.set(1, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(7, nf.get(2));
        numberField.set(13, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(37, nf.get(5));
        numberField.set(46, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(52, nf.get(8));
        numberField.set(43, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(19, nf.get(11));
    }
    public void x3(){  //aka x'
        //R'
        sideMoveSetup.set(0, numberField.get(2));
        sideMoveSetup.set(1, numberField.get(5));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(14));
        sideMoveSetup.set(4, numberField.get(26));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(50));
        sideMoveSetup.set(8, numberField.get(53));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(30));
        sideMoveSetup.set(11, numberField.get(18));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(2, nf.get(0));
        numberField.set(5, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(14, nf.get(3));
        numberField.set(26, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(50, nf.get(7));
        numberField.set(53, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(30, nf.get(10));
        numberField.set(18, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 15 && j <= 17) {
                face.set(j - 15, numberField.get(j));
            }
            else if(j >= 27 && j <= 29){
                face.set(j - 24, numberField.get(j));
            }
            else if(j >= 39 && j <= 41){
                face.set(j - 33, numberField.get(j));
            }
        }
        numberField.set(15, face.get(2));
        numberField.set(16, face.get(5));
        numberField.set(17, face.get(8));
        numberField.set(27, face.get(1));
        numberField.set(29, face.get(7));
        numberField.set(39, face.get(0));
        numberField.set(40, face.get(3));
        numberField.set(41, face.get(6));
        //L
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(3));
        sideMoveSetup.set(2, numberField.get(6));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(24));
        sideMoveSetup.set(5, numberField.get(36));
        sideMoveSetup.set(6, numberField.get(45));
        sideMoveSetup.set(7, numberField.get(48));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(44));
        sideMoveSetup.set(10, numberField.get(32));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(0, nf.get(0));
        numberField.set(3, nf.get(1));
        numberField.set(6, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(24, nf.get(4));
        numberField.set(36, nf.get(5));
        numberField.set(45, nf.get(6));
        numberField.set(48, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(44, nf.get(9));
        numberField.set(32, nf.get(10));
        numberField.set(20, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j <= 11) {
                face.set(j - 9, numberField.get(j));
            }
            else if(j >= 21 && j <= 23){
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 33 && j <= 35){
                face.set(j - 27, numberField.get(j));
            }
        }
        numberField.set(9, face.get(6));
        numberField.set(10, face.get(3));
        numberField.set(11, face.get(0));
        numberField.set(21, face.get(7));
        numberField.set(23, face.get(1));
        numberField.set(33, face.get(8));
        numberField.set(34, face.get(5));
        numberField.set(35, face.get(2));
        //M
        sideMoveSetup.set(0, numberField.get(1));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(7));
        sideMoveSetup.set(3, numberField.get(13));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(37));
        sideMoveSetup.set(6, numberField.get(46));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(52));
        sideMoveSetup.set(9, numberField.get(43));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(19));

        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else {
                nf.set(j, sideMoveSetup.get((j + 9)));
            }

        }

        numberField.set(1, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(7, nf.get(2));
        numberField.set(13, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(37, nf.get(5));
        numberField.set(46, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(52, nf.get(8));
        numberField.set(43, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(19, nf.get(11));
    }
    public void y(){
        //U
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(6));
        numberField.set(1, face.get(3));
        numberField.set(2, face.get(0));
        numberField.set(3, face.get(7));
        numberField.set(5, face.get(1));
        numberField.set(6, face.get(8));
        numberField.set(7, face.get(5));
        numberField.set(8, face.get(2));
        //D'
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(2));
        numberField.set(46, face.get(5));
        numberField.set(47, face.get(8));
        numberField.set(48, face.get(1));
        numberField.set(50, face.get(7));
        numberField.set(51, face.get(0));
        numberField.set(52, face.get(3));
        numberField.set(53, face.get(6));
        //E'
        sideMoveSetup.set(0, numberField.get(21));
        sideMoveSetup.set(1, numberField.get(22));
        sideMoveSetup.set(2, numberField.get(23));
        sideMoveSetup.set(3, numberField.get(24));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(26));
        sideMoveSetup.set(6, numberField.get(27));
        sideMoveSetup.set(7, numberField.get(28));
        sideMoveSetup.set(8, numberField.get(29));
        sideMoveSetup.set(9, numberField.get(30));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(32));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }
        }
        numberField.set(21, nf.get(0));
        numberField.set(22, nf.get(1));
        numberField.set(23, nf.get(2));
        numberField.set(24, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(26, nf.get(5));
        numberField.set(27, nf.get(6));
        numberField.set(28, nf.get(7));
        numberField.set(29, nf.get(8));
        numberField.set(30, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(32, nf.get(11));
    }
    public void y2(){
        //U2
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++) {
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(8));
        numberField.set(1, face.get(7));
        numberField.set(2, face.get(6));
        numberField.set(3, face.get(5));
        numberField.set(5, face.get(3));
        numberField.set(6, face.get(2));
        numberField.set(7, face.get(1));
        numberField.set(8, face.get(0));
        //D2
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(8));
        numberField.set(46, face.get(7));
        numberField.set(47, face.get(6));
        numberField.set(48, face.get(5));
        numberField.set(50, face.get(3));
        numberField.set(51, face.get(2));
        numberField.set(52, face.get(1));
        numberField.set(53, face.get(0));
        //E2
        sideMoveSetup.set(0, numberField.get(21));
        sideMoveSetup.set(1, numberField.get(22));
        sideMoveSetup.set(2, numberField.get(23));
        sideMoveSetup.set(3, numberField.get(24));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(26));
        sideMoveSetup.set(6, numberField.get(27));
        sideMoveSetup.set(7, numberField.get(28));
        sideMoveSetup.set(8, numberField.get(29));
        sideMoveSetup.set(9, numberField.get(30));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(32));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }
        }
        numberField.set(21, nf.get(0));
        numberField.set(22, nf.get(1));
        numberField.set(23, nf.get(2));
        numberField.set(24, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(26, nf.get(5));
        numberField.set(27, nf.get(6));
        numberField.set(28, nf.get(7));
        numberField.set(29, nf.get(8));
        numberField.set(30, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(32, nf.get(11));
    }
    public void y3(){  //aka y'
        //U'
        sideMoveSetup.set(0, numberField.get(9));
        sideMoveSetup.set(1, numberField.get(10));
        sideMoveSetup.set(2, numberField.get(11));
        sideMoveSetup.set(3, numberField.get(12));
        sideMoveSetup.set(4, numberField.get(13));
        sideMoveSetup.set(5, numberField.get(14));
        sideMoveSetup.set(6, numberField.get(15));
        sideMoveSetup.set(7, numberField.get(16));
        sideMoveSetup.set(8, numberField.get(17));
        sideMoveSetup.set(9, numberField.get(18));
        sideMoveSetup.set(10, numberField.get(19));
        sideMoveSetup.set(11, numberField.get(20));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(9, nf.get(0));
        numberField.set(10, nf.get(1));
        numberField.set(11, nf.get(2));
        numberField.set(12, nf.get(3));
        numberField.set(13, nf.get(4));
        numberField.set(14, nf.get(5));
        numberField.set(15, nf.get(6));
        numberField.set(16, nf.get(7));
        numberField.set(17, nf.get(8));
        numberField.set(18, nf.get(9));
        numberField.set(19, nf.get(10));
        numberField.set(20, nf.get(11));
        for(int j = 0; j < nf.size(); j++) {
            numberField.set(j + 9, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j));
        }
        numberField.set(0, face.get(2));
        numberField.set(1, face.get(5));
        numberField.set(2, face.get(8));
        numberField.set(3, face.get(1));
        numberField.set(5, face.get(7));
        numberField.set(6, face.get(0));
        numberField.set(7, face.get(3));
        numberField.set(8, face.get(6));
        //D
        sideMoveSetup.set(0, numberField.get(33));
        sideMoveSetup.set(1, numberField.get(34));
        sideMoveSetup.set(2, numberField.get(35));
        sideMoveSetup.set(3, numberField.get(36));
        sideMoveSetup.set(4, numberField.get(37));
        sideMoveSetup.set(5, numberField.get(38));
        sideMoveSetup.set(6, numberField.get(39));
        sideMoveSetup.set(7, numberField.get(40));
        sideMoveSetup.set(8, numberField.get(41));
        sideMoveSetup.set(9, numberField.get(42));
        sideMoveSetup.set(10, numberField.get(43));
        sideMoveSetup.set(11, numberField.get(44));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(33, nf.get(0));
        numberField.set(34, nf.get(1));
        numberField.set(35, nf.get(2));
        numberField.set(36, nf.get(3));
        numberField.set(37, nf.get(4));
        numberField.set(38, nf.get(5));
        numberField.set(39, nf.get(6));
        numberField.set(40, nf.get(7));
        numberField.set(41, nf.get(8));
        numberField.set(42, nf.get(9));
        numberField.set(43, nf.get(10));
        numberField.set(44, nf.get(11));
        for(int j = 0; j < nf.size(); j++){
            numberField.set(j + 33, nf.get(j));
        }
        for(int j = 0; j < face.size(); j++){
            face.set(j, numberField.get(j + 45));
        }
        numberField.set(45, face.get(6));
        numberField.set(46, face.get(3));
        numberField.set(47, face.get(0));
        numberField.set(48, face.get(7));
        numberField.set(50, face.get(1));
        numberField.set(51, face.get(8));
        numberField.set(52, face.get(5));
        numberField.set(53, face.get(2));
        //E
        sideMoveSetup.set(0, numberField.get(21));
        sideMoveSetup.set(1, numberField.get(22));
        sideMoveSetup.set(2, numberField.get(23));
        sideMoveSetup.set(3, numberField.get(24));
        sideMoveSetup.set(4, numberField.get(25));
        sideMoveSetup.set(5, numberField.get(26));
        sideMoveSetup.set(6, numberField.get(27));
        sideMoveSetup.set(7, numberField.get(28));
        sideMoveSetup.set(8, numberField.get(29));
        sideMoveSetup.set(9, numberField.get(30));
        sideMoveSetup.set(10, numberField.get(31));
        sideMoveSetup.set(11, numberField.get(32));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }
        }
        numberField.set(21, nf.get(0));
        numberField.set(22, nf.get(1));
        numberField.set(23, nf.get(2));
        numberField.set(24, nf.get(3));
        numberField.set(25, nf.get(4));
        numberField.set(26, nf.get(5));
        numberField.set(27, nf.get(6));
        numberField.set(28, nf.get(7));
        numberField.set(29, nf.get(8));
        numberField.set(30, nf.get(9));
        numberField.set(31, nf.get(10));
        numberField.set(32, nf.get(11));
    }
    public void z(){
        //F
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }

        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(6));
        numberField.set(13, face.get(3));
        numberField.set(14, face.get(0));
        numberField.set(24, face.get(7));
        numberField.set(26, face.get(1));
        numberField.set(36, face.get(8));
        numberField.set(37, face.get(5));
        numberField.set(38, face.get(2));
        //B'
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }

        numberField.set(18, face.get(2));
        numberField.set(19, face.get(5));
        numberField.set(20, face.get(8));
        numberField.set(30, face.get(1));
        numberField.set(32, face.get(7));
        numberField.set(42, face.get(0));
        numberField.set(43, face.get(3));
        numberField.set(44, face.get(6));
        //S
        sideMoveSetup.set(0, numberField.get(3));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(5));
        sideMoveSetup.set(3, numberField.get(16));
        sideMoveSetup.set(4, numberField.get(28));
        sideMoveSetup.set(5, numberField.get(40));
        sideMoveSetup.set(6, numberField.get(50));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(48));
        sideMoveSetup.set(9, numberField.get(34));
        sideMoveSetup.set(10, numberField.get(22));
        sideMoveSetup.set(11, numberField.get(10));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 3){
                nf.set(j, sideMoveSetup.get(j - 3));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 9)));
            }

        }
        numberField.set(3, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(5, nf.get(2));
        numberField.set(16, nf.get(3));
        numberField.set(28, nf.get(4));
        numberField.set(40, nf.get(5));
        numberField.set(50, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(48, nf.get(8));
        numberField.set(34, nf.get(9));
        numberField.set(22, nf.get(10));
        numberField.set(10, nf.get(11));
    }
    public void z2(){
        //F2
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }

        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(8));
        numberField.set(13, face.get(7));
        numberField.set(14, face.get(6));
        numberField.set(24, face.get(5));
        numberField.set(26, face.get(3));
        numberField.set(36, face.get(2));
        numberField.set(37, face.get(1));
        numberField.set(38, face.get(0));
        //B2
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }
        numberField.set(18, face.get(8));
        numberField.set(19, face.get(7));
        numberField.set(20, face.get(6));
        numberField.set(30, face.get(5));
        numberField.set(32, face.get(3));
        numberField.set(42, face.get(2));
        numberField.set(43, face.get(1));
        numberField.set(44, face.get(0));
        //S2
        sideMoveSetup.set(0, numberField.get(3));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(5));
        sideMoveSetup.set(3, numberField.get(16));
        sideMoveSetup.set(4, numberField.get(28));
        sideMoveSetup.set(5, numberField.get(40));
        sideMoveSetup.set(6, numberField.get(50));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(48));
        sideMoveSetup.set(9, numberField.get(34));
        sideMoveSetup.set(10, numberField.get(22));
        sideMoveSetup.set(11, numberField.get(10));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 6){
                nf.set(j, sideMoveSetup.get(j - 6));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 6)));
            }

        }
        numberField.set(3, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(5, nf.get(2));
        numberField.set(16, nf.get(3));
        numberField.set(28, nf.get(4));
        numberField.set(40, nf.get(5));
        numberField.set(50, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(48, nf.get(8));
        numberField.set(34, nf.get(9));
        numberField.set(22, nf.get(10));
        numberField.set(10, nf.get(11));
    }
    public void z3(){  //aka z'
        //F'
        sideMoveSetup.set(0, numberField.get(6));
        sideMoveSetup.set(1, numberField.get(7));
        sideMoveSetup.set(2, numberField.get(8));
        sideMoveSetup.set(3, numberField.get(15));
        sideMoveSetup.set(4, numberField.get(27));
        sideMoveSetup.set(5, numberField.get(39));
        sideMoveSetup.set(6, numberField.get(47));
        sideMoveSetup.set(7, numberField.get(46));
        sideMoveSetup.set(8, numberField.get(45));
        sideMoveSetup.set(9, numberField.get(35));
        sideMoveSetup.set(10, numberField.get(23));
        sideMoveSetup.set(11, numberField.get(11));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }
        numberField.set(6, nf.get(0));
        numberField.set(7, nf.get(1));
        numberField.set(8, nf.get(2));
        numberField.set(15, nf.get(3));
        numberField.set(27, nf.get(4));
        numberField.set(39, nf.get(5));
        numberField.set(47, nf.get(6));
        numberField.set(46, nf.get(7));
        numberField.set(45, nf.get(8));
        numberField.set(35, nf.get(9));
        numberField.set(23, nf.get(10));
        numberField.set(11, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 12 && j <= 14) {
                face.set(j - 12, numberField.get(j));
            }
            else if(j >= 24 && j <= 26){
                face.set(j - 21, numberField.get(j));
            }
            else if(j >= 36 && j <= 38){
                face.set(j - 30, numberField.get(j));
            }
        }
        numberField.set(12, face.get(2));
        numberField.set(13, face.get(5));
        numberField.set(14, face.get(8));
        numberField.set(24, face.get(1));
        numberField.set(26, face.get(7));
        numberField.set(36, face.get(0));
        numberField.set(37, face.get(3));
        numberField.set(38, face.get(6));
        //B
        sideMoveSetup.set(0, numberField.get(0));
        sideMoveSetup.set(1, numberField.get(1));
        sideMoveSetup.set(2, numberField.get(2));
        sideMoveSetup.set(3, numberField.get(17));
        sideMoveSetup.set(4, numberField.get(29));
        sideMoveSetup.set(5, numberField.get(41));
        sideMoveSetup.set(6, numberField.get(53));
        sideMoveSetup.set(7, numberField.get(52));
        sideMoveSetup.set(8, numberField.get(51));
        sideMoveSetup.set(9, numberField.get(33));
        sideMoveSetup.set(10, numberField.get(21));
        sideMoveSetup.set(11, numberField.get(9));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }
        numberField.set(0, nf.get(0));
        numberField.set(1, nf.get(1));
        numberField.set(2, nf.get(2));
        numberField.set(17, nf.get(3));
        numberField.set(29, nf.get(4));
        numberField.set(41, nf.get(5));
        numberField.set(53, nf.get(6));
        numberField.set(52, nf.get(7));
        numberField.set(51, nf.get(8));
        numberField.set(33, nf.get(9));
        numberField.set(21, nf.get(10));
        numberField.set(9, nf.get(11));

        for(int j = 9; j < 45; j++){
            if(j >= 18 && j <= 20) {
                face.set(j - 18, numberField.get(j));
            }
            else if(j >= 30 && j <= 32){
                face.set(j - 27, numberField.get(j));
            }
            else if(j >= 42){
                face.set(j - 36, numberField.get(j));
            }
        }
        numberField.set(18, face.get(6));
        numberField.set(19, face.get(3));
        numberField.set(20, face.get(0));
        numberField.set(30, face.get(7));
        numberField.set(32, face.get(1));
        numberField.set(42, face.get(8));
        numberField.set(43, face.get(5));
        numberField.set(44, face.get(2));
        //S'
        sideMoveSetup.set(0, numberField.get(3));
        sideMoveSetup.set(1, numberField.get(4));
        sideMoveSetup.set(2, numberField.get(5));
        sideMoveSetup.set(3, numberField.get(16));
        sideMoveSetup.set(4, numberField.get(28));
        sideMoveSetup.set(5, numberField.get(40));
        sideMoveSetup.set(6, numberField.get(50));
        sideMoveSetup.set(7, numberField.get(49));
        sideMoveSetup.set(8, numberField.get(48));
        sideMoveSetup.set(9, numberField.get(34));
        sideMoveSetup.set(10, numberField.get(22));
        sideMoveSetup.set(11, numberField.get(10));
        for(int j = 0; j < sideMoveSetup.size(); j++){
            if(j >= 9){
                nf.set(j, sideMoveSetup.get(j - 9));
            }
            else{
                nf.set(j, sideMoveSetup.get((j + 3)));
            }

        }
        numberField.set(3, nf.get(0));
        numberField.set(4, nf.get(1));
        numberField.set(5, nf.get(2));
        numberField.set(16, nf.get(3));
        numberField.set(28, nf.get(4));
        numberField.set(40, nf.get(5));
        numberField.set(50, nf.get(6));
        numberField.set(49, nf.get(7));
        numberField.set(48, nf.get(8));
        numberField.set(34, nf.get(9));
        numberField.set(22, nf.get(10));
        numberField.set(10, nf.get(11));
    }
}
