package mx.edu.utez.hospital.repository;

import mx.edu.utez.hospital.model.Preescripcion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreescripcionRespository extends MongoRepository<Preescripcion, Integer> {
}
