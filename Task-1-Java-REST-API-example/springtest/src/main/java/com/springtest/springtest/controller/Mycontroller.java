package com.springtest.springtest.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springtest.repo.ServerRepository;
import com.springtest.springtest.server.Servers;



@RestController
@RequestMapping("/Servers")
public class Mycontroller {
	@Autowired
	private ServerRepository serverRepository;
   @PostMapping("/")
   public ResponseEntity<?> addserver(@RequestBody Servers server)
   {
	   Servers save=this.serverRepository.save(server);
            return ResponseEntity.ok(save);    
  }
  @GetMapping("/")
  public ResponseEntity<?> getServer()
   {
            return ResponseEntity.ok(this.serverRepository.findAll());    
   }
  

  @GetMapping("/{name}")
  public ResponseEntity<Servers> getServerById(@PathVariable("name") String name) {
	  Optional<Servers> ServerData = serverRepository.findByName(name);

	  if (ServerData.isPresent()) {
	    return new ResponseEntity<>(ServerData.get(), HttpStatus.OK);
	  } else {
	    return new ResponseEntity<>(ServerData.get(),HttpStatus.NOT_FOUND);
	  }
  }
    
  @PutMapping("/{id}")
  public ResponseEntity<Servers> updateServer(@PathVariable("id") Integer id, @RequestBody Servers server) {
	  Optional<Servers> serverData = serverRepository.findById(id);

	  if (serverData.isPresent()) {
	    Servers _server = serverData.get();
	    _server.setId(server.getId());
	    _server.setName(server.getName());
	    _server.setLanguage(server.getLanguage());
	    return new ResponseEntity<>(serverRepository.save(_server), HttpStatus.OK);
	  } else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	  }
    
  }
   @DeleteMapping("/{id}")
   public void deleteServer(@PathVariable String id){
       serverRepository.deleteById(Integer.parseInt(id));
   }
   
   
}
