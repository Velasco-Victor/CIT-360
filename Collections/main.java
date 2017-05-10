import java.util.*;

public class main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympian", 8, 12);
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theatre.reserveSeat("A02")) {
			System.out.println("Please pay for A02");
		} else {
			System.out.println("Seat already reserved");
		}
		
		Collections.shuffle(seatCopy);
		System.out.println("Print seatCopy");
		printList(seatCopy);
		System.out.println("Printing theatre.seat");
		printList(theatre.seats);
		
	Theatre.Seat minSeat = Collections.min(seatCopy);
	Theatre.Seat maxSeat = Collections.max(seatCopy);
	System.out.println("Min seat Number is " + minSeat.getSeatNumber());
	System.out.println("Max seat number is " + maxSeat.getSeatNumber());
		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("=================================================================");
	}
}
