package com.iremguzel.registerdemo.finalhome.webtasarim.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
@Entity

@Table(name = "jquery")
public class JqueryEntity extends JqueryBaseEntity implements Serializable
{
    public static final Long serialVersionUID = 1L;

    // NAME
    @Column(name = "firstname")
    private String firstname;


    // PASSWORD
    @Column(name = "password")
    private String password;


    // EMAİL

    @Column(
            name = "email", // database deki ismi
            nullable = true, // boş geçilemez
            //unique = true, // bunun yerine kendi Annotation yazdım
            length = 100,
            insertable = true,
            updatable = true,
            columnDefinition = "varchar(255) default 'email yazmadiniz'")
    private String email;

}
