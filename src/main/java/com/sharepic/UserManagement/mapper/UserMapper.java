package com.sharepic.UserManagement.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;
import com.sharepic.UserManagement.Entity.User;



@Component
public class UserMapper {
	
	public User mapUserModeltoEntity(com.sharepic.UserManagement.model.User input)
	{
		User user = new User();
		user.setFullName(input.getFullName());
	    user.setUserName(input.getUserName());
	    user.setProfilePicture(input.getprofilePicture());
	    user.setProfileDescription(input.getprofileDescription());
	    //user.setPassword(input.getPassword());
	    //user.setCreatedOn(new Date());
		
		return user;
		
	}

}
