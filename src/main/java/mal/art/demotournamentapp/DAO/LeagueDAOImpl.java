package mal.art.demotournamentapp.DAO;

import mal.art.demotournamentapp.Entity.League;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LeagueDAOImpl implements LeagueDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<League> getTeam() {

        Session currentSession = sessionFactory.getCurrentSession();

        /*Query<League> theQuery = currentSession.createQuery("FROM League i JOIN FETCH i.country WHERE country_id = 2", League.class);*/
        Query<League> theQuery = currentSession.createQuery("FROM League", League.class);

        List<League> team = theQuery.getResultList();

        return team;
        }
    }