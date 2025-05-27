package StreamAPICodingLevel2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GetCurrentDateTime {

	public static void main(String[] args) {
		 System.out.println("Current Local Date: " + LocalDate.now()); //date
		 System.out.println("Current Local Date: " + LocalTime.now());  //time
		 System.out.println("Current Local Date: " + LocalDateTime.now()); //date and time

	}

}
