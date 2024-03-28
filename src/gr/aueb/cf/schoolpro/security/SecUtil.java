package gr.aueb.cf.schoolpro.security;

import org.mindrot.jbcrypt.BCrypt;

public class SecUtil {
	private SecUtil() {
		
	}
	public static boolean checkPassword(String inputPasswd, String storedHashPasswd) {
		return BCrypt.checkpw(inputPasswd, storedHashPasswd);
	}
	
	public static String hashPassword(String inputPasswd) {
		int workload = 12;
		String salt = BCrypt.gensalt(workload);
		return BCrypt.hashpw(inputPasswd, salt);
	}
	

}
