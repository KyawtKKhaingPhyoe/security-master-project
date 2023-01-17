package com.example.securitymaster.security.annotation.employees;


import static com.example.securitymaster.security.SecurityRoles.*;
import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Secured(ROLES_PREFIX+EMPLOYEES_ADMIN)
public @interface EmployeesAdmin {
}
