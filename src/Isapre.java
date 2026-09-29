import java.util.ArrayList;
public class Isapre {
    private ArrayList<PlanIsapre> planes;

    public Isapre() {
    this.planes = new ArrayList<>();
        System.out.println("Lista creada");
    }

    public void agregarPlan(PlanIsapre plan){
        this.planes.add(plan);
        System.out.println("Plan agregado");
    }

    public void buscarAfiliadoPorRun(String run){
        boolean bandera = false;
        for (PlanIsapre plan : planes) {
            if (plan.getRunAfiliado() == run){
                bandera = true;
                plan.imprimirplan();
            }
        }
        if (bandera == false){
            System.out.println("No se encontro usuario con el run: "+run);
        }
    }

    public void buscaAfiliadoConCarga(){
        boolean bandera2= false;
        for (PlanIsapre plan : planes) {
            if (plan.getClass()== PlanConCarga.class){
                bandera2 = true;
                plan.imprimirplan();
            }
        }
        if (bandera2 == false){
            System.out.println("No se encuentran usuarios con carga.");
        }
    }
}
