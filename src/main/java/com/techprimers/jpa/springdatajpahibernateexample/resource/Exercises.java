package com.techprimers.jpa.springdatajpahibernateexample.resource;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class Exercises {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;
    private  Integer leccion;
    private String enunciado;
    private String opc1;
    private String opc2;
    private String respuesta;

    public Exercises(Integer leccion, String enunciado, String opc1, String opc2, String respuesta) {
        this.leccion = leccion;
        this.enunciado = enunciado;
        this.opc1 = opc1;
        this.opc2 = opc2;
        this.respuesta = respuesta;
    }

    public Exercises() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeccion() {
        return leccion;
    }
    public void setLeccion(Integer lesson) {
        this.leccion = lesson;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getOpc1() {
        return opc1;
    }

    public void setOpc1(String opc1) {
        this.opc1 = opc1;
    }

    public String getOpc2() {
        return opc2;
    }

    public void setOpc2(String opc2) {
        this.opc2 = opc2;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Exercises [" +
                "id=" + id +
                ", leccion=" + leccion +
                ", enunciado='" + enunciado + '\'' +
                ", opc1='" + opc1 + '\'' +
                ", opc2='" + opc2 + '\'' +
                ", respuesta='" + respuesta + '\'' +
                ']';
    }
}
