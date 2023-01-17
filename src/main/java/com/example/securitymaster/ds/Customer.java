package com.example.securitymaster.ds;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Code cant be blank!")
    @Size(min=2,max = 5, message = "code must be between 2 and 5!")
    @Pattern(regexp = "[A-Za-z]*",message = "code cant contain illegal characters!")
    private String code;
    @NotBlank(message = "firstName cant be empty!")
    @Pattern(regexp = "[A-Za-z-]*",message = "firstName cant contain illegal characters!")
    private String firstName;
    @NotBlank(message = "lastName cant be empty!")
    @Pattern(regexp = "[A-Za-z-]*",message = "lastName cant contain illegal characters!")
    private String lastName;
    @NotBlank(message = "address cant be empty!")
    @Pattern(regexp = "[\\w .\\-/,]*",message = "address cant contain illegal characters!")
    private String address;

    public Customer(){

    }

    public Customer(String code, String firstName, String lastName, String address) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
