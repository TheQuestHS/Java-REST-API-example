package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Server;
import com.springrest.springrest.services.ServerService;

@RestController
public class MyController {
	
	@Autowired
	private ServerService serverService;
	
	@GetMapping("/servers")
	public List<Server> getServers(){
		return this.serverService.getServers();
	}
	
	@GetMapping("/servers/{id}")
	public Server getServer(@PathVariable String id) {
		return this.serverService.getServer(Long.parseLong(id));
	}
}
