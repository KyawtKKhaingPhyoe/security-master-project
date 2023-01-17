package com.example.securitymaster.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "firstName cant be empty!")
    @Pattern(regexp = "[A-Za-z-]*",message = "firstName cant contain illegal characters!")
    private String firstName;
    @NotBlank(message = "lastName cant be empty!")
    @Pattern(regexp = "[A-Za-z-]*",message = "lastName cant contain illegal characters!")
    private String lastName;
    @NotBlank(message = "phoneNumber cant be empty!")
    @Pattern(regexp = "[0-9\\-+]*",message = "phoneNumber cant contain illegal characters!")
    private String phoneNumber;
    @NotBlank(message = "address cant be empty!")
    @Pattern(regexp = "[\\w .\\-/,]*",message = "address cant contain illegal characters!")
    private String address;
    @NotBlank(message = "cubiclNo cant be empty!")
    @Pattern(regexp = "[A-Za-z0-9\\-]*",message = "cubicleNo cant contain illegal characters!")
    private String cubicleNo;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String phoneNumber, String address, String cubicleNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cubicleNo = cubicleNo;
    }
}
