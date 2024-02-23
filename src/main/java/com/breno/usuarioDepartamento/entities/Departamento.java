package com.breno.usuarioDepartamento.entities;
//import é jakarta porque a oracle deixou de dar suporte, e a jakarta é da openJDK
import jakarta.persistence.*;

//pra eu falar que essa classe vai ser mapeada para uma tabela do banco de dados, anotacion: @entity e o @Table para
// dizer como vai ser o nome dela no banco
@Entity
@Table(name = "tb_departamento")
public class Departamento {

//    o id vai ser a chave do banco e auto incrementado pelo banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    construtor: para dizer que a minha classe pode ser instanciada sem passar nenhum argumento
    public void Departamento() {
    }

//    metodos de acessos:

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
}
