package br.com.uniamerica.estacionamento.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalTime;

@NoArgsConstructor
@Audited
@Entity
@AuditTable(value = "configuracoes_audit",schema = "audit")
@Table(name = "tb_configuracoes",schema = "public")
public class Configuracao extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "valor_hora")
    private BigDecimal valorHora;
    @Getter
    @Setter
    @Column(name = "valor_minuto_multa")
    private BigDecimal valorMinutoMulta;
    @Getter
    @Column(name = "inicio_expediente")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalTime inicioExpediente;
    @Getter
    @Column(name = "fim_expediente")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalTime fimExpediente;
    @Getter@Setter
    @Column(name = "tempo_para_desconto")
    private Long tempoParaDesconto;
    @Getter@Setter
    @Column(name = "tempo_de_desconto")
    private Long tempoDeDesconto;

    @Getter@Setter
    @Column(name = "gerar_desconto")
    private boolean gerarDesconto;

    @Getter
    @Setter
    @Column(name = "vagas_moto")
    private Integer vagasMoto;

    @Getter
    @Setter
    @Column(name = "vagas_carro")
    private Integer vagasCarro;

    @Getter
    @Setter
    @Column(name = "vagas_van")
    private Integer vagasVan;

}