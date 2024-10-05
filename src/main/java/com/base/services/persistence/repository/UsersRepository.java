package com.base.services.persistence.repository;

import com.base.services.persistence.entity.Users;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsersRepository extends R2dbcRepository<UUID, Users> {
}
