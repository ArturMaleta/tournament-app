package mal.art.demotournamentapp.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy="country")
    private List<League> leagues;
}
