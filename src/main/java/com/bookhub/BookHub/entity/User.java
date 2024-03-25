package com.bookhub.BookHub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user")
public class User {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private  long  id;
      @Column(name="first_name")
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private String state;
    private String city;
    private String pincode;
    private String phoneNo;
    private String password;
    private int memberId;
    private String dob;
    private String emailId;


}

