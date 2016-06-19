package main.java.com.dev.service;

import java.util.Map;

import main.java.com.dev.database.DatabaseClass;
import main.java.com.dev.model.User;

public class AuthenticationService {
	private Map<String, User> users = DatabaseClass.getUsers();

	public AuthenticationService() {
		super();
		
	}
	
	private static boolean ifNotNULLAndNonEmpty(String str) {
		return str!=null && !str.isEmpty();
	}

	public boolean login(String username, String password) {
		boolean result=false;
		if(ifNotNULLAndNonEmpty(username)&&ifNotNULLAndNonEmpty(password)){
			User user;
			try {
				System.out.println("-username-"+username);
				System.out.println("-password-"+password);
				user = users.get(username);
				result=password.equals(user.getPassword());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else{
			System.out.println("-username-and-password are either null or blank");	
		}
		return result;

		
	}

	
	
	public void Loout(String username, String password) {

		
	}

}
