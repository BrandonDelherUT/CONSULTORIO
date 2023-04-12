package mx.edu.utez.consultorio.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "preescripciones")
public class Preescripcion {
    @MongoId
    private int id;
    private String fechaPrescripcion;

    private String duracionTratamiento;

    private String indicaciones;

    private Paciente paciente;

    private Medico medico;

    public Preescripcion(int id, String fechaPrescripcion, String duracionTratamiento, String indicaciones, Paciente paciente, Medico medico) {
        this.id = id;
        this.fechaPrescripcion = fechaPrescripcion;
        this.duracionTratamiento = duracionTratamiento;
        this.indicaciones = indicaciones;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaPrescripcion() {
        return fechaPrescripcion;
    }

    public void setFechaPrescripcion(String fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(String duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
