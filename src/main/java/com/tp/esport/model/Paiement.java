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
@Table(name= "PAIEMENT")
public class Paiement {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PAIEMENT_ID")
    private int paiementId;

    @Column(name = "PAYPAL")
    private Boolean paypal;

    @Column(name = "CARTE_BANCAIRE")
    private Boolean carteBancaire;


}
