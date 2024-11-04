package com.upiiz.ormN.repositories;

import com.upiiz.ormN.models.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    //Generar consultas mas pesonalizadas
}