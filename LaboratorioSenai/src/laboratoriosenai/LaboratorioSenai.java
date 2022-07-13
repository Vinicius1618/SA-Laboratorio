package laboratoriosenai;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
public class LaboratorioSenai {
    public static void main(String[] args) {
        //****** TECNICOS --- INICIO
        //Tecnico tec = new Tecnico();
        /*tec.setNomeTecnico("Jose da Silva");
        tec.setFoneTecnico("(47) 98555-4298");
        tec.setEmailTecnico("zecasilva@javou.com.br");
        if (tec.incluirTecnico()){ //isso inclui o tecnico
            System.out.println("Tecnico incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do tecnico");
        }
        tec.setNomeTecnico("Arnaldo");
        tec.setFoneTecnico("(47) 98555-4298");
        tec.setEmailTecnico("zecasilva@javou.com.br");
        tec.setCodTecnico(3);
        tec.alterarTecnico();
        tec.setCodTecnico(1);
        if (tec.excluirTecnico()){//isso exclui o tecnico
            System.out.println("Tecnico incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do tecnico");
        }
        tec=tec.consultarTecnico(1);
        System.out.println("Código : " + tec.getCodTecnico());
            System.out.println("Nome   : " + tec.getNomeTecnico());
            System.out.println("Fone   : " + tec.getFoneTecnico());
            System.out.println("eMail  : " + tec.getEmailTecnico());
            
        List<Tecnico> listaTecnicos = new ArrayList<>();//isso consulta os tecnicos
        listaTecnicos = tec.consultarTodosTecnicos();
        for (Tecnico tecn : listaTecnicos) {
            System.out.println("Código : " + tecn.getCodTecnico());
            System.out.println("Nome   : " + tecn.getNomeTecnico());
            System.out.println("Fone   : " + tecn.getFoneTecnico());
            System.out.println("eMail  : " + tecn.getEmailTecnico());
        }*/
        //****** TECNICOS --- FIM
        
        //****** LABORATORIO --- INICIO
        Laboratorio lab = new Laboratorio();
        /*lab.setCodLaboratorio("C15");
        lab.setTipoLaboratorio("M");
        lab.setDescrLaboratorio("É um laboratorio de manutenção");
        lab.setSituacaoLaboratorio("I"); //isso aqui inclui o laboratorio
        if (lab.incluirLaboratorio()){
            System.out.println("Laboratorio incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do laboratorio");
        }
        lab.setCodLaboratorio("B10");
        lab.setTipoLaboratorio("M");
        lab.setDescrLaboratorio("É um laboratorio de mecanica");
        lab.setSituacaoLaboratorio("A");
        lab.alterarLaboratorio(); //Isso aqui altera o laboratorio*/
        lab.setCodLaboratorio("E05");
        if (lab.excluirLaboratorio()){ //isso exclui os laboratorios
            System.out.println("Laboratorio excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do laboratorio");
        }/*
           lab=lab.consultarLaboratorio("B10");
            System.out.println("Codigo do laboratorio  : " + lab.getCodLaboratorio());
            System.out.println("Tipo do laboratorio  : " + lab.getTipoLaboratorio());
            System.out.println("Descrição do laboratorio  : " + lab.getDescrLaboratorio());
            System.out.println("Situação do laboratorio  : " + lab.getSituacaoLaboratorio());
        
         List<Laboratorio> listaLaboratorio = new ArrayList<>();//isso consulta os laboratorios
         listaLaboratorio = lab.consultarLaboratorios();
         for (Laboratorio labo : listaLaboratorio) {
            System.out.println("Codigo do laboratorio  : " + labo.getCodLaboratorio());
            System.out.println("Tipo do laboratorio  : " + labo.getTipoLaboratorio());
            System.out.println("Descrição do laboratorio  : " + labo.getDescrLaboratorio());
            System.out.println("Situação do laboratorio  : " + labo.getSituacaoLaboratorio());
         }
        //****** LABORATORIO --- FIM
        
        //****** SOFTWARE  --- INICIO
        //Software sof = new Software();
        /*DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("20/06/2022",formato);
        sof.setDescSoftware("python");
        sof.setDescVersao("V.15");
        sof.setDataInstalacao(Date.valueOf(data));
        sof.setTipoLicenca("F");
         if (sof.incluirSoftware()){ //isso INCLUI o tecnico
            System.out.println("Software incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do software");
        }
         sof.setDescSoftware("oracle");
         sof.setDescVersao("20");
         sof.setDataInstalacao(Date.valueOf(data));
         sof.setTipoLicenca("V");
         sof.setCodSoftware(5);
         sof.alterarSoftware();//isso aqui ALTERA o software 
         sof.setCodSoftware(7);
         if (sof.excluirSoftware()){ //isso exclui os software
            System.out.println("Software excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do software");
        }
            sof=sof.consultarSoftware(4);
            System.out.println("Código do software  : " + sof.getCodSoftware());
            System.out.println("Descrição do software  : " + sof.getDescSoftware());
            System.out.println("Descrição da versão  : " + sof.getDescVersao());
            System.out.println("Data da instalação  : " + sof.getDataInstalacao());
            System.out.println("Tipo da licença  : " + sof.getTipoLicenca());
        
         List<Software> listaSoftware = new ArrayList<>();//isso CONSULTA os SOFTWAREs
         listaSoftware = sof.consultarSoftwares();
         for (Software soft : listaSoftware) {
            System.out.println("Código do software  : " + soft.getCodSoftware());
            System.out.println("Descrição do software  : " + soft.getDescSoftware());
            System.out.println("Descrição da versão  : " + soft.getDescVersao());
            System.out.println("Data da instalação  : " + soft.getDataInstalacao());
            System.out.println("Tipo da licença  : " + soft.getTipoLicenca());
         }*/
        //****** SOFTWARE  --- FIM 
         
         //****** EQUIPAMENTO --- INICIO
         //Equipamento equi = new Equipamento();
         /*DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         
         //********** INCLUIR EQUIPAMENTO
         LocalDate data = LocalDate.parse("20/06/2022",formato);
         equi.setCodSoftware(4);
         equi.setCodLaboratorio("B10");
         equi.setTipoEquipamento("M");
         equi.setdescrEquipamento("Um monitor 4K");
         equi.setSistemaOperacional("Windows 10");
         equi.setSitPatrimonio("F");
         equi.setDataEntrAtivo(Date.valueOf(data));
         equi.setDataBaixaAtivo(Date.valueOf(data));
         if (equi.incluirEquipamento()){ //isso inclui o equipamento
            System.out.println("equipamento incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do equipamento");
        }
         //********* ALTERAR EQUIPAMENTO
         LocalDate data = LocalDate.parse("21/06/2022",formato);
         equi.setTipoEquipamento("I");
         equi.setdescrEquipamento("teclado");
         equi.setSistemaOperacional("Windows 10");
         equi.setSitPatrimonio("F");
         equi.setDataBaixaAtivo(Date.valueOf(data));
         equi.setCodLaboratorio("B10");
         equi.setCodSoftware(4);
         equi.setCodAtivo(3);
         equi.alterarEquipamento();
         equi.setCodAtivo(3);
         equi.excluirEquipamento();
         if (equi.excluirEquipamento()){ //isso exclui os equipamento
            System.out.println("equipamento excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do equipamento");
        }
             equi=equi.consultarEquipamento(2);
             System.out.println("Codigo do ativo : "+equi.getCodAtivo());
             System.out.println("Codigo do software : "+equi.getCodSoftware());
             System.out.println("Codigo do laboratorio : "+equi.getCodLaboratorio());
             System.out.println("Tipo do Equipamento : "+equi.getTipoEquipamento());
             System.out.println("Descrição do equipamento : "+equi.getdescrEquipamento());
             System.out.println("O sistema operacional usado : "+equi.getSistemaOperacional());
             System.out.println("Situação do patrimonio : "+equi.getSitPatrimonio());
             System.out.println("Data de entrada do ativo : "+equi.getDataEntrAtivo());
             System.out.println("Data de baixa do ativo : "+equi.getDataBaixaAtivo());
         System.out.println("*******************************************************************");
         List<Equipamento>listaEquipamento= new ArrayList<>();
         listaEquipamento=equi.consultarEquipamentos();
         for(Equipamento equ : listaEquipamento)
         {
             System.out.println("Codigo do ativo : "+equ.getCodAtivo());
             System.out.println("Codigo do software : "+equ.getCodSoftware());
             System.out.println("Codigo do laboratorio : "+equ.getCodLaboratorio());
             System.out.println("Tipo do Equipamento : "+equ.getTipoEquipamento());
             System.out.println("Descrição do equipamento : "+equ.getdescrEquipamento());
             System.out.println("O sistema operacional usado : "+equ.getSistemaOperacional());
             System.out.println("Situação do patrimonio : "+equ.getSitPatrimonio());
             System.out.println("Data de entrada do ativo : "+equ.getDataEntrAtivo());
             System.out.println("Data de baixa do ativo : "+equ.getDataBaixaAtivo());
         } */
         //****** Equipamento  --- FIM 
         
         //****** Manutençao --- INICIO
         //Manutencao//
        //incluir//
        //Manutencao manu = new Manutencao ();
        /*DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("06/07/2022",formato);
        LocalDate data1 = LocalDate.parse("14/07/2022",formato);
        manu.setCodAtivo(2);
        manu.setCodTecnico(1);
        manu.setCodLaboratorio("C01");
        manu.setTipomanutencao("pica");
        manu.setOrdemServico(2);
        manu.setDescrManutencao("trocar hd");
        manu.setDataManutencao(Date.valueOf(data));
        manu.setDataLiberacao(Date.valueOf(data1));
        manu.setStatusmanutencao("arrumado");
        if (manu.incluirManutencao()) {
            System.out.println("Manutencao incluída com sucesso");
        } else {
            System.out.println("Deu problema na inclusao da Manutencao");
        }
        //alterar// 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("14/06/2022",formato);
        manu.setCodTecnico(2);
        manu.setTipomanutencao("Corretiva");
        manu.setOrdemServico(1);
        manu.setDescrManutencao("Limpeza dos arquivos");
        manu.setDataLiberacao(Date.valueOf(data));
        manu.setStatusmanutencao("em conserto");
        manu.setCodManutencao(1);
        if (manu.alterarManutencao()) {
            System.out.println("Manutencao alterada com sucesso");
        } else {
            System.out.println("Deu problema na alteracao da Manutencao");
        }
        
        //excluir
        manu.setCodManutencao(1);
        if (manu.excluirManutencao()) {
            System.out.println("Manutencao excluída com sucesso");
        } else {
            System.out.println("Deu problema na exclusao da Manutencao");
        }
       */
       //Consulta//
        //Manutencao manu = new Manutencao();
        /*manu = manu.consultarManutencao(3);
        System.out.println("Código Ativo...: " + manu.getCodAtivo()); 
        System.out.println("Código Técnico...: " + manu.getCodTecnico());
        System.out.println("Codigo do laboratorio...: "+manu.getCodLaboratorio());
        System.out.println("Tipo Manutencao.: " + manu.getTipomanutencao()); 
        System.out.println("Ordem Servico.: " + manu.getOrdemServico());
        System.out.println("Descricao Manutencao.: " + manu.getDescrManutencao());
        System.out.println("Data Manutencao.: " + manu.getDataManutencao());
        System.out.println("Data Liberacao.: " + manu.getDataLiberacao());
        System.out.println("Status Manutencao.: " + manu.getStatusmanutencao());
       
       List<Manutencao> listaManutencao = new ArrayList<>();
    
       listaManutencao = manu.consultarTodosManutencao();
       for ( Manutencao man : listaManutencao)
       {
            System.out.println("codigo manutencao " + man.getCodManutencao());
            System.out.println("Código Ativo...: " + man.getCodAtivo()); 
            System.out.println("Código Técnico...: " + man.getCodTecnico());
            System.out.println("Codigo do laboratorio...: "+man.getCodLaboratorio());
            System.out.println("Tipo Manutencao.: " + man.getTipomanutencao()); 
            System.out.println("Ordem Servico.: " + man.getOrdemServico());
            System.out.println("Descricao Manutencao.: " + man.getDescrManutencao());
            System.out.println("Data Manutencao.: " + man.getDataManutencao());
            System.out.println("Data Liberacao.: " + man.getDataLiberacao());
            System.out.println("Status Manutencao.: " + man.getStatusmanutencao());
        }*/
        //****** MANUTENCAO  --- FIM
        
        //****** EQUISOFTWARE --- INICIO
        //EquipSoftware equiSoft = new EquipSoftware();
        //INCLUIR//
        /*equiSoft.setCodAtivo(2);
        equiSoft.setCod_Software(4);
        if (equiSoft.incluirEquiSoftware()) {
            System.out.println("EquipSoftware incluído com sucesso");
        } else {
            System.out.println("Deu problema na inclusao do EquipSoftware ");
        }
       // EXCLUSAO//
        equiSoft.setCodAtivo(2);
        equiSoft.setCodSoftware(6);
        if (equiSoft.excluirEquiSoftware()) {
            System.out.println("Equipamento x Software excluído com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do Equipamento x Software");
        }*/
        /*
        List<Tecnico> listaTecnicos = new ArrayList<>();//isso consulta os tecnicos
        listaTecnicos = tec.consultarTodosTecnicos();
        for (Tecnico tecn : listaTecnicos) {
            System.out.println("Código : " + tecn.getCodTecnico());
            System.out.println("Nome   : " + tecn.getNomeTecnico());
            System.out.println("Fone   : " + tecn.getFoneTecnico());
            System.out.println("eMail  : " + tecn.getEmailTecnico());        
        */
        EquipSoftware equs = new EquipSoftware();
        List<EquipSoftware> listaEquipSoftware = new ArrayList<>();
        listaEquipSoftware = equs.consultarEquipSoftware(1);
        
        for (EquipSoftware e : listaEquipSoftware) {
                System.out.println("Código Ativo : " + e.getCodAtivo()); 
                System.out.println("Código Software...: " + e.getCod_Software());}
        }
        
       /*EquipSoftware equs = new EquipSoftware();
       List<EquipSoftware> listaEquipSoftware = new ArrayList<>();
        listaEquipSoftware = equs.consultarEquiSoftwares();
        for (EquipSoftware equis : listaEquipSoftware) {
           System.out.println("Código Ativo : " + equis.getCodAtivo()); 
           System.out.println("Código Software...: " + equis.getCodSoftware()); 
         }*/
    }


     
    
