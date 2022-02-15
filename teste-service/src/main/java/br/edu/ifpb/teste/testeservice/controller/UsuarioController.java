package br.edu.ifpb.teste.testeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.teste.testeservice.entity.Usuario;
import br.edu.ifpb.teste.testeservice.repository.UsuarioRepository;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("")
    public @ResponseBody Iterable<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
        usuario = usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
    }
}
