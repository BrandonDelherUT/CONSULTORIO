package mx.edu.utez.consultorio.controller;

import mx.edu.utez.consultorio.model.Paciente;
import mx.edu.utez.consultorio.service.PacienteService;
import mx.edu.utez.consultorio.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping("/get")
    public ResponseEntity<CustomResponse<List<Paciente>>> getAll(){
        System.out.println("GET ALL Paciente.");
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CustomResponse<Paciente>> getOne(@PathVariable int id){
        System.out.println("GET ONE Paciente");
        return new ResponseEntity<>(
                this.service.getOne(id),
                HttpStatus.OK
        );
    }

    @PostMapping("/post")
    public ResponseEntity<CustomResponse<Paciente>> insert(@Valid @RequestBody Paciente paciente){
        System.out.println("INSERT Paciente");
        return new ResponseEntity<>(
                this.service.insert(paciente),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<CustomResponse<Paciente>> update(@PathVariable int id, @Valid @RequestBody Paciente paciente){
        System.out.println("PUT Paciente");
        return new ResponseEntity<>(
                this.service.update(id, paciente),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CustomResponse<String>> delete(@PathVariable int id){
        System.out.println("DELETE Paciente");
        return new ResponseEntity<>(
                this.service.delete(id),
                HttpStatus.OK
        );
    }


}
