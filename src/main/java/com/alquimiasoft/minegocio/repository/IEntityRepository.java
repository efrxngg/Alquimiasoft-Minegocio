package com.alquimiasoft.minegocio.repository;

import com.alquimiasoft.minegocio.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEntityRepository extends JpaRepository<ClientEntity, UUID> {
}
