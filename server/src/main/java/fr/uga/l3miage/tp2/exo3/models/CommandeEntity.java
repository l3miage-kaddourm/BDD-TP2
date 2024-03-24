package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class CommandeEntity {
    @Id
    private Long id;
    private Date date;
    private double montantTotal;

    @ManyToOne
    private ClientEntity clientEntity;

    @OneToMany(mappedBy = "commande")
    private Set<ProduitEntity> produitEntities;
}