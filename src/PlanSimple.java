public final class  PlanSimple extends PlanIsapre{
    public PlanSimple(String runAfiliado, String nombreAfiliado, double sueldoAfiliado, boolean planActivo) {
        super(runAfiliado, nombreAfiliado, sueldoAfiliado, planActivo);
    }

    public PlanSimple() {
        super();
    }


    @Override
    public double montoApagar() {
        return this.calcularValorBasePlan();
    }

    @Override
    public void imprimirplan() {
        System.out.println("Nombre Plan");
        System.out.println("Nombre Afiliado"+this.getNombreAfiliado());
        System.out.println("Nombre tipo de plan: Simple");
        System.out.println("Total a pagar $"+this.montoApagar());
    }
}
