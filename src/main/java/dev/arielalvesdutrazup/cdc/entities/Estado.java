package dev.arielalvesdutrazup.cdc.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "{nome.notempty}")
    private String nome;
    private String codigo;
    private OffsetDateTime cadastradoEm = OffsetDateTime.now();
    @NotNull(message = "{pais.notnull}")
    @ManyToOne
    private Pais pais;

    public Long getId() {
        return id;
    }

    public Estado setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Estado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public Estado setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public OffsetDateTime getCadastradoEm() {
        return cadastradoEm;
    }

    public Estado setCadastradoEm(OffsetDateTime cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
        return this;
    }

    public Pais getPais() {
        return pais;
    }

    public Estado setPais(Pais pais) {
        this.pais = pais;
        return this;
    }
}
