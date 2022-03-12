package com.learning;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<String> games = new Stack<String>();
        games.add("Call of Duty");
        games.add("MK 4");
        games.add("Mario Bros");
        try {
            System.out.println(games.contains('M'));
            System.out.println("Stack as is: " + games);
            System.out.println("Stack peek (to get the top stack element): " + games.peek());
            System.out.println("First Pop: " + games.pop());
            System.out.println("Stack after first pop: " + games);
            System.out.println("Second Pop: " + games.pop());
            System.out.println("Stack after second pop: " + games);
            System.out.println("Third Pop: " + games.pop());
            System.out.println("Stack after third pop: " + games);
            System.out.println("Fourth Pop (but there is no data...) so you should get EmptyStackException: " + games.pop());
            System.out.println("Stack after fourth pop: " + games);
        } catch (EmptyStackException e) {
            System.out.println("Fourth pop didnt work because there was only 3 games in the stack");
        }
    }
}