package at.spengergasse.gridtime.gridtime.Repository;
import at.spengergasse.gridtime.gridtime.Domain.*;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Long> {
}
