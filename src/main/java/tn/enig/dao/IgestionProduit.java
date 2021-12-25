package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import tn.enig.model.Produit;

public interface IgestionProduit extends JpaRepository<Produit, Integer> {

}
