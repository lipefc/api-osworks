package br.com.iblue.apiosworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblue.apiosworks.entity.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{

}
