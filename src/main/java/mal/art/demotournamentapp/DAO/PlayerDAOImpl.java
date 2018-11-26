package mal.art.demotournamentapp.DAO;

import mal.art.demotournamentapp.Entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDAOImpl implements PlayerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Player> getTeams() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query theQuery = currentSession.createQuery("select team from Player ", Player.class);
        // round-robin algorithm should be implemented here

        // chosenTeams = new ArrayList();
        // algorithm...

        // save scheduled matches to db
        // match nr 1
        // match nr 2 etc.

        return theQuery.getResultList(); // return scheduledLeague;
    }

    @Override
    public List<Player> getPlayers() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query theQuery = currentSession.createQuery("SELECT name, team FROM Player", Player.class);

        return theQuery.getResultList();
    }

    @Override
    public void savePlayer(Player thePlayer) {

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.save(thePlayer);
    }
}
