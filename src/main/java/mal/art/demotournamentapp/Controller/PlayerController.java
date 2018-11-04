//package mal.art.demotournamentapp.Controller;
//
//import mal.art.demotournamentapp.Entity.Country;
//import mal.art.demotournamentapp.Entity.League;
//import mal.art.demotournamentapp.Entity.Player;
//import mal.art.demotournamentapp.Service.CountryService;
//import mal.art.demotournamentapp.Service.LeagueService;
//import mal.art.demotournamentapp.Service.PlayerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class PlayerController {
//
//    // sprawdź ModelAndView API
//
//    @Autowired
//    private PlayerService playerService;
//
//    @Autowired
//    private CountryService countryService;
//
//    @Autowired
//    private LeagueService leagueService;
//
//    @ResponseBody
//    @GetMapping("begin")
//    public String welcome() {
//        return "Hello Spring Boot";
//    }
//
//    @GetMapping("/summary-players")
//    public String listPlayers(Model theModel) {
//
//        List<Player> thePlayers = playerService.getPlayers();
//
//        theModel.addAttribute("players", thePlayers);
//
//        return "summary-players";
//    }
//
//    @GetMapping("/add-players")
//    public String chooseCountry(Model theModel) {
//
//        List<Country> theCountry = countryService.getLeague();
//        theModel.addAttribute("country", theCountry);
//
//        List<League> theTeam = leagueService.getTeam();
//        theModel.addAttribute("team", theTeam);
//
//        Player thePlayer = new Player();
//        theModel.addAttribute("player", thePlayer);
//
//        return "add-players";
//    }
//
//    @PostMapping("/savePlayer")
//    public String savePlayer(/*@Valid*/ @ModelAttribute("player") Player thePlayer, BindingResult result) {
//
///*		if(result.hasErrors()) {
//			System.out.println("Name can't be blank");
//			return "add-players";
//		}*/
//
//        playerService.savePlayer(thePlayer);
//
//        return "redirect:/player/add-players";
//    }
//
//
//    // schedule and print scheduled teams
//    @GetMapping("/schedule")
//    public String listChoosedTeams(Model theModel) {
//
//        List<Player> chosenTeams = playerService.getTeams();
//
//        theModel.addAttribute("chosenTeams", chosenTeams);
//
//        return "schedule";
//    }
//}
