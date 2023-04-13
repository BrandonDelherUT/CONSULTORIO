package mx.edu.utez.hospital.controller;

import mx.edu.utez.hospital.model.Consultorio;
import mx.edu.utez.hospital.service.ConsultorioService;
import mx.edu.utez.hospital.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/consultorio")
public class ConsultorioController {
    @Autowired
    private ConsultorioService service;

    @GetMapping("/get")
    public ResponseEntity<CustomResponse<List<Consultorio>>> getAll(){
        System.out.println("GET ALL Consultorio");
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CustomResponse<Consultorio>> getOne(@PathVariable int id){
        System.out.println("GET ONE Usuario");
        return new ResponseEntity<>(
                this.service.getOne(id),
                HttpStatus.OK
        );
    }

    @PostMapping("/post")
    public ResponseEntity<CustomResponse<Consultorio>> insert(@Valid @RequestBody Consultorio consultorio){
        System.out.println("INSERT Consultorio");
        return new ResponseEntity<>(
                this.service.insert(consultorio),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<CustomResponse<Consultorio>> update(@PathVariable int id, @Valid @RequestBody Consultorio consultorio){
        System.out.println("PUT Consultorio");
        return new ResponseEntity<>(
                this.service.update(id, consultorio),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CustomResponse<String>> delete(@PathVariable int id){
        System.out.println("DELETE Consultorio");
        return new ResponseEntity<>(
                this.service.delete(id),
                HttpStatus.OK
        );
    }
}
