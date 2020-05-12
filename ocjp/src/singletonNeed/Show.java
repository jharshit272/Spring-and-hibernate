package singletonNeed;
import java.util.*;
public class Show {
	private Set<String> availableSeats;
	
	public Show() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	public static void main(String[] args) {
		Show show = new Show(); // a new Show gets created
		ticketAgentBooks("1A", show);
		ticketAgentBooks("1A", show);
	}
	private static void ticketAgentBooks(String seat, Show show) {
		//Show show = new Show(); // a new Show gets created
		// each time we call the method
		System.out.println(show.bookSeat(seat));
	}
}