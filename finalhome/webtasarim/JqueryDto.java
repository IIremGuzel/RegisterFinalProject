package com.iremguzel.registerdemo.finalhome.webtasarim;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
//DTO ==> validation
public class JqueryDto implements Serializable {


    //serileştirme
    public static final long serialVersionUID = 1L;


    // ID
    private Long id;


    //FİRST NAME
    @NotEmpty(message = "{customer.firstname.validation.constraints.NotNull.message}")
    private String firstname;


    //EMAİL
    @NotEmpty(message = "{customer.email.validation.constraints.NotNull.message}")
    @Email(message = "{customer.email.validation.regex.constraints.NotNull.message}")
    // @CustomerUniqueEmail
    private String email;

    //PASSWORD

    @NotEmpty(message = "{customer.password.validation.constraints.NotNull.message}")
    @Size(min = 5, max = 15, message = "{customer.password.pattern.validation.constraints.NotNull.message}")
    private String password;


    // DATE
    private Data createdDate;
}



