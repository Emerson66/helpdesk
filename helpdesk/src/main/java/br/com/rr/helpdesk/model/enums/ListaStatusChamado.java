package br.com.rr.helpdesk.model.enums;

public enum ListaStatusChamado {

    ANDAMENTO(1, "ANDAMENTO"),
    ATRASADO(2,"ATRASADO"),
    CANCELADO(3,"CANCELADO"),
    CONCLUIDO(4,"CONCLUIDO"),
    PARALIZADO(5,"PARALIZADO");

    private int cod;
    private String descricao;

    public int getCod() {
        return cod;
    }

    ListaStatusChamado(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public static ListaStatusChamado toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }
        for(ListaStatusChamado x : ListaStatusChamado.values()) {
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Código invalido: " + cod);
    }
}
