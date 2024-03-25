package com.bookhub.BookHub.service;

import com.bookhub.BookHub.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public void signupOrUpdate(User user);
    public void login(String emailId,String password);
    public void delete(long id);
   public User  findUserById(long id);
   public List<User> findAllUsers();




}
