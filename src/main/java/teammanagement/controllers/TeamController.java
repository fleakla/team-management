package teammanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
