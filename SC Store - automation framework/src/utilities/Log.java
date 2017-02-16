package utilities;

import java.util.Calendar;
import org.apache.log4j.Logger;


public class Log {

	// initialize Log4j log
	private static Logger log = Logger.getLogger(Log.class.getName());
	
//	message at the beginning 
	public static void startTestCase(String testCaseName){
	
		
		log.info("******************** \n********************");
		log.info("##########   " + testCaseName + "   ##########");
		log.info("##########   " + Calendar.DATE + "   ########");
		log.info("******************** \n********************");
		
	}
	
	//message at the end
	public static void endTestCase(String testCaseName){
		log.info("******************** \n********************");
		log.info("##########    E N D    ##########");
		log.info("******************** \n********************");
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
