package com.emanuel.usuario.infrastructure.repository;

import com.emanuel.usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
