package br.edu.ifpb.teste.testeservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifpb.teste.testeservice.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
}
