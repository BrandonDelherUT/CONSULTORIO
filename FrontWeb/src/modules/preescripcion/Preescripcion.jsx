import React, { Component } from 'react';
import axios from 'axios';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';

class Preescripcion extends Component {
  constructor(props) {
    super(props);
    this.state = {
      preescripciones: []
    };
  }

  componentDidMount() {
    axios.get('http://localhost:8080/preescripcion/get')
      .then(res => {
        this.setState({ preescripciones: res.data.data });
      })
      .catch(error => {
        console.log(error);
      });
  }

  render() {
    const { preescripciones } = this.state;
    return (
      <div className="card">
        <DataTable value={preescripciones} className="p-datatable-gridlines">
          <Column field="id" header="Id" />
          <Column field="fechaPrescripcion" header="Fecha" />
          <Column field="duracionTratamiento" header="Duración" />
          <Column field="indicaciones" header="Indicaciones" />
          <Column field="paciente.nombre" header="Paciente" />
          <Column field="medico.nombre" header="Médico" />
        </DataTable>
      </div>
    );
  }
}

export default Preescripcion;