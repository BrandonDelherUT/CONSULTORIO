package mx.edu.utez.hospital.repository;

import mx.edu.utez.hospital.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Integer> {
}
