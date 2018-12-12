package com.tech.sharekart.ctrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.sharekart.dao.UserDao;
import com.tech.sharekart.model.Users;



@RestController("/")
public class UserCtrl {
	

	@Autowired
	UserDao users;
	

	@PostMapping("/add")
	public  @ResponseBody String createUser(@RequestBody Users use)
	{
		users.save(use);
		return "Saved sucess";
	}
	
	@GetMapping("/getall")
	public  @ResponseBody Iterable<Users> getUsers()
	{
		return users.findAll();
		
	}
	
	@GetMapping("/mobile/{mobile}")
	public  @ResponseBody Iterable<Users> getUsersByMobile(@PathVariable String mobile)
	{
		return users.findByMobile(mobile);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public  @ResponseBody String deleteUser(@PathVariable String id)
	{
	    
		users.deleteById(id);

		return "deleted sucess";
	}
	
	

}
