package Classwork.Lists;

public class Enum {

	private static enum DaysOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

	
	public static void main(String[] args) {
		for (DaysOfWeek day : DaysOfWeek.values()) {
			switch (day) {
			case Monday:
				System.out.println(day + " Oh No it's Monday");
				break;
			case Tuesday:
				System.out.println(day + " Getting there");
				break;
			case Wednesday:
				System.out.println(day + " Hump DAY");
				break;
			case Thursday:
				System.out.println(day + " Almost there");
				break;
			case Friday:
				System.out.println(day + " TGIF");
				break;
			case Saturday:
				System.out.println(day + " Weekend!!");
				break;
			case Sunday:
				System.out.println(day + " Last Day Of Weekend");
				break;
			}
			
			
			
			
			
			
		}

	}

}
