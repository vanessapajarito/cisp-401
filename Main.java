package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Dice roller version 1 - simple single dice

        /*
        Random rand = new Random();
        int theRoll = rand.nextInt(6) +1 ; //will give ran number 1-6
        //bound is the max number from 0 - 5 or whatever argument typed in
        System.out.println(theRoll);
         */
        //version 2 - roll two dice
        /*int total = 0;
        Random rand1 = new Random();
        Random rand2 = new Random();
        int die1 = rand1.nextInt(6) + 1;
        int die2 = rand2.nextInt(6) + 1;
        total = die1 + die2;
        System.out.println("You rolled " + die1 + " and " + die2 + " for a total of " + total);
        if(die1 == die2) {
            System.out.println("You rolled doubles!");
        }*/
        //version 3 - lots of arrays
        /*int total = 0;
        int[] dice = new int[5];
        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        for(int j = 0; j < dice.length; j++){
            msg += "You rolled a " + dice[j] + "\n";
            total += dice[j];
        }
        System.out.println(msg);
        System.out.println("Your total is " + total);
    }*/
        //version 4 - enhanced for loop
        /*
        int total = 0;
        int[] dice = new int[6];
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        //for(int i = 0; i < 5; i++)
        String msg = "";
        for(int die: dice){
            msg += "You rolled a " + die + "\n";
            System.out.println(msg);
            total += die;
        }
        //System.out.println(msg);
        System.out.println("Your total is " + total);
*/

        //version 5 - prompt for the number of sides
        /*Scanner input = new Scanner(System.in);
        System.out.println("How many die do you want to roll?: ");
        int numDie = input.nextInt();
        int total = 0;
        int[] dice = new int[numDie];

        for (int i = 0; i < numDie; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        //for(int i = 0; i < 5; i++)
        String msg = "";
        for(int die: dice){
            msg += "You rolled a " + die + "\n";
            System.out.println(msg);
            total += die;
        }
        //System.out.println(msg);
        System.out.println("Your total is " + total);*/

        //version 6 - prompt for number of sides
        /*Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the die you want to roll?: ");
        int numSides = input.nextInt();
        int total = 0;
        //go back to rolling 5 die
        int[] dice = new int[5];

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        //for(int i = 0; i < 5; i++)
        String msg = "";
        for(int die: dice){
            msg += "You rolled a " + die + " on a " + numSides + " sided dice"
        + "\n";
            System.out.println(msg);
            total += die;
        }
        //System.out.println(msg);
        System.out.println("Your total is " + total);*/

        //challenge (homework)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of dice and sides you want to roll.\n" +
                "Please enter in the format '2d6' which is 2 6 sided dice: " );
        String userValue = input.nextLine();
        String[] arrOfStr = userValue.split("d",3);
        int numSides = Integer.parseInt(arrOfStr[1]);
        int numOfDice = Integer.parseInt(arrOfStr[0]);
        int total = 0;

        int[] dice = new int[numOfDice];

        for (int i = 0; i < numOfDice; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        //for(int i = 0; i < 5; i++)
        String msg = "";
        for(int die: dice){
            msg += "You rolled a " + die + " on a " + numSides + " sided dice"
                    + "\n";
            System.out.println(msg);
            total += die;
        }
        //System.out.println(msg);
        System.out.println("Your total is " + total);
    }
}
