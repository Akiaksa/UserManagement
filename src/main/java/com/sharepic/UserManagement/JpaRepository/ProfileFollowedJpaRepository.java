package com.sharepic.UserManagement.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharepic.UserManagement.Entity.ProfileFollowedDetails;

@Repository
public interface ProfileFollowedJpaRepository extends JpaRepository<ProfileFollowedDetails, Integer> {

}
