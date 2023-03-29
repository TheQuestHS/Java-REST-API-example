package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Server;

public interface ServerService {
	
	public List<Server> getServers();
	
	public Server getServer(long id);
}
