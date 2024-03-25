package com.bookhub.BookHub.service;

import com.bookhub.BookHub.entity.User;
import com.bookhub.BookHub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImp implements  UserService{
@Autowired
  private UserRepository userRepository;

    @Override
    public void signupOrUpdate(User user) {
      userRepository.save(user);
    }

    @Override
    public void login(String emailId,String password) {
            User user=userRepository.findByEmailId(emailId);
           if(user==null)
           {
               System.out.println("user not found");
               return;
           }

         if(user.getPassword().equals(password))
         {
             System.out.println("login successfully");
         }
         else {
             System.out.println("either email or password is wrong");
         }

    }

    @Override
    public void delete(long id) {
         userRepository.deleteById(id);
    }

    @Override
    public User findUserById(long id) {

        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {

        return userRepository.findAll();
    }
}
