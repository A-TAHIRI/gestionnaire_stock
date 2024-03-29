package com.abdel.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @CreatedDate
    @Column(name ="createDate",nullable = false)
    @JsonIgnore
    private Instant createDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate")
    @JsonIgnore
    private Instant lastModifiedDate;
}
