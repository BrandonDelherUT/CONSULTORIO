import React from 'react'
import {Container, Row, Col} from 'react-bootstrap'

export const Medico = () => {
  return (
    <>
    <Container className='px-3 mt-3'>
      <h2 className='text-start fw-lighter' style={{ color: "#002e60" }}>Medicos registrados</h2>
      <br />
      <div className="">
        <Row className="m-0">
          <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
            ID
          </Col>
          <Col className='col-lg-4 fw-semibold text-primary text-opacity-80'>
            Nombre
          </Col>
          <Col className='col-lg-4 fw-semibold text-primary text-opacity-80'>
            Apellidos
          </Col>
          <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
            Sexo
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
          <Col className='col-lg-4 fw-light text-body text-opacity-80'>
            Ana Belen
          </Col>
          <Col className='col-lg-4 fw-light text-body text-opacity-80'>
            Perez Perez
          </Col>
          <Col className='col-lg-2 fw-light text-body text-opacity-80'>
            Femenino
          </Col>
          <Col className='col-lg-1 fw-light text-body text-opacity-80'>
            30
          </Col>
        </Row>
        <hr />
        
      </div>
    </Container>
  </>
  )
}

export default Medico