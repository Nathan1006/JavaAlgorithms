package com.testing.November1;
//https://edabit.com/challenge/3S8XppR6Yf5mXPxij
/*
Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:

"Player 1 wins"
"Player 2 wins"
"TIE" (if both inputs are the same)
The rules of rock, paper, scissors, if not known:

Both players have to say either "rock", "paper" or "scissors" at the same time.
Rock beats scissors, paper beats rock, scissors beat paper.
Examples
rps("rock", "paper") ➞ "Player 2 wins"

rps("paper", "rock") ➞ "Player 1 wins"

rps("paper", "scissors") ➞ "Player 2 wins"

rps("scissors", "scissors") ➞ "TIE"

rps("scissors", "paper") ➞ "Player 1 wins"
*/

public class RockPaperScissors {
    public static String Alg8(String s1, String s2) {
        String p1Wins = "Player 1 wins";
        String p2Wins = "Player 2 wins";
        if (s1 == s2){
            System.out.println("TIE");
            return "TIE";
        }
        switch (s1){
            case "rock":
                if (s2 == "paper"){
                    System.out.println("Player 2 wins");
                    return p2Wins;
                } else {
                    System.out.println("Player 1 wins");
                    return p1Wins;
                }
            case "paper":
                if (s2 == "scissors"){
                    System.out.println("Player 2 wins");
                    return p2Wins;
                } else {
                    System.out.println("Player 1 wins");
                    return p1Wins;
                }
            case "scissors":
                if (s2 == "rock"){
                    System.out.println("Player 2 wins");
                    return p2Wins;
                } else {
                    System.out.println("Player 1 wins");
                    return p1Wins;
                }
        }
        return "TIE";
    }
}
