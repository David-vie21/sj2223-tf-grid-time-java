package at.spengergasse.gridtime.gridtime.service;

import at.spengergasse.gridtime.gridtime.Domain.Worker;

public record WorkerDTO(String name) {

    public static WorkerDTO fromEntity(Worker worker) {
        return new WorkerDTO(worker.getName());
    }

    public Worker toEntity() {
        return new Worker(this.name());
    }
}
