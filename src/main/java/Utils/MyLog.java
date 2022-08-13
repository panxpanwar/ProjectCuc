package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog {
	
	private static Logger LOG;
	
	public MyLog() {
		 LOG = LogManager.getLogger(MyLog.class);
	}
	
	public Logger log() {
		return LOG;
	}

}
