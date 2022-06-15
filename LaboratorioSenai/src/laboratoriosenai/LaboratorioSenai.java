package laboratoriosenai;
import java.util.ArrayList;
import java.util.List;
public class LaboratorioSenai {
    public static void main(String[] args) {
        //****** TECNICOS --- INICIO
        /*Tecnico tec = new Tecnico();
        Software sof = new Software();
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
        
        Laboratorio lab = new Laboratorio();
        lab.setCodBloco("S");
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
         for (Tecnico tecn : listaTecnicos) {
            System.out.println("Código : " + tecn.getCodTecnico());
            System.out.println("Nome   : " + tecn.getNomeTecnico());
            System.out.println("Fone   : " + tecn.getFoneTecnico());
            System.out.println("eMail  : " + tecn.getEmailTecnico());
         
        //****** LABORATORIO --- FIM
        
        //****** SOFTWARE  --- INICIO
        /*Software sof = new Software();
        sof.setDescSoftware("Oracle");
         sof.setDescVersao("7.0");
         sof.setDataInstalacao("2022-06-14");
         sof.setTipoLicença("V");
         if (sof.incluirSoftware()){ //isso inclui o tecnico
            System.out.println("Software incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do software");
        }
         /*sof.setDescSoftware("Python");
         sof.setDescSoftware("Python");

         sof.setDescVersao("20");
         sof.setDataInstalacao("2022-12-31");
         sof.setTipoLicença("V");
         sof.setCodSoftware(2);
         sof.alterarSoftware();//isso aqui altera o software
         */
         /*sof.setCodSoftware(2);
          if (sof.excluirSoftware()){ //isso exclui os softwares
            System.out.println("software excluido com sucesso");
        } else {
            System.out.println("Deu problema na exclusao do software");*/
          /*sof.setCodSoftware(4);
          if (sof.consultarSoftware()){ //isso aqui faz a consulta
        } else {
            System.out.println("Deu problema na consulta do software");
        }
        }*/
         //sof.consultarSoftwares();//isso aqui consulta todos laboratorios
         
        //****** SOFTWARE  --- FIM
    }
}
