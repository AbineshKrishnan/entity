package com.base.services.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("users")
@Getter
@Setter
public class Users {

    @Id
    private UUID id;

    private String userName;
}
