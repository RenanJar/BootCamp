package Modelo;

public class Categoria {
    Integer id;
    String nome;

    public Categoria(Integer id,String nome) {
        this.nome = nome;
        this.id=id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }






}
