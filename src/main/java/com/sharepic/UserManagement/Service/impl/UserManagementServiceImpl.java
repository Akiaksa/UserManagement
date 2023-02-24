package com.sharepic.UserManagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sharepic.UserManagement.model.ProfileFollowedDetails;
import com.sharepic.UserManagement.Service.UserManagementService;
import com.sharepic.UserManagement.repository.UserManagementRepository;
import com.sharepic.UserManagement.mapper.*;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserManagementRepository userManagementRepository;
	
	@Autowired
	private ProfileFollowedDetailsMapper mapper;
	
	@Override
	public void followUser(ProfileFollowedDetails profileFollowedDetails) {
		// TODO Auto-generated method stub
		try {
			userManagementRepository.saveProfileFollowedDetails(mapper.profileFollowedModelToEntity(profileFollowedDetails));
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
