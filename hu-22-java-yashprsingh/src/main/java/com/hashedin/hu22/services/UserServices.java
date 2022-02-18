package com.hashedin.hu22.services;


import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

  @Autowired
  private UserRepository userrepo;

    public User getUserbyId(int id) {
         for(User user:userrepo.findAll())
	        {
	      	  if(user.getId() == id)
	    			{	
	    					return user;
	    			}
	      	  
	        }
			
			return null;
    }


    public void addUser(User userObj) {
        userrepo.save(userObj);
    }

    public void updateUser(int id, String firstName, String bio, String lastName, String userType, String experience, String domainExpertise, String role){

    for(User e: userrepo.findAll()) {
			if(e.getId()==id) {
        if(firstName!=null){
				e.setFirstName(firstName);
        }
        if(lastName!=null){
        e.setLastName(lastName);
        }
        if(bio!=null){
        e.setBio(bio);
        }
        if(userType!=null){
        e.setUserType(userType);}
        if(experience!=null)
        e.setExperience(experience);
        if(domainExpertise!=null)
				e.setDomainExpertise(domainExpertise);
        userrepo.save(e);
				break;
			}
		}

    }

    public List<User> getAllUser() {
          return userrepo.findAll();
    }
}