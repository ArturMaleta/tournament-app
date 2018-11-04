package mal.art.demotournamentapp.Controller;

import mal.art.demotournamentapp.Service.CountryService;
import mal.art.demotournamentapp.Service.LeagueService;
import mal.art.demotournamentapp.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String begin() {
        return "How is this even possible?!";
    }
}
