package org.senac.aula01.vo;

public class QuantidadeCarrosMarca {

    private String marca;

    private Long quantidade;

    private Double mediaAnoFabricacao;

    public QuantidadeCarrosMarca(String marca, Long quantidade, Double mediaAnoFabricacao) {
        this.marca = marca;
        this.quantidade = quantidade;
        this.mediaAnoFabricacao = mediaAnoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getMediaAnoFabricacao() {
        return mediaAnoFabricacao;
    }

    public void setMediaAnoFabricacao(Double mediaAnoFabricacao) {
        this.mediaAnoFabricacao = mediaAnoFabricacao;
    }
}
