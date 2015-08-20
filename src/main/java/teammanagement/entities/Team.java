package teammanagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Team {

    @Id @GeneratedValue
    private Long teamId;

    private String teamName;
    private String location;

    @OneToMany(mappedBy = "currentTeam")
    private List<Player> members;


    public Team(String teamName, String location) {
        this.teamName = teamName;
        this.location = location;
    }

}
