package com.sharepic.UserManagement.Service;

import org.springframework.stereotype.Service;

import com.sharepic.UserManagement.model.ProfileFollowedDetails;

@Service 
public interface UserManagementService {
	
	void followUser(ProfileFollowedDetails profileFollowedDetails);

}
