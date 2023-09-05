package com.example.demo.Repository;

import java.io.Serializable;

public class Salario implements Serializable {
	private String nomePessoa;
	private String cargo;
	private double valorSalario;

	// Construtores, getters e setters aqui

	// Exemplo de getters e setters:
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
}