import React from 'react'
import {Container, Row, Col} from 'react-bootstrap'

export const Paciente = () => {
  return (
    <>
      <Container className='px-3 mt-3'>
      <h2 className='text-start fw-lighter' style={{ color: "#002e60" }}>Pacientes registrados</h2>
      <br />
      <div className="">
        <Row className="m-0">
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            ID
          </Col>
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            Nombre
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Apellidos
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            No. de seguro
          </Col>
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            Sexo
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Altura en metros
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Peso en kilogramos
          </Col>
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            Edad
          </Col>
        </Row>
        <hr />
        <Row className="m-0">
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            1
          </Col>
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            Juan Jose
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            Hernandez Perez
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            123456789
          </Col>
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            Masculino
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            1.70
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            50
          </Col>
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            70
          </Col>
        </Row>
        <hr />
        
      </div>
    </Container>
    </>
  )
}

export default Paciente