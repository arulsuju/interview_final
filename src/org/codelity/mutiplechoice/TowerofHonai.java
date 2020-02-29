package org.codelity.mutiplechoice;

public class TowerofHonai {
	public int NoofMove(int desk) {
		if(desk==1) {
			return 1;
		}
		else {
			return (2*NoofMove(desk-1))+1;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		TowerofHonai towerofHonai=new TowerofHonai();
		System.out.println(towerofHonai.NoofMove(2));
	}

}
