import React, { Component } from 'react';
import axios from 'axios';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';

class Medicina extends Component {
  constructor(props) {
    super(props);
    this.state = {
      medicinas: []
    };
  }

  componentDidMount() {
    axios.get('http://localhost:8080/medicina/get')
      .then(res => {
        this.setState({ medicinas: res.data.data });
      })
      .catch(error => {
        console.log(error);
      });
  }

  render() {
    const { medicinas } = this.state;
    return (
      <div className="card">
        <DataTable value={medicinas} className="p-datatable-gridlines">
          <Column field="id" header="Id" />
          <Column field="nombre" header="Nombre" />
          <Column field="presentacion" header="Presentación" />
          <Column field="cantidad" header="Cantidad" />
        </DataTable>
      </div>
    );
  }
}

export default Medicina;

