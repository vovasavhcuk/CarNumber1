package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        genNum();
    }
    public static String genNum(){
        final int NUMLENTH = 8;
        String carNum = new String("");
        String charecters = new String("УКЕНХВАРОЧСМТ");
        String digits = new String("1234567890");
        Random r = new Random();
        for(int i = 0; i < 2; i++){
            carNum += charecters.charAt(r.nextInt(charecters.length()));
        }
        for(int i = 0; i < 4; i++){
            carNum += digits.charAt(r.nextInt(digits.length()));
        }
        for(int i = 0; i < 2; i++){
            carNum += charecters.charAt(r.nextInt(charecters.length()));
        }
        System.out.println(carNum);
        return carNum;
    }
}
