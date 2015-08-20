package teammanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import teammanagement.entities.Team;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
public interface TeamRepository extends CrudRepository<Team,Long> {



}
