package laboratoriosenai;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
public class LaboratorioSenai {
    public static void main(String[] args) {
        //****** TECNICOS --- INICIO
        /*Tecnico tec = new Tecnico();
        tec.setNomeTecnico("Jose da Silva");
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
        //Laboratorio lab = new Laboratorio();
        /*lab.setCodBloco("S");
        lab.setCodLaboratorio(4);
        lab.setTipoLaboratorio("S");
        lab.setDescrLaboratorio("É um laboratorio de SEcsu");
        lab.setSituacaoLaboratorio("I"); //isso aqui inclui o laboratorio
        if (lab.incluirLaboratorio()){
            System.out.println("Laboratorio incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do laboratorio");
        }
        lab.setCodBloco("A");
        lab.setCodLaboratorio(1);
        lab.setTipoLaboratorio("M");
        lab.setDescrLaboratorio("É um laboratorio de mecanica");
        lab.setSituacaoLaboratorio("A");
        lab.alterarLaboratorio(); //Isso aqui altera o laboratorio
        lab.setCodBloco("A");
        lab.setCodLaboratorio(1);
        if (lab.excluirLaboratorio()){ //isso exclui os laboratorios
            System.out.println("Laboratorio excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do laboratorio");
        }
         List<Laboratorio> listaLaboratorio = new ArrayList<>();//isso consulta os tecnicos
         listaLaboratorio = lab.consultarLaboratorios();
         for (Laboratorio labo : listaLaboratorio) {
            System.out.println("Código do bloco  : " + labo.getCodBloco());
            System.out.println("Codigo do laboratorio  : " + labo.getCodLaboratorio());
            System.out.println("Tipo do laboratorio  : " + labo.getTipoLaboratorio());
            System.out.println("Descrição do laboratorio  : " + labo.getDescrLaboratorio());
            System.out.println("Situação do laboratorio  : " + labo.getSituacaoLaboratorio());
         */
        //****** LABORATORIO --- FIM
        
        //****** SOFTWARE  --- INICIO
        /*Software sof = new Software();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("20/06/2022",formato);
        sof.setDescSoftware("github");
        sof.setDescVersao("V.15");
        sof.setDataInstalacao(Date.valueOf(data));
        sof.setTipoLicença("F");
         if (sof.incluirSoftware()){ //isso inclui o tecnico
            System.out.println("Software incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do software");
        }
         sof.setDescSoftware("Python");
         sof.setDescVersao("20");
         sof.setDataInstalacao(Date.valueOf(data));
         sof.setTipoLicença("V");
         sof.setCodSoftware(4);
         sof.alterarSoftware();//isso aqui altera o software
         
         List<Software> listaSoftware = new ArrayList<>();//isso consulta os tecnicos
         listaSoftware = sof.consultarSoftwares();
         for (Software soft : listaSoftware) {
            System.out.println("Código do software  : " + soft.getCodSoftware());
            System.out.println("Descrição do software  : " + soft.getDescSoftware());
            System.out.println("Descrição da versão  : " + soft.getDescVersao());
            System.out.println("Data da instalação  : " + soft.getDataInstalacao());
            System.out.println("Tipo da licença  : " + soft.getTipoLicença() );*/
            
        //****** SOFTWARE  --- FIM */
         
         //****** EQUIPAMENTO --- INICIO
         Equipamento equi = new Equipamento();
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         /*LocalDate data = LocalDate.parse("20/06/2022",formato);
         equi.setCodSoftware(4);
         equi.setCodBloco("A");
         equi.setCodLaboratorio(1);
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
        }*/
         LocalDate data = LocalDate.parse("21/06/2022",formato);
         equi.setTipoEquipamento("M");
         equi.setdescrEquipamento("Um monitor 4K muito pica");
         equi.setSistemaOperacional("Windows 10");
         equi.setSitPatrimonio("F");
         equi.setDataEntrAtivo(Date.valueOf(data));
         equi.setDataBaixaAtivo(Date.valueOf(data));
         //equi.setCodBloco("A");
         //equi.setCodLaboratorio(1);
        // equi.setCodSoftware(4);
         equi.setCodAtivo(1);
         equi.alterarEquipamento();
         }
    }
