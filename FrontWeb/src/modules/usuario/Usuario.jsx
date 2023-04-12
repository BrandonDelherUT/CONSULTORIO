import React from 'react'
import { Container, Row, Col } from 'react-bootstrap'

export const Usuario = () => {
    return (
        <>
            <Container className='px-3 mt-3'>
                <h2 className='text-start fw-lighter' style={{ color: "#002e60" }}>Usuarios registrados</h2>
                <br />
                <div className="">
                    <Row className="m-0">
                        <Col className='col-lg-1 fw-semibold text-primary text-opacity-80'>
                            ID
                        </Col>
                        <Col className='col-lg-4 fw-semibold text-primary text-opacity-80'>
                            Nombre
                        </Col>
                        <Col className='col-lg-5 fw-semibold text-primary text-opacity-80'>
                            Password
                        </Col>
                        <Col className='col-lg-2 fw-semibold text-primary text-opacity-80'>
                            Role
                        </Col>
                    </Row>
                    <hr />
                    <Row className="m-0">
                        <Col className='col-lg-1 fw-light text-body text-opacity-80'>
                            1
                        </Col>
                        <Col className='col-lg-4 fw-light text-body text-opacity-80'>
                            AnaVD
                        </Col>
                        <Col className='col-lg-5 fw-light text-body text-opacity-80'>
                            123456
                        </Col>
                        <Col className='col-lg-2 fw-light text-body text-opacity-80'>
                            Admin
                        </Col>
                    </Row>
                    <hr />
                    <Row className="m-0">
                        <Col className='col-lg-1 fw-light text-body text-opacity-80'>
                            1
                        </Col>
                        <Col className='col-lg-4 fw-light text-body text-opacity-80'>
                            Paracetamol
                        </Col>
                        <Col className='col-lg-5 fw-light text-body text-opacity-80'>
                            En caja
                        </Col>
                        <Col className='col-lg-2 fw-light text-body text-opacity-80'>
                            200
                        </Col>
                    </Row>
                </div>
            </Container>
        </>
    )
}

export default Usuario