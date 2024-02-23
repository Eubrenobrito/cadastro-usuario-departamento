package com.breno.usuarioDepartamento.entities;

public class Usuario {

    private Long id;
    private String name;
    private String email;

    /** associação entre as duas entidades (departamento e usuário): **/
//  terá um quarto atributo, na qual o tipo dele será a outra entidade: departamento
    private Departamento departamento;

    /**construtor**/
    public Usuario(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
