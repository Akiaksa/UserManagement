package com.sharepic.UserManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sharepic.UserManagement.model.ProfileFollowedDetails;
import com.sharepic.UserManagement.Service.*;


import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharepic/user")
public class UserManagementController {
	
	@Autowired
	private UserManagementService service;
	
	@PostMapping("/follow")
	public String UserSignUp(@RequestBody ProfileFollowedDetails data)
	{
		service.followUser(data);
		System.out.println(new ResponseEntity<Void>(HttpStatus.OK));
		return "Hello World" +
				"";
	}

}
