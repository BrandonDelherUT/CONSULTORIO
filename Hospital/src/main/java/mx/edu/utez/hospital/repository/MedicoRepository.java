package mx.edu.utez.hospital.repository;

import mx.edu.utez.hospital.model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, Integer> {
}
