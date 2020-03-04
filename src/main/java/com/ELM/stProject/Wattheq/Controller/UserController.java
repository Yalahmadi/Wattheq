package com.ELM.stProject.Wattheq.Controller;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/SignUp")
    public String viewPg(){
        return "SignUp";
    }

    @PostMapping(value = "/AddInd")
    public User addInd(@RequestBody User user) {
      // user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.addInd(user);

    }

    @GetMapping(value = "/GetAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/GetUser/{userID}")
    public User getUser(@PathVariable("userID") int userID) {
        return userService.getUser(userID);
    }

    @PutMapping(value = "/UpdateUser/{userID}")
    public User updateUser(@RequestBody User user, @PathVariable("userID") int userID) {
        return userService.updateUser(user, userID);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

    @DeleteMapping(value = "/DeleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
    }





