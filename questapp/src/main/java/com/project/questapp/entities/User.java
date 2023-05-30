package com.project.questapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data // lombok annotation for auto generate getter and setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String userName;
    String password;

}
