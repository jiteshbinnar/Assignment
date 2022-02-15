package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = -801744874979508803L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private Long userID;
	    private String userName;
	    @OneToOne(cascade = CascadeType.ALL)
	    private Address address;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getUserID() {
			return userID;
		}
		public void setUserID(Long userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, userID, userName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(address, other.address) && Objects.equals(userID, other.userID)
					&& Objects.equals(userName, other.userName);
		}
		@Override
		public String toString() {
			return "User [userID=" + userID + ", userName=" + userName + ", address=" + address + "]";
		}

}
