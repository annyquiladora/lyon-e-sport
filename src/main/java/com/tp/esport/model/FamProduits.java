package com.tp.esport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "FAM_PRODUITS")
public class FamProduits {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FP_UUID")
    private int familleId;

    @Column(name = "FAMILLE_PRODUIT")
    private String familleProduit;

    @Column(name = "QTE_VENDUE")
    private int qteVendue;

    @Column(name = "MONTANT_VENTES")
    private int qteVentes;

    @Column(name = "CODE_FP")
    private int codeFp;
}
