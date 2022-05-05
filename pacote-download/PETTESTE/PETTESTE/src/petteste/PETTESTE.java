package petteste;
import java.util.Scanner;
public class PETTESTE {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); //Classe Scanner para ler apenas numeros
       Scanner stri = new Scanner(System.in); //Classe Scanner para ler apenas Strings
       
       Animal a [] = new Animal [100];// VETOR PARA ANIMAIS
       Funcionario f [] = new Funcionario[100];// VETOR PARA FUNCIONARIOS
       TipoServico t [] = new TipoServico[100];// VETOR PARA SERVIÇOS
       Agenda ag[] = new Agenda[100]; // VETOR PARA A AGENDA
       
       int indiceFuncionario = 0; // VARIAVEL PARA CONTROLAR AS POSIÇÕES DO VETOR FUNCIONARIO
       int indiceAnimal = 0; //VARIAVEL PARA CONTROLAR AS POSIÇÕES DO VETOR ANIMAL
       int indiceTipoServico = 0; // VARIAVEL PARA CONTROLAR AS POSIÇÕES DO VETOR TIPOSERVICO
       int indiceAgenda = 0; // VARIAVEL PARA CONTROLAR AS POSIÇÕES
       
       boolean sair = true; // REPETIR LOOP PRINCIPAL
       boolean sair2 = true; // REPETIR LOOP ANIMAL
       boolean sair3 = true; // REPETIR LOOP FUNCIONARIO
       boolean sair4 = true; // REPETIR LOOP SERVIÇO
       
       int opc; // VARIAVEL PARA CONTROLAR SWITCH PRINCIPAL
       int opc1; // VARIAVEL PARA CONTROLAR CASE ANIMAL
       int opc2; // VARIAVEL PARA CONTROLAR CASE FUNCIONARIO        
       int opc3; // VARIAVEL PARA CONTROLAR CASE SERVIÇO 
       
       int aux = -1; // VARIAVEL PARA AUXILIAR NA BUSCA
       
       
       
       
       
       
       
       do {
            System.out.println("===============");
        System.out.println("DIGITE UM NUMERO");
        System.out.println("1 - Animal");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Serviços");
        System.out.println("4 - Sair");
        System.out.println("===============");
        opc = in.nextInt();
        
            if (opc >= 5) {
                opc = 5;
                
            }
        
    switch (opc){
        
        case 1: // CASE ANIMAL
            
        do{    
            System.out.println("===============");
            System.out.println("SELECIONE UMA OPÇÃO");
            System.out.println("1 - Cadastrar um animal");
            System.out.println("2 - Pesquisar por um animal");
            System.out.println("3 - Editar dados do animal");
            System.out.println("4 - Voltar");
            System.out.println("===============");
            opc1 = in.nextInt();
            
            if (opc1 >= 5) {
                opc1 = 5;
            }
            
            switch(opc1){
                
                case 1: //CASE CADASTRAR UM ANIMAL
                    System.out.println("===CADASTRO DE ANIMAIS===");
                    System.out.println("Espécie do pet: ");
                    String especie = in.next();
                    System.out.println("Raça do pet: ");
                    String raca = stri.next();
                    System.out.println("Nome do pet: ");
                    String nome = stri.next();
                    
                    a[indiceAnimal] = new Animal(especie , raca, nome);
                    
                    System.out.println("===============");
                    System.out.println( "A indentificação desse animal é " + indiceAnimal);
                    System.out.println( "E seu dados " + a[indiceAnimal]);
                    indiceAnimal++;
                    System.out.println("===============");
                    
                break;   
                case 2: //CASE PESQUISAR UM ANIMAL    
                    
                        aux = -1;
                        System.out.println("===PESQUISA===");
                        System.out.println("Digite o nome do pet: ");
                        String nomep = stri.next();//Nome a ser procurado dentro do vetor a[]
                        for (int i = 0; i < a.length; i++) {//Bloco para achar o animal desejado
                            if (a[i]!= null) {
                                if (a[i].getNomeAnimal().equalsIgnoreCase(nomep)) {//Testa se existe algum nome compatível com um que exista no vetor a[]
                                    aux = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }//if
                        System.out.println("====Pet pesquisado====");//Mostra todas as informações do pet
                        System.out.println("Especie: "+ a[aux].getEspecie());
                        System.out.println("Raça: "+ a[aux].getRaca());
                        System.out.println("Nome do animal: "+ a[aux].getNomeAnimal());
                        System.out.println("A Identificação: "+ aux );
                        System.out.println("===============");
                
                break;        
                case 3: // EDITAR DADOS DO ANIMAL
                        aux = -1;
                        System.out.println("=== EDIÇÃO ===");
                        System.out.println("Digite o nome do pet: ");
                        String nomepes = stri.next();//Nome a ser procurado dentro do vetor a[]
                        for (int i = 0; i < a.length; i++) {//Bloco para achar o animal desejado
                            if (a[i]!= null) {
                                if (a[i].getNomeAnimal().equalsIgnoreCase(nomepes)) {//Testa se existe algum nome compatível com um que exista no vetor a[]
                                    aux = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                            break;
                        }//if
                        System.out.println("==== Pet pesquisado ====");//Mostra todas as informações do pet
                        
                        
                        boolean teste = true;
                        do{
                        
                        System.out.println("QUAL DADO VOCÊ QUER EDITAR?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - Raça");
                        System.out.println("3 - Espécie");
                        System.out.println("===============");
                        
                        int p = in.nextInt();
                        
                        if (p > 3) {
                        p = 4;
                                    }
                        
                            switch(p){  // SWITCH PARA EDITAR ANIMAL
                                
                                case 1: // EDITAR NOME ANIMAL 
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o nome correto");
                                    String nomen = stri.next();
                                    a[aux].setNomeAnimal(nomen);
                                    System.out.println("Nome editado com sucesso");
                                    System.out.println("===============");
                                    teste = false;
                                    
                                break;
                                
                                case 2: // EDITAR RAÇA ANIMAL
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite a raça correta");
                                    String racan = stri.next();
                                    a[aux].setRaca(racan);
                                    System.out.println("Raça editada com sucesso");
                                    System.out.println("===============");
                                    teste = false;
                                    
                                break;
                                
                                case 3: // EDITAR ESPECIE ANIMAL
                                   
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite a espécie");
                                    String especien = stri.next();
                                    a[aux].setEspecie(especien);
                                    System.out.println("Espécie editada com sucesso");
                                    System.out.println("===============");
                                    teste = false;
                                    
                                break;
                                
                                case 4:
                                
                                    System.out.println("=== OPÇÃO INVÁLIDA ===");    
                                    
                                break;
                                
                                }
                        }while(teste);
                        
                break;
                
                case 4: // CASE PARA FINALIZAR O SWITCH ANIMAL
                    sair2 = false;
                break;
                
                case 5:
                    System.out.println("=== OPÇÃO INVÁLIDA ===");    
            }  
            
        }while(sair2);    
        break;
        case 2://CASE FUNCIONARIO
            
            boolean teste = true;
            
            do{ // LOOP FUNCIONARIO
            System.out.println("===============");
            System.out.println("SELECIONE UMA OPÇÃO");
            System.out.println("1 - Cadastrar um funcionário");
            System.out.println("2 - Pesquisar por um funcionário");
            System.out.println("3 - Editar dados do funcionário");
            System.out.println("4 - Voltar");
            System.out.println("===============");
            opc2 = in.nextInt();
            
            if (opc2 >= 5) {
                opc2 = 5;
            }

                switch(opc2){
                    case 1:// CADASTRAR UM FUNCIONARIO
                        
                        System.out.println("=== CADASTRO DE FUNCIONÁRIO ===");
                        System.out.println("Nome do Funcionário:");
                        String nomefun = stri.next();
                        System.out.println("CPF");
                        String cpffun = stri.next();
                        System.out.println("Email");
                        String email = stri.next();
                        System.out.println("Telefone");
                        String telefone = stri.next();
                
                        f[indiceFuncionario] = new Funcionario (nomefun, cpffun, email, telefone);
                
                        System.out.println("===============");
                        System.out.println("A IDENTIFICAÇÃO DO FUNCIONÁRIO É " + indiceFuncionario);
                        System.out.println("E SEUS DADOS " + f[indiceFuncionario]);
                
                        indiceFuncionario++;
                        System.out.println("===============");
                    
                    break;
                    case 2: // PESQUISAR UM FUNCIONARIO
                        
                        int aux2 = -1;
                        System.out.println("===PESQUISA===");
                        System.out.println("Digite o nome do funcionário: ");
                        String nomepi = stri.next();//Nome a ser procurado dentro do vetor f[]
                        for (int i = 0; i < f.length; i++) {//Bloco para achar o funcionario desejado
                            if (f[i]!= null) {
                                if (f[i].getNomefun().equalsIgnoreCase(nomepi)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    aux2 = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux2 == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }//if
                        System.out.println("==== Funcionário Pesquisado ====");//Mostra todas as informações do pet
                        System.out.println("Nome: "+ f[aux2].getNomefun());
                        System.out.println("CPF: "+ f[aux2].getCpffun());
                        System.out.println("Email: "+ f[aux2].getEmail());
                        System.out.println("A Identificação: "+ aux2 );
                        System.out.println("===============");
                        
                    break;
                    case 3: // EDITAR DADOS DE UM FUNCIONARIO
                        aux = -1;
                        System.out.println("=== EDIÇÃO ===");
                        System.out.println("Digite o nome do funcionario: ");
                        String nomepes = stri.next();//Nome a ser procurado dentro do vetor a[]
                        for (int i = 0; i < f.length; i++) {//Bloco para achar o animal desejado
                            if (f[i]!= null) {
                                if (f[i].getNomefun().equalsIgnoreCase(nomepes)) {//Testa se existe algum nome compatível com um que exista no vetor a[]
                                    aux = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                            break;
                        }//if
                        System.out.println("==== Funcionario pesquisado ====");//Mostra todas as informações do pet
                        
                        
                        sair3 = true;
                        do{
                        
                        System.out.println("QUAL DADO VOCÊ QUER EDITAR?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - CPf");
                        System.out.println("3 - Email");
                        System.out.println("4 - Telefone");
                        System.out.println("===============");
                        
                        int p = in.nextInt();
                        
                        if (p > 4) {
                        p = 5;
                                    }
                        
                            switch(p){  // SWITCH PARA EDITAR FUNCIONARIO
                                
                                case 1: // EDITAR NOME FUNCIONARIO 
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o nome correto:");
                                    String nomen = stri.next();
                                    f[aux].setNomefun(nomen);
                                    System.out.println("Nome editado com sucesso");
                                    System.out.println("===============");
                                    sair3 = false;
                                    
                                break;
                                
                                case 2: // EDITAR CPF FUNCIONARIO
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o CPF correto:");
                                    String racan = stri.next();
                                    f[aux].setCpffun(racan);
                                    System.out.println("CPF editado com sucesso");
                                    System.out.println("===============");
                                    sair3 = false;
                                    
                                break;
                                
                                case 3: // EDITAR EMAIL FUNCIONARIO
                                   
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o email correto:");
                                    String especien = stri.next();
                                    f[aux].setEmail(especien);
                                    System.out.println("Email editado com sucesso");
                                    System.out.println("===============");
                                    sair3 = false;
                                    
                                break;
                                
                                case 4: // EDITAR TELEFONE
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o telefone correto:");
                                    String tel = stri.next();
                                    f[aux].setTelefone(tel);
                                    System.out.println("Telefone editado com sucesso");
                                    System.out.println("===============");
                                    sair3 = false;
                                    
                                break;
                                
                                case 5:
                                
                                    System.out.println("=== OPÇÃO INVÁLIDA ===");    
                                    
                                break;    
                                
                                }
                        }while(sair3);
                    break;
                    
                    case 4: // CASE PARA SAIR DO LOOP
                    teste = false;    
                    break;
                    
                    case 5 : // CASE PARA OPÇÕES ERRADAS
                        System.out.println("=== OPÇÃO INVÁLIDA ===");
                }
            }while(teste);
            break;
            
        case 3: // CASE DE SERVIÇOS
            do { // LOOP SERVIÇO
                System.out.println("===============");
                System.out.println("SELECIONE UMA OPÇÃO");
                System.out.println("1 - Solicitar um serviço");
                System.out.println("2 - Pesquisar pelos serviços");
                System.out.println("3 - Adicionar um novo serviço");
                System.out.println("4 - Editar um serviço");
                System.out.println("5 - Mostrar a agenda de serviços");
                System.out.println("6 - Voltar");
                System.out.println("===============");
                opc3 = in.nextInt();
                
                if (opc3 > 6) {
                    opc3 = 7;
                }
                
                switch(opc3){
                    case 1:// CASE PARA SOLICITAR UM SERVIÇO
                    
                        System.out.println("=== SOLICITAR SERVIÇO ===");
                        System.out.println("Digite o nome do Pet:");
                        String buscaNomePet = stri.next();
                        
                        aux = -1;
                        
                         for (int i = 0; i < a.length; i++) {//Bloco para achar o animal desejado
                            if (a[i]!= null) {
                                if (a[i].getNomeAnimal().equalsIgnoreCase(buscaNomePet)) {//Testa se existe algum nome compatível com um que exista no vetor a[]
                                    aux = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }else{
                            
                            System.out.println("Digite o nome do funcionário:");
                            String buscaFun = stri.next();
                            
                            
                            int aux2 = -1;
                        
                        
                        for (int i = 0; i < f.length; i++) {//Bloco para achar o funcionario desejado
                            if (f[i]!= null) {
                                if (f[i].getNomefun().equalsIgnoreCase(buscaFun)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    aux2 = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux2 == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }else{
                            System.out.println("Digite o serviço:");
                            String buscaSer = stri.next();
                            
                            int aux3 = -1;
                            
                            for (int i = 0; i < t.length; i++) {//Bloco para achar o funcionario desejado
                            if (t[i]!= null) {
                                if (t[i].getNomeSer().equalsIgnoreCase(buscaSer)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    aux3 = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux3 == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }else{
                            System.out.println("Digite a data:");
                            String buscaData = stri.next();
                            
                            System.out.println("===============");
                            System.out.println("AGENDA PARA DESSE DIA:");
                            
                            for (int i = 0; i < ag.length; i++) {
                                if (ag[i]!= null) {
                                if (ag[i].getData().equalsIgnoreCase(buscaData)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    System.out.println(ag[i]);
                                } //segundo if
                            }
                            }
                            System.out.println("===============");
                            
                            System.out.println("Digite a hora:");
                            String buscaHora = stri.next();
                            
                            ag[indiceAgenda] = new Agenda (buscaData, buscaFun, buscaNomePet, buscaSer, buscaHora);
                            
                            System.out.println("=== SERVIÇO SOLICITADO ===");
                            System.out.println(ag[indiceAgenda]);
                            indiceAgenda++;
                            
                        }
                        }
                        }
                        
                        
                    break;
                    
                    case 2: // CASE PARA PESQUISAR
                    
                    int aux3 = -1;
                        System.out.println("=== PESQUISA ===");
                        System.out.println("Digite o nome do serviço: ");
                        String nomepi = stri.next();//Nome a ser procurado dentro do vetor t[]
                        for (int i = 0; i < t.length; i++) {//Bloco para achar o funcionario desejado
                            if (t[i]!= null) {
                                if (t[i].getNomeSer().equalsIgnoreCase(nomepi)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    aux3 = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux3 == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                            break;
                        }//if
                        System.out.println("==== Serviço Pesquisado ====");//Mostra todas as informações do pet
                        System.out.println("Nome: "+ t[aux3].getNomeSer());
                        System.out.println("Valor: "+ t[aux3].getValor());

                        System.out.println("===============");    
                        
                    break;    
                    
                    case 3: // CASE PARA ADICIONAR
                    
                        System.out.println("=== CADASTRO DE SERVIÇO ===");
                        System.out.println("Digite o nome do serviço:");
                        String nomeSer = stri.next();
                        System.out.println("Digite o valor:");
                        String valorSer = stri.next();
                        
                        t[indiceTipoServico] = new TipoServico (nomeSer , valorSer);
                        
                        System.out.println("===============");
                        System.out.println("Serviço CADASTRADO " + t[indiceTipoServico]);
                        System.out.println("===============");
                        indiceTipoServico++;
                        
                    break;
                    
                    case 4: // EDITAR UM SERVIÇO
                    
                        aux = -1;
                        System.out.println("=== EDIÇÃO ===");
                        System.out.println("Digite o nome do serviço: ");
                        String nomepes = stri.next();//Nome a ser procurado dentro do vetor a[]
                        for (int i = 0; i < t.length; i++) {//Bloco para achar o animal desejado
                            if (t[i]!= null) {
                                if (t[i].getNomeSer().equalsIgnoreCase(nomepes)) {//Testa se existe algum nome compatível com um que exista no vetor a[]
                                    aux = i;
                                } //segundo if
                            } //primeiro if
                        }//for
                        if (aux == -1) {//Se o nome não existir aparece a mensagem abaixo e repete o bloco 
                            System.out.println("Digite um nome válido!");
                            System.out.println("===============");
                        }//if
                        
                        
                        teste = true;
                        do{
                        
                        System.out.println("QUAL DADO VOCÊ QUER EDITAR?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - Valor");
                        System.out.println("===============");
                        
                        int p = in.nextInt();
                        
                        if (p > 2) {
                        p = 3;
                                    }
                        
                            switch(p){  // SWITCH PARA EDITAR SERVIÇO
                                
                                case 1: // EDITAR NOME SERVIÇO 
                                    
                                    System.out.println("=== EDITAR ===");
                                    System.out.println("Digite o nome correto:");
                                    String nomen = stri.next();
                                    t[aux].setNomeSer(nomen);
                                    System.out.println("Nome editado com sucesso");
                                    System.out.println("===============");
                                    teste = false;
                                    
                                break;
                                
                                case 2: // EDITAR VALOR SERVIÇO
                                
                                    System.out.println("Digite o valor correto:");
                                    String racan = stri.next();
                                    t[aux].setValor(racan);
                                    System.out.println("Valor editado com sucesso");
                                    System.out.println("===============");
                                    teste = false;
                                    
                                break;
                                
                                case 3:
                                
                                    System.out.println("=== OPÇÃO INVÁLIDA ===");    
                                    
                                break;    
                                
                                }
                        }while(teste);
                        
                    break;
                    
                    case 5 : // MOSTRAR A AGENDA DE SERVIÇO
                        
                        System.out.println("=== AGENDA ===");
                        System.out.println("Digite o dia da agenda:");
                        String dataAgenda = stri.next();
                        
                        System.out.println("===============");
                        System.out.println("A agenda desse dia é:");
                        for (int i = 0; i < ag.length; i++) {
                                if (ag[i]!= null) {
                                if (ag[i].getData().equalsIgnoreCase(dataAgenda)) {//Testa se existe algum nome compatível com um que exista no vetor f[]
                                    System.out.println(ag[i]);
                                } //segundo if
                            }
                            }
                        System.out.println("===============");
                    
                    break;
                    
                    case 6 : // VOLTAR
                    
                        sair4 = false;  
                        
                    break;
                    
                    case 7:
                        
                        System.out.println("=== OPÇÃO INVÁLIDA ===");
                        
                    break;    
                }
                
                
                
            } while (sair4);
  
        break;
        
        case 4: // CASE PARA FECHAR O PROGRAMA
        
            sair = false;    
        
        break;
        case 5:
            
            System.out.println("=== OPCÇÃO INVÁLIDA ==="); 
        
        break;    
    }


        } while (sair);
        
 
    } // FIM DO MAIN
    
}// fim da CLASSE
