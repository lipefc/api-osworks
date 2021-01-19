package br.com.iblue.apiosworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tblclient")
@SequenceGenerator(name = "seq_client", sequenceName = "seq_client", initialValue = 1, allocationSize = 1)
public class Client {

	@Id
	@GeneratedValue(generator = "seq_client")
	@Column(name = "id")
	@JsonProperty("id")
	private Long idt;

	@Column(name = "name")
	@JsonProperty("name")
	private String name;

	@Column(name = "email")
	@JsonProperty("email")
	private String email;

	@Column(name = "telefone")
	@JsonProperty("telefone")
	private String telefone;
	
	public Client() {
		super();
	}

	public Client(Long idt, String name, String email, String telefone) {
		super();
		this.idt = idt;
		this.name = name;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Client [idt=" + idt + ", name=" + name + ", email=" + email + ", telefone=" + telefone + "]";
	}

	public Long getIdt() {
		return idt;
	}

	public void setIdt(Long idt) {
		this.idt = idt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}