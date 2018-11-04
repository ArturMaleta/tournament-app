package mal.art.demotournamentapp.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="teams")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "team")
    private String team;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public League() {

    }
}
