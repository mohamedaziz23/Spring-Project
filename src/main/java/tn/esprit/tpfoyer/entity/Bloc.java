package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idBloc;
     String nomBloc;
     Long capaciteBloc;
    @ManyToOne
    Foyer foyer;

    @OneToMany (cascade = CascadeType.ALL,mappedBy ="bloc")
    Set<Chambre> chambres;

}
