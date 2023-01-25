package at.spengergasse.gridtime.gridtime.Repository;

import at.spengergasse.gridtime.gridtime.Domain.Worker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WorkerRepositoryTest {
    @Autowired
    private WorkerRepository workerRepository;

    @Test
    void verifySimpleCreateamdRead()
    {
        Worker worker = new Worker("David");
        assertThat(worker.getId()).isNull();

        Worker result = workerRepository.save(worker);
        assertThat(result).isNotNull();
        assertThat(result.getId()).isNotNull();

        Optional<Worker> reread = workerRepository.findById(result.getId());
        assertThat(reread).isNotNull();
    }
}