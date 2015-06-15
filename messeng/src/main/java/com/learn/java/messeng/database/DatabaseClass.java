package com.learn.java.messeng.database;

import java.util.HashMap;
import java.util.Map;

import com.learn.java.messeng.model.Message;
import com.learn.java.messeng.model.Profile;

public class DatabaseClass {
	//a table of message objects
	private static Map<Long, Message> messages = new HashMap<>();
	
	private static Map<Long, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}


	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}


}
