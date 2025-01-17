package week05CodingAssignment;

public class App {
	
	static Logger logger;

	public static void main(String[] args) 
	{
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
	
		logger = new SpacedLogger();
		
		logger.log("Stop");
		logger.error("Stop");
		
	
	
	}
	
	
	}




