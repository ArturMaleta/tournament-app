package mal.art.demotournamentapp.DAO;

import mal.art.demotournamentapp.Entity.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDAOImpl implements CountryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Country> getLeague() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Country> theQuery = currentSession.createQuery("SELECT country FROM Country ", Country.class);

        List<Country> country = theQuery.getResultList();

        return country;
    }

}
