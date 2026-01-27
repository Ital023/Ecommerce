package io.github.Ital023.EcommerceItalo.repository;

import io.github.Ital023.EcommerceItalo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
