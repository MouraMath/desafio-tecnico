package com.example.demo.Domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pessoa {
	private Integer id;
	private String nome;
	private String cidade;
	private String email;
	private String cep;
	private String endereco;
	private String pais;
	private String usuario;
	private String telefone;
	private String dataNascimento;
	private String cargoId;
}
