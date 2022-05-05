package petteste;
class Funcionario {

    //ATRIBUTOS
    
    private String nomefun;
    private String cpffun;
    private String email;
    private String telefone;
    
    
    
    // CONSTRUTOR
    
    
   public Funcionario(String nomefun, String cpffun, String email, String telefone) {
        
       this.nomefun = nomefun;
       this.cpffun = cpffun;
       this.email = email;
       this.telefone = telefone;
       
}

// GETERS E SETERS
   
    public String getNomefun() {
        return nomefun;
    }

    public void setNomefun(String nomefun) {
        this.nomefun = nomefun;
    }

    public String getCpffun() {
        return cpffun;
    }

    public void setCpffun(String cpffum) {
        this.cpffun = cpffum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Cadastro{" + " Nome: " + nomefun + ", CPF: " + cpffun + ", Email: " + email  + ", Telefone: " + telefone + '}';
    }
    
}
