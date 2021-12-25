package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.enig.dao.IgestionMagasin;
import tn.enig.dao.IgestionProduit;

import tn.enig.model.Magasin;
import tn.enig.model.Produit;

@Controller
public class MagasinController {
@Autowired
	private IgestionMagasin dao1;
@Autowired
private IgestionProduit dao2;
public void setDao1(IgestionMagasin dao1) {
	this.dao1 = dao1;
}
public void setDao2(IgestionProduit dao2) {
	this.dao2 = dao2;
}
@GetMapping("/Products")
public String getAllProducts(Model m){
	  List<Produit> listep=dao2.findAll();
	  m.addAttribute("listep", listep);
	  return "listeProduitsMagasin";
}
@GetMapping("/home")
public String getOneProducts(Model m,int id){
	  Produit product =dao2.getOne(id);
	  m.addAttribute("produit", product);
	  return "listeProduitsMagasin";
}
@GetMapping("/Magasins")
public String getAllMagasins(Model m){
	  List<Magasin> listem=dao1.findAll();
	  m.addAttribute("listem", listem);
	  return "home";
}
@GetMapping("/home")
public String getOneMagasin(Model m,int id){
	 Magasin magasin =dao1.getOne(id);
	  m.addAttribute("magasin", magasin);
	  return "listeProduitsMagasin";
	  
}
@PostMapping("/addProduit")
public void add(@RequestBody Produit pdt) {
	dao2.save(pdt);

}





}
