package laboratoriosenai;

public class LaboratorioSenai {
    public static void main(String[] args) {
        Tecnico tec = new Tecnico();
        Laboratorio lab = new Laboratorio();
        tec.setNomeTecnico("Jose da Silva");
        tec.setFoneTecnico("(47) 98555-4298");
        tec.setEmailTecnico("zecasilva@javou.com.br");
        if (tec.incluirTecnico()){
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
        
        if (tec.excluirTecnico()){
            System.out.println("Tecnico incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do tecnico");
        }
        
        tec.setCodTecnico(1);
        if (tec.consultarTecnico()){
            
        } else {
            System.out.println("Deu problema na inclusão do tecnico");
        }
        tec.consultarTecnicos();
    }
}
