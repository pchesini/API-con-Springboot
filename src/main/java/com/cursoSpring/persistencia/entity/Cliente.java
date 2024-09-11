package com.cursoSpring.persistencia.entity;

import jakarta.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String celular;
    private String direccion;
    @Column(name="correo_electronico")
    private String  email;


}
