package com.app.dto;

public class UserDtao {

	private String username;

	private String description;
	
	private int port;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserDtao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public UserDtao(String username, String description) {
		super();
		this.username = username;
		this.description = description;
	}

}
