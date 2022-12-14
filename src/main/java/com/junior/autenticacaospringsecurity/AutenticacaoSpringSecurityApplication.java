package com.junior.autenticacaospringsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junior.autenticacaospringsecurity.model.ContaBanco;
import com.junior.autenticacaospringsecurity.model.Usuario;
import com.junior.autenticacaospringsecurity.service.BancoService;
import com.junior.autenticacaospringsecurity.service.UsuarioService;

@SpringBootApplication
public class AutenticacaoSpringSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutenticacaoSpringSecurityApplication.class, args);
	}

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BancoService bancoService;

	@Override
	public void run(String... args) throws Exception {

		ContaBanco contaBanco = new ContaBanco();
		Usuario usuario = new Usuario("2222", "Júnior César", "123456", contaBanco);
		
		bancoService.salvarContaBanco(contaBanco);
		usuarioService.salvarUsuario(usuario);

	}

}
