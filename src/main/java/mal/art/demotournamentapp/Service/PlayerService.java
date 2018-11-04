package mal.art.demotournamentapp.Service;


import mal.art.demotournamentapp.Entity.Player;

import java.util.List;

public interface PlayerService {

    public List<Player> getPlayers();

    public void savePlayer(Player thePlayer);

    public List<Player> getTeams();
}
