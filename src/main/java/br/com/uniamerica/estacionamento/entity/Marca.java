package br.com.uniamerica.estacionamento.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Audited
@Entity
@AuditTable(value = "marcas_audit",schema = "audit")
@Table(name = "tb_marcas",schema = "public")
public class Marca extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "nome",nullable = false,length = 50,unique = true)
    private String nome;

    @OneToMany
    private List<Modelo> modeloList = new ArrayList<>();


}
