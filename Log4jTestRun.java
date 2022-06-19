package Reflection;
/*
 * @author Sachintha Ashika Bandara Yapa
 */
import org.apache.log4j.Logger;
public class Log4jTestRun {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Log4jTestRun.class);
		logger.debug("This is Debug:" + "parameter/exception object");
		logger.info("This is info:" + "parameter/exception object");
		logger.warn("This is warn:" + "parameter/exception object");
		logger.error("This is error:" + "parameter/exception object");
		logger.fatal("This is fatal:" + "parameter/exception object");
 
	}
}
