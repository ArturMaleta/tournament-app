package mal.art.demotournamentapp.Service;

import mal.art.demotournamentapp.DAO.LeagueDAO;
import mal.art.demotournamentapp.Entity.League;
import mal.art.demotournamentapp.Service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LeagueServiceImpl implements LeagueService {

    @Autowired
    private LeagueDAO leagueDAO;

    @Override
    @Transactional
    public List<League> getTeam() {
        return leagueDAO.getTeam();
    }
}
