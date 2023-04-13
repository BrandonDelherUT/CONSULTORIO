package mx.edu.utez.hospital.repository;

import mx.edu.utez.hospital.model.Consultorio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends MongoRepository<Consultorio, Integer> {
}
