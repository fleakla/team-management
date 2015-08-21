package teammanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import teammanagement.dataloaders.InMemoryDataLoader;

/**
 * Created by fleak on 8/21/15.
 * @author Lewis A. Fleak
 */
@Controller
public class DataLoaderController {

    @Autowired
    private InMemoryDataLoader dataLoaderService;

    @RequestMapping(value = "/team/reloaddata")
    public String reloadDefaultData() {

        dataLoaderService.dropAllData();
        dataLoaderService.loadDefaultData();

        return "redirect:/team/";
    }

    @RequestMapping(value = "/team/dropcurrentdata")
    public String dropCurrentData() {
        dataLoaderService.dropAllData();
        return "redirect:/team/";
    }
}
