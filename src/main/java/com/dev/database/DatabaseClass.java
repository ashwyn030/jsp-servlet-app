package main.java.com.dev.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.dev.model.Claim;
import main.java.com.dev.model.User;

public class DatabaseClass {

	private static Map<String, User> users = new HashMap<String, User>();
	private static Map<Long, List<Claim>> claims = new HashMap<Long, List<Claim>>();

	static {
		DatabaseClass.users.put("ashwyn030", new User(1, "ashwyn030", "ashwyn030p"));
		DatabaseClass.users.put("mk030", new User(2, "mk030", "mk030p"));

		List<Claim> ashwynClaims = new ArrayList<Claim>();

		Claim claim1 = new Claim();
		claim1.setClaimId(1);
		claim1.setClaimType(0);
		claim1.setStatus(0);
		claim1.setDateClaimed(new Date());
		claim1.setClaimApprovedOn(new Date());

		Claim claim2 = new Claim();
		claim2.setClaimId(2);
		claim2.setClaimType(1);
		claim2.setStatus(2);
		claim2.setDateClaimed(new Date());
		claim2.setClaimApprovedOn(new Date());

		ashwynClaims.add(claim1);
		ashwynClaims.add(claim2);
		
		DatabaseClass.claims.put((long) 1, ashwynClaims);
	}

	public static Map<String, User> getUsers() {
		return users;
	}

}
