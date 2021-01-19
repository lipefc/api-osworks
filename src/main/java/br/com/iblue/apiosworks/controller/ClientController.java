package br.com.iblue.apiosworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.iblue.apiosworks.entity.Client;
import br.com.iblue.apiosworks.repository.IClientRepository;

@ResponseBody
@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private IClientRepository dao;
	
	@GetMapping("/list")
	public ResponseEntity<List<Client>> findAll() {
		return ResponseEntity.status(200).body(dao.findAll());
	}
}