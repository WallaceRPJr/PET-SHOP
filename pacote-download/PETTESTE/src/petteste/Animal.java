package petteste;

class Animal {
    //Atributos
    private String especie;
    private String raca;
    private String nomeAnimal;
    
    
     public Animal(String especie, String raca, String nomeAnimal) {
        this.especie = especie;
        this.raca = raca;
        this.nomeAnimal = nomeAnimal;
    }
    
     
     public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    } 
    
    
    @Override
    public String toString() {
        return "Animal{" + " Especie: " + especie + ", Raca: " + raca + ", Nome do pet: " + nomeAnimal  + '}';
    }
}
