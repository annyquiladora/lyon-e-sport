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
@Table(name= "UTILISATEURS")
public class Utilisateurs {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "USER_UUID")
    private int userUuid;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOT_DE_PASSE")
    private String motDePasse;

    @Column(name = "ADRESSE_ID")
    private int adresseId;

    @Column(name = "FACTURATION_ID")
    private int facturationId;

}
