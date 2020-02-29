package org.codelity.mutiplechoice;

public class Test3 {
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
		
		String original=s;
		int hour;
		String[] oArray;
		if(original.equals("12:00:00AM"))
		{
			return "00:00:00";
		}
		else if(original.equals("12:00:00PM")) {
			return "12:00:00";
		}
		else if(original.contains("AM")) {
			//original.replace("AM","");
			return original.replace("AM","");
			
		}
		
		else {
			
			oArray=original.split(":");
			hour=Integer.parseInt(oArray[0])+12;
			//minutes=Integer.parseInt(oArray[1]);
			oArray[0] =String.valueOf(hour);
			return oArray[0]+":"+oArray[1]+":"+oArray[2].replace("PM","");
			
		}	
		

    }
	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45AM"));
		
		
		
	}

}
