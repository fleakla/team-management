package teammanagement.controllers;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import teammanagement.entities.Team;
import teammanagement.services.teams.TeamService;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/team")
    public String index(Model model) {
        model.addAttribute("teams", teamService.findAll());
        return "team/index";
    }

    @RequestMapping(value = "/team/add", method = RequestMethod.POST)
    public String addTeam(Model model, @RequestParam String name, @RequestParam String city, @RequestParam String sport) {

        teamService.add(Lists.newArrayList(new Team(name, city, sport)));

        model.addAttribute("teams", teamService.findAll());
        return "team/index";
    }

}
