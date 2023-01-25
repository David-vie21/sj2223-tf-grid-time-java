package at.spengergasse.gridtime.gridtime.presentation;

import at.spengergasse.gridtime.gridtime.service.WorkerDTO;
import at.spengergasse.gridtime.gridtime.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/workers")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class WorkerController {

    private final WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAll()
    {
        return ResponseEntity.ok(workerService.findAll());
    }

    @PostMapping
    public ResponseEntity<WorkerDTO> create(@RequestBody WorkerDTO workerDTO)
    {
        return ResponseEntity.of(workerService.create(workerDTO));
    }

}
