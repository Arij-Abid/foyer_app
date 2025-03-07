package tn.esprit.tpfoyer17.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    long idEtudiant;

    String nomEtudiant;

    String prenomEtudiant;

    long cinEtudiant;

    Date dateNaissance;

    @ToString.Exclude
    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    private Set<Reservation> reservations;

}