package teammanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import teammanagement.entities.Player;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {



}
