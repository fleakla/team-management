package teammanagement.services.teams;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import teammanagement.entities.Team;
import teammanagement.repositories.TeamRepository;

import java.util.List;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public List<Team> findAll() {
        return Lists.newArrayList(teamRepository.findAll(new Sort(Sort.Direction.ASC, "teamName", "location", "sport")));
    }

    public List<Team> add(List<Team> teamList) {
        return Lists.newArrayList(teamRepository.save(teamList));
    }

    public void removeTeam(Long teamId) {
        teamRepository.delete(teamId);
    }
}
