package utilities;

import java.time.LocalDateTime;

public class Calc_Utilities {

	public static String generateEmail(String IDcore){
		//generates random email using format IDCoreYYMMDDmmhh@steelcase.com 
		String email = IDcore + LocalDateTime.now().getYear()
				+ LocalDateTime.now().getMonthValue()
	    		+ LocalDateTime.now().getDayOfMonth()
	    		+ LocalDateTime.now().getMinute()
	    		+ LocalDateTime.now().getSecond()
	    		+ "@steelcase.com";
		return email;
	}
		
}
