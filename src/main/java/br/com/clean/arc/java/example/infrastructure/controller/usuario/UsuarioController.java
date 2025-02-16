package br.com.clean.arc.java.example.infrastructure.controller.usuario;

import br.com.clean.arc.java.example.application.usecase.usuario.CriarUsuario;
import br.com.clean.arc.java.example.application.usecase.usuario.ListarUsuario;
import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;
    private final ListarUsuario listarUsuarios;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuario listarUsuarios) {
        this.criarUsuario = criarUsuario;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    public UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO dto) {
        Usuario usrDomain = new Usuario.Builder(dto.cpf())
                .nome(dto.nome())
                .nascimento(dto.nascimento())
                .email(dto.email())
                .build();

        Usuario salvo = criarUsuario.cadastrarUsuario(usrDomain);

        return new UsuarioDTO(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());

    }

    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return listarUsuarios.obterTodosUsuario().stream()
                .map(u -> new UsuarioDTO(u.getCpf(), u.getNome(), u.getNascimento(), u.getEmail()))
                .collect(Collectors.toList());
    }
}
