package teammanagement.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Player {

    @Id @GeneratedValue
    private Long playerId;

    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    private String position;

    @ManyToOne
    private Team currentTeam;

    public Player(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
