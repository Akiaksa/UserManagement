package com.sharepic.UserManagement.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.sharepic.UserManagement.Dto.UserDTO;
import com.sharepic.UserManagement.Entity.ProfileFollowedDetails;
import com.sharepic.UserManagement.JpaRepository.ProfileFollowedJpaRepository;
import com.sharepic.UserManagement.repository.UserManagementRepository;

@Repository
public class UserManagementRepositoryimpl implements UserManagementRepository {
	
	@Autowired
	private ProfileFollowedJpaRepository jpaRepository;

	@Override
	public void saveProfileFollowedDetails(ProfileFollowedDetails profileFollowedDetails) {
		// TODO Auto-generated method stub
		
		try {
			
			jpaRepository.save(profileFollowedDetails);
		}
		catch(DataAccessException e)
		{
			System.out.println("Hello from " + "saveProfileFollowedDetails");
		}
		
		

	}

	@Override
	public UserDTO getByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

}
