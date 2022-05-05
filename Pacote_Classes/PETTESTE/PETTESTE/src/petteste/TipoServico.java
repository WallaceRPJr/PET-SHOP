package petteste;

class TipoServico {
    
    //ATRIBUTOS
    
    private String nomeSer;
    private String valor;
    
    
    public TipoServico(String nomeSer, String valor){
    this.nomeSer = nomeSer;
    this.valor = valor;
}
    public String getNomeSer() {
        return nomeSer;
    }

    public void setNomeSer(String nomeSer) {
        this.nomeSer = nomeSer;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Serviço{" + "Nome: " + nomeSer + ", Valor: " + valor + '}';
    }
    
    
}
