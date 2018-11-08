package mal.art.demotournamentapp.Service;

import mal.art.demotournamentapp.Entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getPlayers();

    void savePlayer(Player thePlayer);

    List<Player> getTeams();
}
