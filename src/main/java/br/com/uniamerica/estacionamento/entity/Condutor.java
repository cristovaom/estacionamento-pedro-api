package br.com.uniamerica.estacionamento.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@NoArgsConstructor
@Audited
@Entity
@AuditTable(value = "condutores_audit",schema = "audit")
@Table(name = "tb_condutores",schema = "public")
public class Condutor extends AbstractEntity{

    @Getter
    @Setter
    @Column(name = "nome",nullable = false,length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(name = "cpf",nullable = false,length = 20,unique = true)
    private String cpf;

    @Getter
    @Setter
    @Column(name = "telefone",nullable = false,length = 20)
    private String telefone;

    @Getter
    @Setter
    @Column(name = "tempo_pago")
    private Long tempoPago = 0L;

    @Getter
    @Setter
    @Column(name = "tempo_desconto")
    private Long tempoDesconto;
}
