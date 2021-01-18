/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sil;

/**
 *
 * @author Mehmet NARMAN
 */
public class User {
    int id;
    String name;
    String mail;
    String password;

    public User() {
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.mail = email;
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.mail = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.mail = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + mail + ", password=" + password + '}';
    }
}
