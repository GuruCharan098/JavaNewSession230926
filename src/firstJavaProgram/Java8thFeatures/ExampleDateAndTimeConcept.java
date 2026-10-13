package firstJavaProgram.Java8thFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class ExampleDateAndTimeConcept {

	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalTime currentTime = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(today.format(formatter));
		System.out.println(currentTime);
		System.out.println(dateTime);
		
		
		LocalDate joiningDate = LocalDate.of(2020, 1, 15);
		
		System.out.println(joiningDate);
		
		Period experience = Period.between(joiningDate, today);
		
		System.out.println(experience.getYears());
		
		
		List<String> student = Arrays.asList("Ram", "Aman", "Deepa");
		
		student.forEach(std -> {
			System.out.println(std);
		});
 
		
	}
}
