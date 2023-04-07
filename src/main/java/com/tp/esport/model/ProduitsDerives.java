package com.tp.esport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
@Data
@Table(name= "PRODUITS_DERIVES")
public class ProduitsDerives {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUIT")
    private int id;

    @Column(name = "CODE_PRODUIT")
    private String codeProduit;

    @Column(name = "NOM_PRODUIT")
    private String nomProduit;



}
