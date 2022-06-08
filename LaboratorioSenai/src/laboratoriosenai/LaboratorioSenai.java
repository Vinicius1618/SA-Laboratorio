package laboratoriosenai;

public class LaboratorioSenai {
    public static void main(String[] args) {
        Tecnico tec = new Tecnico();
        tec.setNomeTecnico("Jose da Silva");
        tec.setFoneTecnico("(47) 98555-4298");
        tec.setEmailTecnico("zecasilva@javou.com.br");
        if (tec.incluirTecnico()){
            System.out.println("Tecnico incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusão do tecnico");
        }
    }

}
