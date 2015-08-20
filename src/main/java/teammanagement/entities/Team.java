package teammanagement.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Team {

    @Id @GeneratedValue
    private Long teamId;

    private String teamName;
    private String location;
    private String sport;

    @OneToMany(mappedBy = "currentTeam")
    private List<Player> members;


    public Team(String teamName, String location) {
        this(teamName, location, "");
    }

    public Team(String teamName, String location, String sport) {
        this.teamName = teamName;
        this.location = location;
        this.sport = sport;
    }
}
