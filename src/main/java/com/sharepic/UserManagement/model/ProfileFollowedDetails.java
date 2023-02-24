package com.sharepic.UserManagement.model;

import java.util.ArrayList;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.sharepic.UserManagement.Entity.User;


@JsonFormat
public class ProfileFollowedDetails {
	
	@JsonProperty
	private Integer id;
	
	@JsonProperty("followedUser")
	private User followedUser;
	
	@JsonProperty("followedBy")
	private User followedBy;

	public ProfileFollowedDetails id(Integer id)
	{
		this.id=id;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public ProfileFollowedDetails followedUser(User followedUser)
	{
		this.followedUser=followedUser;
		return this;
	}
	
	public ProfileFollowedDetails followedBy(User followedBy)
	{
		this.followedBy=followedBy;
		return this;
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

	@Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (o == null || getClass() != o.getClass()) {
	            return false;
	        }
	        ProfileFollowedDetails profileFollowedDetails = (ProfileFollowedDetails) o;
	        return Objects.equals(this.id, profileFollowedDetails.id) &&
	        		Objects.equals(this.followedUser, profileFollowedDetails.followedUser) &&
	                Objects.equals(this.followedBy, profileFollowedDetails.followedBy) ;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, followedUser,followedBy);
	    }
	    
	    
	    
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("class ProfileFollowedDetails {\n");

	        sb.append("    id: ").append(toIndentedString(id)).append("\n");
	        sb.append("    followedUser: ").append(toIndentedString(followedUser)).append("\n");
	        sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
	        sb.append("}");
	        return sb.toString();
	    }

	    /**
	     * Convert the given object to string with each line indented by 4 spaces
	     * (except the first line).
	     */
	    private String toIndentedString(Object o) {
	        if (o == null) {
	            return "null";
	        }
	        return o.toString().replace("\n", "\n    ");
	    }
	 
}
