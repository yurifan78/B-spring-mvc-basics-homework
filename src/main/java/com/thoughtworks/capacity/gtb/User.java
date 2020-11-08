package com.thoughtworks.capacity.gtb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
    }

    public Integer getId() {
        return id;
    }
}
