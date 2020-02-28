package org.codelity;
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

