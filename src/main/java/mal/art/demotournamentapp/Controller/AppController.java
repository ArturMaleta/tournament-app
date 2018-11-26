package mal.art.demotournamentapp.Controller;

import mal.art.demotournamentapp.Entity.Country;
import mal.art.demotournamentapp.Entity.Player;
import mal.art.demotournamentapp.Service.CountryService;
import mal.art.demotournamentapp.Service.LeagueService;
import mal.art.demotournamentapp.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private LeagueService leagueService;

    @ResponseBody
    @GetMapping("summary-players")
    public String getSummaryOfPlayers(Model theModel) {

        List<Player> thePlayers = playerService.getPlayers();

        theModel.addAttribute("players", thePlayers);

        return "summary-players.html";
    }
}
