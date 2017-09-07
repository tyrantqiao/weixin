package com.qiao.weixin.data;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

/**
 * @author qiao
 * email tyrantqiao@icloud.com
 * 2017/8/26 13:11
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min=2,max=16,message = "size 2~16")
    private String username;

    @NotNull
    @Size(min=2,max=16,message = "size 2~16")
    private String password;

    @Email(message = "email format please")
    private String email;

    @Override
    public String toString() {
        return String.format("User[id:%d, name:%s, email:%s]",id,username,email);
    }

    public User(){}

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(long id, String userName, String password, String email) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
