package mal.art.demotournamentapp.DAO;

import mal.art.demotournamentapp.Entity.Player;

import java.util.List;

public interface PlayerDAO {

    List<Player> getTeams();

    List<Player> getPlayers();

    void savePlayer(Player thePlayer);
}
