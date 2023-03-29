package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Server;

@Service
public class ServerServiceimpl implements ServerService {
	
	List<Server> list;
	
	public ServerServiceimpl() {
		list = new ArrayList<>();
		list.add(new Server("my cosmos",123,"java","django"));
		list.add(new Server("my carlos",124,"cpp","QT"));
	}

	@Override
	public List<Server> getServers() {
		return list;
	}
	
	@Override
	public Server getServer(long id) {
		Server s=null;
		for(Server server:list) {
			if(server.getId()==id) {
				s = server;
				break;
			}
		}
		return s;
	}
}
