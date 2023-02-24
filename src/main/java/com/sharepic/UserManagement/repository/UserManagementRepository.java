package com.sharepic.UserManagement.repository;

import com.sharepic.UserManagement.Entity.ProfileFollowedDetails;
import com.sharepic.UserManagement.Dto.*;


public interface UserManagementRepository {

	void saveProfileFollowedDetails(ProfileFollowedDetails profileFollowedDetails);
	
	UserDTO getByUserName(String UserName);
}
