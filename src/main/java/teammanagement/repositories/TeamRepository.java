package teammanagement.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import teammanagement.entities.Team;

/**
 * Created by fleak on 8/20/15.
 * @author Lewis A. Fleak
 */
@Repository
public interface TeamRepository extends PagingAndSortingRepository<Team,Long> {


}
