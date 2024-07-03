package com.github.zipcodewilmington;


import com.github.zipcodewilmington.sample.WordGuess;
import com.sun.tools.javac.Main;

import java.util.Arrays;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args){
Main main = new Main();
        System.out.println("helo");
testings();
        WordGuess wordGuess = new WordGuess();
        //System.out.println(Arrays.toString(wordGuess.getNames()));
//        String wordChoice = wordGuess.randomWord();
//        System.out.println(wordChoice);
//        System.out.println(wordGuess.stringToArray(wordChoice));
//        System.out.println(wordGuess.playersLettersArray());
       // wordGuess.runGame();
        //System.out.println(wordGuess.getPlayersWordArray());
        wordGuess.runGame();




    }

    private static void testings(){
        System.out.println("testing");
    }




}
