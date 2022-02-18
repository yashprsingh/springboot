package com.hashedin.hu22.controllers;

import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component

@RestController
public class UserController {
    @Autowired
    UserServices userservice;

    //Add User
    @GetMapping("userSignup")
    public String usersignup(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String bio,@RequestParam String userType,@RequestParam String experience,@RequestParam String domainExpertise,@RequestParam String role){
        User user=userservice.getUserbyId(id);
        if(user==null){
            User userObj = new User(id, firstName,  bio, lastName, userType, experience,domainExpertise, role);
            userservice.addUser(userObj);
            return "User registered! " + userObj.toString();
        }
        return "User Already Exsits";
    }

    //Update User
	@PostMapping("updateUserRecord")
	public String updateUserRecord(@RequestParam(value = "id", required =true) int id,@RequestParam(value = "firstName", required =false)String firstName,@RequestParam(value = "bio", required =false) String bio,@RequestParam(value = "lastName", required =false) String lastName,@RequestParam(value = "userType", required =false) String userType,@RequestParam(value = "experience", required =false)String experience, @RequestParam(value = "domainExpertise", required =false)String domainExpertise,@RequestParam(value = "role", required =false) String role) {

		User userObj = userservice.getUserbyId(id);

		if(userObj==null) {
			return "Employee with id = " + id + " Does not Exsits in employee records";
		}
		userservice.updateUser(id,firstName,bio,lastName,userType,experience,domainExpertise,role);
		return "Employee record updated! + " + userObj.toString();
	}

    @GetMapping("getAllUsers")
    public List<User> viewAllUsers()
    {
            return this.userservice.getAllUser();
    }

}
