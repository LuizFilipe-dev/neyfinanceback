package com.example.demo.Service;

import com.example.demo.Entity.Usuario.DadosUsuario;
import com.example.demo.Entity.Usuario.Usuario;
import com.example.demo.Entity.Usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario cadastrar(DadosUsuario dadosUsuario){
        Usuario usuario = new Usuario(dadosUsuario);
        return usuarioRepository.save(usuario);
    }
}
