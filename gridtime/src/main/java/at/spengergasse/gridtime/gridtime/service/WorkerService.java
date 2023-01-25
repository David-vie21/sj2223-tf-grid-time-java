package at.spengergasse.gridtime.gridtime.service;

import at.spengergasse.gridtime.gridtime.Repository.WorkerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class WorkerService {
    private final WorkerRepository workerRepository;
    public List<WorkerDTO> findAll()
    {
        return StreamSupport.stream(workerRepository.findAll().spliterator(), false)
                .map(entity -> WorkerDTO.fromEntity(entity))
                .toList();
    }

    public Optional<WorkerDTO> create(WorkerDTO workerDTO) {
        return Optional.ofNullable(workerDTO)
                .map(dto -> dto.toEntity())
                .map(entity -> workerRepository.save(entity))
                .map(entity -> WorkerDTO.fromEntity(entity));
    }

}
