package org.codelity.mutiplechoice;

public class City {
	class Manhattan{
		void dostuff()throws Exception
		{
			System.out.println("x");
		}
	}
	class TimeSquare extends Manhattan{
		void dostuff()throws Exception
		{
		
		}
	}
	public static void main(String args[])throws Exception{
		new City().go();
	}
	void go()throws Exception{
		new TimeSquare().dostuff();
	}

}
