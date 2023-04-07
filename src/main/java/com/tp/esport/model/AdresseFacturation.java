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
@Table(name= "ADRESSE_FACTURATION")
public class AdresseFacturation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FACTURATION_ID")
    private int facturationId;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "VILLE")
    private String ville;

    @Column(name = "PAYS")
    private String pays;





}
