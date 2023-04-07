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
@Table(name= "ADRESSES")
public class Adresse {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ADRESSE_ID")
    private int adresseId;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "CODE_POSTAL")
    private int codePostal;

    @Column(name = "VILLE")
    private String ville;

    @Column(name = "PAYS")
    private String pays;

}
