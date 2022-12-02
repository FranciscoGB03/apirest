package com.pgonbo.apirest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgonbo.apirest.entities.UsuarioEntity;
import com.pgonbo.apirest.models.UsuarioRequestModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    Optional<UsuarioRequestModel> findOneByEmail(String email);

}
