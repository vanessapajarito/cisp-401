package com.company.controllers;

import com.company.models.WordList;
import com.company.views.CmdLineView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String[] letters;
    public static int numLetters = 0;
    public static int numGuesses =6;
    public static int correctGuesses;
    public static String theGuess;
    public static String[] hints;
    public static  CmdLineView view;

    public static void main(String[] args) {


        correctGuesses = 0;

        GetWord getWord = new GetWord();
        String theWord = getWord.getTheWord();

        WordList word = new WordList(theWord);

        //WordList word = new WordList(getWord.getTheWord());

        letters = calculateLetters(word.getTheWord());
        hints = new String[letters.length];
        for(int j = 0; j < letters.length;j++){
            hints[j] ="_";
        }

        view = new CmdLineView(letters);
        view.startGame(numGuesses);
        view.cheat(word.getTheWord());

        while(numGuesses > 0 && !(correctGuesses == letters.length)){
            hints = guess();
            view.displayHints(hints);
            //display
            //System.out.println(hints);
        }
        if(numGuesses == 0) {
            view.losingText(word.getTheWord());
        } else {
            view.winningText();
        }
    }

    private static String[] calculateLetters(String theWord){
        String[] letters = theWord.split("");
        numLetters = letters.length;
        return letters;
    }

    private static String[] guess(){

        theGuess = view.makeAGuess();

        String msg = "";
        boolean right = false;

        for(int i = 0; i < letters.length; i++){
            if(letters[i].equals(theGuess)) {
                hints[i] = theGuess;
                right = true;
                correctGuesses++;
            }
        }
        if (!right) {
            numGuesses--;
        }
        return hints;
    }
}

