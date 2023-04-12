import React from 'react'
import {Container, Row, Col} from 'react-bootstrap'

export const Preescripcion = () => {
  return (
    <>
      <Container className='px-3 mt-3'>
      <h2 className='text-start fw-lighter' style={{ color: "#002e60" }}>Preescripciones registradas</h2>
      <br />
      <div className="">
        <Row className="m-0">
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            ID
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Fecha de preescripción
          </Col>
          <Col className='col-lg-3 fw-semibold text-primary text-opacity-80'>
            Duración de tratamiento
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Indicaciones
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Paciente
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Médico
          </Col>
        </Row>
        <hr />
        <Row className="m-0">
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            1
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            01/01/2021
          </Col>
          <Col className='col-lg-3 fw-light text-body text-opacity-80'>
            1 mes
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            Tomar 2 pastillas cada 8 horas
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            Juan Jose Hernandez Perez
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            Juan Perez Hernandez
          </Col>
        </Row>
        <hr />
        
      </div>
    </Container>
    </>
  )
}

export default Preescripcion