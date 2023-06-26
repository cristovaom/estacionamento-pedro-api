package br.com.uniamerica.estacionamento.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Audited
@Entity
@AuditTable(value = "movimentacao_audit",schema = "audit")
@Table(name = "tb_movimentacoes",schema = "public")
public class Movimentacao extends AbstractEntity {
    @Getter
    @Setter
    @NotNull(message = "Veiculo Não pode ser nulo!")
    @ManyToOne
    @JoinColumn(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "condutor_id", nullable = false)
    private Condutor condutor;

    @Getter
    @Setter
    @Column(name = "entrada", nullable = false)
    private LocalDateTime entrada;

    @Getter
    @Setter
    @Column(name = "saida")
    private LocalDateTime saida;

    @Getter
    @Setter
    @Column(name = "tempo_horas")
    private Long tempoHoras;

    @Getter
    @Setter
    @Column(name = "tempo_minutos")
    private Long tempoMinutos;

    @Getter
    @Setter
    @Column(name = "tempo_desconto")
    private Long tempoDesconto;

    @Getter
    @Setter
    @Column(name = "tempo_multa")
    private Long tempoMulta;

    @Getter
    @Setter
    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;

    @Getter
    @Setter
    @Column(name = "valor_multa")
    private BigDecimal valorMulta;


    @Getter
    @Setter
    @Column(name = "valor_total")
    private BigDecimal valorTotal;


    @Getter
    @Setter
    @Column(name = "valor_hora")
    private BigDecimal valorHora;


    @Getter
    @Setter
    @Column(name = "valor_hora_multa")
    private BigDecimal valorHoraMulta;
}
