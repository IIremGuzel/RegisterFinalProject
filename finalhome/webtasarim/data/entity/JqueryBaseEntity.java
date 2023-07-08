package com.iremguzel.registerdemo.finalhome.webtasarim.data.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor

//audit
@EntityListeners(AuditingEntityListener.class)

//Json bunları parse etmesin => created_date,update_date
@JsonIgnoreProperties(value = {"created_date,update_date"},allowGetters = true)

//Super Class
@MappedSuperclass // BaseEntity olduğunu ifade ediyor

abstract public class JqueryBaseEntity {
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    //Tarihi otomatik sisteme ekleme
    @Column(name = "system_created_date",updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date systemCreatedDate;
}
