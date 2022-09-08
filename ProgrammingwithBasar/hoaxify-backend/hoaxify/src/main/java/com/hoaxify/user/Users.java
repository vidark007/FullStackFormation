package com.hoaxify.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue()
    private long id;
    private String username;
    private String displayName;
    private String password;

}

