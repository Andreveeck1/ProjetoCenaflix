/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Lenovo
 */
public class CadastroFilme {
    private int id;
    private String nome;
    private String dataLancamento;
    private String categoria;

    public CadastroFilme(String nome, String dataLancamento, String categoria) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    public CadastroFilme(int id, String nome, String dataLancamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    public CadastroFilme(int id) {
        this.id = id;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "CadastroFilme{" + "id=" + id + ", nome=" + nome + ", dataLancamento=" + dataLancamento + ", categoria=" + categoria + '}';
    }
 
    
    
    
}
