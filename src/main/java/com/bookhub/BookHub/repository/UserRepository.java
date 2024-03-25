package com.bookhub.BookHub.repository;

import com.bookhub.BookHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{


    User findByEmailId(String emailId);
}
