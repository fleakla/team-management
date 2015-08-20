package teammanagement.dataloaders;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teammanagement.entities.Team;
import teammanagement.repositories.TeamRepository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Service
public class InMemoryDataLoader {

    private TeamRepository teamRepository;

    @Autowired
    public InMemoryDataLoader(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @PostConstruct
    private void loadData() {
        List<Team> teamList = Lists.newArrayList();

        teamList.add(new Team("Blues", "Saint Louis", "NHL Hockey"));
        teamList.add(new Team("Coyotes", "Phoenix", "NHL Hockey"));
        teamList.add(new Team("Jets", "Winnipeg"));

        teamList.add(new Team("Cardinals", "Saint Louis", "MLB National League"));
        teamList.add(new Team("Cheifs", "Kansas City", "NFL"));
        teamList.add(new Team("Manchester United", "Manchester", "English Premier League"));

        teamRepository.save(teamList);
    }
}
