package com.webpage.eee;

import org.hibernate.validator.Email;
import org.hibernate.validator.Pattern;
import org.hibernate.validator.Size;


//User class
public class User {

    //User whose page active now
    public static String currentUser;

    //User full name
    @Size(min=3, max=20,
            message="Fullname must be between 3 and 20 characters long.")
    private String fullName;

    //User nikname
    @Size(min=3, max=20,
            message="Username must be between 3 and 20 characters long.")
    @Pattern(regex="^[a-zA-Z0-9]+$",
            message="Username must be alphanumeric with no spaces")
    private String nikName;

    //User age
    @Size(min=1, max=3, message = "Age must be between 1 and 3 characters long")
    @Pattern(regex = "^[0-9]", message = "Age must be a number with no spaces")
    private String age;

    //User email
    @Email(message="Invalid email address.")
    private String email;

    //User password
    @Size(min=6, max=20,
            message="The password must be at least 6 characters long.")
    private String password;

    //FullName setter
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    //FullName getter
    public String getFullName(){
        return fullName;
    }

    //NikName setter
    public void setNikName(String nikName){
        this.nikName = nikName;
    }

    //NikName getter
    public String getNikName(){
        return nikName;
    }

    //Age setter
    public void setAge(String age){
        this.age = age;
    }

    //Age getter
    public String getAge(){
        return age;
    }

    //Email setter
    public void setEmail(String email){
        this.email = email;
    }

    //Email getter
    public String getEmail(){
        return email;
    }

    //Password setter
    public void setPassword(String password){
        this.password = password;
    }

    //Password getter
    public String getPassword(){
        return password;
    }

}
