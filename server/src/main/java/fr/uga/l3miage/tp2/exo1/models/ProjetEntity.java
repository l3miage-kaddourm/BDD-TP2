package fr.uga.l3miage.tp2.exo1.models;

import lombok.Cleanup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigInteger;
import java.util.Set;

@Entity
public class ProjetEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany
    private Set<DeveloperEntity> developerEntities;
}
