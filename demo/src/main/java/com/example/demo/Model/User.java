package com.example.demo.Model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user1")
public class User {
    @Id
    String username;
    @NotNull
    String password;
}
