package br.com.uniamerica.estacionamento.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

@NoArgsConstructor
@Entity
@Audited
@AuditTable(value = "veiculo_audited",schema = "audit")
@Table(name = "tb_veiculos",schema = "public")
public class Veiculo extends AbstractEntity{

    @Getter
    @Setter
    @Column(name = "placa",length = 10,nullable = false,unique = true)
    private String placa;
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "modelo_id",nullable = false)
    private Modelo modelo;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "cor_id",nullable = false)
    private Cor cor;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_id",nullable = false)
    private Tipo tipo;

    @Getter
    @Setter
    @Column(name = "ano",nullable = false,length = 5)
    private int ano;
}
