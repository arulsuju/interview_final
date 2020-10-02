package org.codelity.sushal;

public class Lattice {
    public String solution(int AX,int AY,int BX,int BY){

      int CX = BX - AX;
      int CY = BY - AY;
            // Rotate by 90 degree clockwise
      int RX = CY;
      int RY = -CX;
            // Normalize
      int norm = gcd(Math.abs(RX), Math.abs(RX));
      int Nx = RX / norm;
      int NY = RY / norm;
        return (BX + Nx)+","+(BY + NY);
    }
    public static int gcd(int a,int b){
        if (b==0) {
            return a;
        }

        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Lattice lattice=new Lattice();
        System.out.println(lattice.solution(-1,3,3,1));

    }
}
