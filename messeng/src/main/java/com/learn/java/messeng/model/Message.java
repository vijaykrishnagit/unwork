package com.learn.java.messeng.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long messageId;
	private String message;
	private Date createDate;
	private String author;
	
	public Message()
	{
		
	}
	
	public Message(long messageId, String message, Date createDate,
			String author) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.createDate = createDate;
		this.author = author;
	}



	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
