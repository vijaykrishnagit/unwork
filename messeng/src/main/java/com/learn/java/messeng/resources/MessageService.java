package com.learn.java.messeng.resources;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.learn.java.messeng.database.DatabaseClass;
import com.learn.java.messeng.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Bullebu", new Date(), "Vijay"));
		messages.put(2L, new Message(2, "Babu lal is in karCHI", new Date(), "Vijay"));
		
	}
	
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setMessageId(messages.size()+1);
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getMessageId() == 0){
			return null;
		}
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
}
