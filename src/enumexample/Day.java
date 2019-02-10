package enumexample;

public class Day {

	Week week;
	
	public Day() {}
	
	public Day(Week week) {
		this.week = week;
	}
	
	public void whichDay(Week week) {
		switch(week) {
		
		case Monday:
			System.out.println("Read java book");
			break;
		case Tuesday:
			System.out.println("Read java book and code");
			break;
		case Wednesday:
			System.out.println("Do Codelab Exercises");
			break;
		case Thursday:
			System.out.println("Do Codelab Exercises and Home work");
			break;
		case Friday:
			System.out.println("Study Github well");
			break;
		case Saturday:
			System.out.println("Join Saturday class");
			break;
		case Sunday:
			System.out.println("Join Sunday class");
			break;
		default:
			System.out.println("Are you out of your mind. we only have seven days week.");
			break;
		}
	}
}
