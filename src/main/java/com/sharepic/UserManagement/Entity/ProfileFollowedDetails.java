package com.sharepic.UserManagement.Entity;

import javax.persistence.*;

import java.util.Date;



@Entity
@Table(name = "profile_followed_details")
public class ProfileFollowedDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" , nullable = false)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "followed_user")
	private User followedUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followed_by")
	//@MapsId("id")
	private User followedBy;
	
	@Column(name= "followed_on" , nullable = false)
	private  Date followedOn;
	
	

	public ProfileFollowedDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfileFollowedDetails(Integer id, User followedUser, User followedBy, Date followedOn) {
		super();
		this.id = id;
		this.followedUser = followedUser;
		this.followedBy = followedBy;
		this.followedOn = followedOn;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getFollowedUser() {
		return followedUser;
	}

	public void setFollowedUser(User followedUser) {
		this.followedUser = followedUser;
	}

	public User getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(User followedBy) {
		this.followedBy = followedBy;
	}

	public Date getFollowedOn() {
		return followedOn;
	}

	public void setFollowedOn(Date followedOn) {
		this.followedOn = followedOn;
	}
	
		
}
