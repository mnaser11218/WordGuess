package com.github.zipcodewilmington.sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

private String[] names = {"cat", "dog", "bog", "cut"};
private char[] playersWordArray;
private char[] playersLetters;
private String wordSelected;
private boolean playGame = false;


    public char[] getPlayersWordArray() {
        return playersWordArray;
    }

    public void setPlayersWordArray(char[] playersGuess) {
        this.playersWordArray = playersGuess;
    }

    public WordGuess(){

};

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String randomWord(){
      Random random = new Random();
      int index = random.nextInt(names.length);
      wordSelected = names[index];
      return wordSelected;
    };


    public char[] stringToArray(){
        //String randomWord = randomWord();
        //playersWordArray = new char[wordSelected.length()-1];
        playersWordArray=  wordSelected.toCharArray();
       return playersWordArray;
    };

    public char[] getPlayersLetters() {
        return playersLetters;
    }

//    public void setPlayersLetters(char[] playersLetters) {
//        this.playersLetters = playersLetters;
//    }
    public void setPlayersLetters(int index, char letter) {

        this.playersLetters[index] = letter;
    }

    public String getWordSelected() {
        return wordSelected;
    }

    public void setWordSelected(String wordSelected) {
        this.wordSelected = wordSelected;
    }

    public char[] playersLettersArray(){
            playersLetters = new char[wordSelected.length()];
            Arrays.fill(playersLetters, '_');
            return playersLetters;
    };

    public void runGame() {

        Scanner scanner = new Scanner(System.in);
//        choose a random word from a list
        int limit =1;
        int chances =0;
        boolean closeApp = false;
        System.out.println("your word is : " + randomWord());
        stringToArray();
        playersLettersArray();
        System.out.println(getPlayersWordArray());
        limit = getPlayersWordArray().length;


        while (chances != limit) {

            System.out.println("chances completed: " + chances + " chances left: " + (limit - chances));
            //System.out.println(getPlayersLetters());
            //playersLettersArray();


            System.out.println("Please enter your first letter: ");
            String letter = scanner.nextLine();
            System.out.println("your letter is: " + letter);
//        if(Chars.contains(getPlayersWordArray(), letter.charAt(0))){
//            System.out.println("your letter is included");
//        }
            if ((new String(getPlayersWordArray()).contains(letter))) {
                int index = new String(getPlayersWordArray()).indexOf(letter);
                //setPlayersLetters();
                System.out.println(index);
                setPlayersLetters(index, letter.charAt(0));
                System.out.println(getPlayersLetters());


            }

            if(Arrays.equals(getPlayersLetters(), getPlayersWordArray())) {
                System.out.println("You won!");
            }
            chances++;

            }
        System.out.println("Would you like to play again?");
        String letter = scanner.nextLine();
        if(letter.equalsIgnoreCase("yes")){
            limit =0;
            chances =0;
            this.runGame();

        }else{
            scanner.close();
        }



        }


        }

//        System.out.println("your guess are " + this.playersWordArray);
      //  System.out.println(getWordSelected());


//
//        while (you want to play) { //outer loop
//            start the game
//            set word guessed to false
//            while (the word isn't guessed) { //inner loop
//            print the current game state
//            ask for a guess (a single letter)
//        while(playGame){
//
//        }
//
//            check the letter against the word
//            using the two character arrays discussed above
//            increment the number of guesses
//
//            if the word is guessed
//            player won, congrats
//
//            if too many guesses
//            player lost, too bad, quit game
//        }
//        ask if player wants to play again
//    }
//    display game over


    //};



//    public boolean checkifCharacterIsInWord(char n){
//
//      for(int i = 0; i<= playersGuess.length -1; i++){
//          if(n == playersGuess[i]){
//              System.out.println("the letter " + n + " is included");
//              return true;
//          }
//      }
//        return false;
//    }




