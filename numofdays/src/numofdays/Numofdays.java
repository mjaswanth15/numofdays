package numofdays;

public class Numofdays {

	public static void main(String[] args) {
	
	isLeapYear(2000);
	isLeapYear(10000);
	isLeapYear(-200);
	isLeapYear(1997);

	}
    public static void isLeapYear(int year) {
    	if(year < 1 || year > 9999) {
    		System.out.println("false");
    	}
    	else if(year%4==0) {
    	
        System.out.println(+ year +" is leap year");
    	}
    	else {
    		System.out.println(+ year + " is not a leap year");
    	}
    	}
    	
    }
