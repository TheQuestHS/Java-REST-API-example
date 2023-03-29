package com.springrest.springrest.entities;

public class Server {
	private long id;
	private String name;
	private String language;
	private String framework;
	
	public Server(String name, long id, String language, String framework) {
		super();
		this.name = name;
		this.id = id;
		this.language = language;
		this.framework = framework;
	}

	public Server() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "Server [name=" + name + ", id=" + id + ", language=" + language + ", framework=" + framework + "]";
	}
	
	
	
}
