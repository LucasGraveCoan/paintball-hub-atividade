package com.senai.paintball_hub;

import com.senai.paintball_hub.entity.Jogador;
import com.senai.paintball_hub.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaintballHubApplication implements CommandLineRunner {

	@Autowired
	private JogadorRepository jogadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaintballHubApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Jogador jogador = new Jogador();
		jogador.setNome("abobrinha");
		jogador.setIdade(67);
		jogadorRepository.save(jogador); 
	}
}
