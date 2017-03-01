package utilities;

import java.util.Calendar;
import org.apache.log4j.Logger;


public class Log {

	// initialize Log4j log
	private static Logger log = Logger.getLogger(Log.class.getName());
	
//	message at the beginning 
	public static void startTestCase(String testCaseName){
	
		
		log.info("*********************************");
		log.info("*********************************");
		log.info("##########   " + testCaseName + "   ##########");
		//log.info("##########   " +  Calendar.MONTH + "-" + Calendar.DAY_OF_MONTH + "-" + Calendar.YEAR + "   ########");
		log.info("*********************************");
		log.info("*********************************");
		
	}
	
	//message at the end
	public static void endTestCase(String testCaseName){
		log.info("*********************************");
		log.info("*********************************");
		log.info("##########    E N D    ##########");
		log.info("*********************************");
		log.info("*********************************");
	}
	
	public static void info(String message){
		log.info(message);
	}
	
	public static void warn(String message){
		log.warn(message);
	}
	
	public static void error(String message){
		log.error(message);
	}
	
	public static void fatal(String message){
		log.fatal(message);
	}
	
	public static void debug(String message){
		log.debug(message);
	}
	
}
