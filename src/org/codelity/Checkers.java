package org.codelity;
/*
jafar  is playing checkers with his friend alladin. Checkers is a board game in which both players take tums to move their pawns. PersonA has just one pawn left, and he is going to take a final turn, beating as many of PersonB's pawns as possible.

Pawns in checkers move diagonally. The pawn always moves one step in the up-right or up-left direction. If PersonA's pawn moves and its target field is occupied by one of PersonB's pawns, PersonB's pawn can be beaten: PersonA's pawn leaps over PersonB's pawn. taking two steps In the chosen direction and removing PersonB's pawn from the board. PersonA can beat PersonB's pawn in this way only when the field beyond PersonB's pawn is empty.

After beating alladin's pawn. jafar  can continue his turn and make another move, but only if he will again beat another one of PersonB's pawns Of course. after this additional move, PersonA can continue his turn again by beating another of PersonB's pawns, and so on for as long as there are further pawns to beat. When it is no longer possible to beat one of PersonB's pawns, PersonA's turn ends The maximum number of pawns owned by PersonB that PersonA can beat in his turn

This is the algorithm which, gives a square board of N x N size describing alladin and jafar  pawns, returns the maximum number of pawns personA can beat in one turn. If none of personB’s pawns can be beaten, the algorithm should return 0. Person’s pawn is describing by the ‘O’ character, PersonB’s pawns by ‘X’ character and empty fields by ‘.’(dots). The board is describing from top to bottom and from the left to right.

For example, given, B[0] = “..X…” B[1] = “……” B[2] = “….x.” B[3] = “.X.…” B[4] = “..X.X.” B[5] = “…O..”

The function returns 2

Given input B[0] = “X….” B[1] = ”.X…” B[2] = “..O..” B[3] = “…X.” B[4] = “…..”

This functions returns 0.
Pawns in checkers move diagonally. The pawn always moves one step in the up-right or up-left direction. If Jafar's pawn moves and its target field is occupied by one of Aladdin's pawns, Aladdin's pawn can be beaten: Jafar's pawn leaps over Aladdin's pawn, taking two steps in the chosen direction and removing Aladdin's pawn from the board. Jafar can beat Aladdin's pawn in this way only when the field beyond Aladdin's pawn is empty. 7. class Solution { 8 public int solution(String[] B) { // write your code in Java SE B 11. After beating Aladdin's pawn, Jafar can continue his turn and make another move, but only if he will again beat another one of Aladdin's pawns. Of course, after this additional move, Jafar can continue his turn again by beating another of Aladdin's pawns, and so on for as long as there are further pawns to beat. When it is no longer possible to beat one of Aladdin's pawns, Jafar's turn ends. For example, in the situation depicted below (where Jafar's pawn is white and Aladdin's pawns are black): You will see save status here Test Output Run Tests Jafar can beat one of Aladdin's pawns by moving his pawn two steps in the up-right direction, and then he can make an additional move, beating another of Aladdin's pawns in the up-left direction. After this move there are no more of Aladdin's pawns available to beat, so Jafar's turn ends, In the following situations:
    Task Java English Files D solution.java x 1 1 you can also use imports, for example: 2 / import java.util.*; 2 task2 solution.java test-input.txt 4 5 // you can write to stdout for debugging purposes, 6.9. // System.out.println("this is a debug message"); Jafar cannot beat Aladdin's pawn. In the first case, the field two steps in the up-right direction from Jafar's pawn (white) is occupied by one of Aladdin's pawns (black); in the second case, this field is placed outside the board in the third case, Jafar's pawn cannot move directly upwards: and finally, in the fourth case, Jafar's pawn cannot move in the down-right, direction. 7 - class Solution { B public int solution(String[] B) { 9 // write your code in Java SE 8 10 } 11 ) What is the maximum number of pawns owned by Aladdin that Jafar can beat in his turn? Write a function: class Solution { public int solution(String[ 1 B); } which, given a square board of Nx N size describing Aladdin's and Jafar's pawns, returns the maximum number of pawns Jafar can beat in one turn, If none of Aladdin's pawns can be beaten, the function should return o. Jafar's pawn is described by the 'o' character, Aladdin's pawns by x characters and empty fields by'.'(dots). The board is described from top to bottom and from left to right. You will see save status here Test Output Run Tests For example, given: B[0] = "..X..." B[1] = "......" B[2] = ".... ." B[3] = B[4] = "..X.X." B51 - "...0.." the function should return 2 (Jafar can beat Aladdin's pawn in the up-right direction and then another one in the up-left direction), Given: B101 = "...."
    Task Java - English Files D solution.java X 1 / you can also use imports, for example: 2 // import java.util.*. task2 If none of Aladdin's pawns can be beaten, the function should return o. solution.java test-input.txt 4 5 // you can write to stdout for debugging purposes, e.g. // System.out.println("this is a debug message"); Jafar's pawn is described by the 'o' character, Aladdin's pawns by 'x' characters and empty fields by'.'(dots). The board is described from top to bottom and from left to right. 7" class Solution { 8 public int solution (String[] B) { // write your code in Java SE 8 10 11 ] 12 For example, given: B[0] = ".. ..." B[i] = "......" B[2] = ".... ." B[3] - ". ...." B[4] = "..X.X." B[5] = "...0.." the function should return 2 (Jafar can beat Aladdin's pawn in the up-right direction and then another one in the up-left direction). Given: B[O) - B[1] = B[2] = B[3] = B[4] = "X... " ". ..." "..0.." "...X." "....." You will see save status here the function should return O. Test Output Run Tests Assume that: . N is an integer within the range (1..30]; • all strings in B consist only of the following characters: ". "X' and/or "o"; • the board is N x N square; the board contains exactly one pawn owned by Jafar. In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/
public class Checkers {
    public int solution(String[] B) {

        // write your code in Java SE 8
        char jafar='O';
        char aladdin='X';
        int totalMoves=0;
        for(int i=0;i <B.length;i++) {
            String value=B[i];
            if(value.indexOf(jafar)>0) {
               // int jafarArrayIndex=i;
                int jafarPosition=value.indexOf(jafar);
                while(i>=2) {
                    if(i>=2) {
                        String aladdinfrstRow=B[i-1];
                        String aladdinSecondRow=B[i-2];
                        if(aladdinfrstRow.charAt(jafarPosition-1)== aladdin && aladdinSecondRow.charAt(jafarPosition-2)=='.') {
                            totalMoves=totalMoves+1;
                            jafarPosition=jafarPosition-2;
                            i= i-2;
                            continue;
                        }
                        if(aladdinfrstRow.charAt(jafarPosition+1)==aladdin && aladdinSecondRow.charAt(jafarPosition+2)=='.') {
                            totalMoves+=1;
                            jafarPosition+=2;
                            i=i-2;
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        break;
                    }
                }
                break;
            }
        }
        return totalMoves;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input[]= {
                "..X...",
                "......",
                "....X.",
                ".X....",
                "..X.X.",
                "...O.."
        };
        String input2[]= {
                "X....",
                ".X...",
                "..O..",
                "...X.",
                ".....",
        };
        String input3[]= {
                "..X...",
                "......",
                "....X.",
                ".X....",
                "..X.X.",
                "...O.."
        };
        Checkers ch=new Checkers();
        System.out.println(ch.solution(input));
        System.out.println(ch.solution(input2));
        System.out.println(ch.solution(input3));
    }
}

