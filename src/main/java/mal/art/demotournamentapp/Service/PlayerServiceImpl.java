package mal.art.demotournamentapp.Service;

import mal.art.demotournamentapp.DAO.PlayerDAO;
import mal.art.demotournamentapp.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    @Override
    @Transactional
    public List<Player> getPlayers() {
        return playerDAO.getPlayers();
    }

    @Override
    @Transactional
    public void savePlayer(Player thePlayer) {
        playerDAO.savePlayer(thePlayer);
    }

    @Override
    public List<Player> getTeams() {
        return playerDAO.getTeams();
    }
}
