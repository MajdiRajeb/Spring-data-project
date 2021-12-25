package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enig.model.Magasin;

public interface IgestionMagasin extends JpaRepository<Magasin, Integer> {
	

}
