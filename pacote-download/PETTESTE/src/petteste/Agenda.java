package petteste;
class Agenda {
    
    // ATRIBUTOS
    
    private String data;
    private String funcionario;
    private String pet;
    private String servico;
    private String hora;
    
    public Agenda (String data, String funcionario, String pet, String servico, String hora){
       this.data = data;
       this.funcionario = funcionario;
       this.pet = pet;
       this.servico = servico;
       this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }


    public String getPet() {
        return pet;
    }


    public void setPet(String pet) {
        this.pet = pet;
    }


    public String getServico() {
        return servico;
    }


    public void setServico(String servico) {
        this.servico = servico;
    }
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
     @Override
    public String toString() {
        return "Agenda{" + " data: " + data + ", hora: " + hora +   ", funcionario: " + funcionario  + ", serviço: " + servico +  ", pet: " + pet + '}';
    }
}
