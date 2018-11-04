package mal.art.demotournamentapp.Service;

import mal.art.demotournamentapp.DAO.CountryDAO;
import mal.art.demotournamentapp.Entity.Country;
import mal.art.demotournamentapp.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Override
    @Transactional
    public List<Country> getLeague() {
        return countryDAO.getLeague();
    }
}
