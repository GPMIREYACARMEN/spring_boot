package com.edu.spring_angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.spring_angular.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
