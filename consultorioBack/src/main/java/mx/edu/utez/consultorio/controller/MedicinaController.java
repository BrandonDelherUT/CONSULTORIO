package mx.edu.utez.consultorio.controller;

import mx.edu.utez.consultorio.model.Medicina;
import mx.edu.utez.consultorio.service.MedicinaService;
import mx.edu.utez.consultorio.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medicina")
public class MedicinaController {
    @Autowired
    private MedicinaService service;

    @GetMapping("/get") // http://localhost:8080/medicina/get
    public ResponseEntity<CustomResponse<List<Medicina>>> getAll(){
        System.out.println("entro una peticion GET ALL Medicina");
        return new ResponseEntity<>(
                this.service.getAll(), HttpStatus.OK
        );

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CustomResponse<Medicina>> getOne(@PathVariable int id){
        System.out.println("entro una peticion GET ONE Medicina");
        return new ResponseEntity<>(
                this.service.getOne(id), HttpStatus.OK
        );
    }

    @PostMapping("/post") // http://localhost:8080/medicina/post
    public ResponseEntity<CustomResponse<Medicina>> insert(@Valid @RequestBody Medicina medicina) {
        System.out.println("entro una peticion INSERT Medicina");
        return new ResponseEntity<>(this.service.insert(medicina), HttpStatus.CREATED);
        //JSON:
        // {
        //     "nombre": "Paracetamol",
        //     "descripcion": "Para el dolor de cabeza",
        //     "precio": 20.00,
        //     "cantidad": 10
        // }
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<CustomResponse<Medicina>> update(@PathVariable int id, @Valid @RequestBody Medicina medicina){
        System.out.println("entro una peticion PUT Medicina");
        return new ResponseEntity<>(
                this.service.update(id, medicina), HttpStatus.OK
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CustomResponse<Void>> delete(@PathVariable int id){
        System.out.println("entro una peticion DELETE Medicina");
        this.service.delete(id);
        return new ResponseEntity<>(new CustomResponse<>(null, false, 200, "La medicina ha sido eliminada correctamente"), HttpStatus.OK);
    }


}
