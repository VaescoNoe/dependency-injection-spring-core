package com.vargas.noe.di.atributos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {

	private String marca;
	private Integer modelo;
	private Motor motor;

	public Coche() {

	}

	/* Inyección de dependencias por medio del constructor
	 * @Autowired public Coche(@Value("VW") String marca, @Value("1981") Integer
	 * modelo, Motor motor) { this.marca = marca; this.modelo = modelo; this.motor =
	 * motor; }
	 */

	public String getMarca() {
		return marca;
	}

	@Value("VW")
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	@Value("1981")
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}

}
