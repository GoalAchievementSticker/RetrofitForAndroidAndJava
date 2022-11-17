package com.example.user.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id; //_id로 지정
    private String nickname;
    private String email;
    private String password;
    private Date created_at;
    @Transient
    private Date updated_at;

    public String getPassword() {
        return password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String toString(){
        return String.format("User[nickname:%s, userid:%s, password:%s]");
    }
}
