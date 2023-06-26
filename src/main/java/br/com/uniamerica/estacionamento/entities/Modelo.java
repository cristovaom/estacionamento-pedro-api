package br.com.uniamerica.estacionamento.entities;

import jakarta.persistence.*;
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
@AuditTable(value = "modelo_audit",schema = "audit")
@Table(name = "tb_modelos",schema = "public")
public class Modelo extends AbstractEntity {
    @Getter
    @Setter
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;


    @OneToMany(mappedBy = "modelo")
    private List<Veiculo> veiculoList = new ArrayList<>();
}