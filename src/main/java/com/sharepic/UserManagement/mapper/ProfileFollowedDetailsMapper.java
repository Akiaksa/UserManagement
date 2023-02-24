package com.sharepic.UserManagement.mapper;

import org.springframework.stereotype.Component;


import com.sharepic.UserManagement.Entity.*;

@Component
public class ProfileFollowedDetailsMapper {
	
	public ProfileFollowedDetails profileFollowedModelToEntity(com.sharepic.UserManagement.model.ProfileFollowedDetails input)
	{
		ProfileFollowedDetails obj = new ProfileFollowedDetails();
		obj.setFollowedBy(input.getFollowedBy());
		obj.setFollowedUser(input.getFollowedUser());
		obj.setId(input.getId());
		
		return obj;
		
	}

}
