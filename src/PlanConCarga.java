public final class PlanConCarga extends PlanIsapre{
    private int numeroDeCargas;
    public double VALOR_FACTOR_PLAN;

    public PlanConCarga(String runAfiliado, String nombreAfiliado, double sueldoAfiliado, boolean planActivo, int numeroDeCargas) {
        super(runAfiliado, nombreAfiliado, sueldoAfiliado, planActivo);
        this.numeroDeCargas = numeroDeCargas;
    }

    public int getNumeroDeCargas() {
        return numeroDeCargas;
    }

    public void setNumeroDeCargas(int numeroDeCargas) {
        this.numeroDeCargas = numeroDeCargas;
    }

    public double getVALOR_FACTOR_PLAN() {
        return this.calcularValorFactorPlan();
    }

    public void setVALOR_FACTOR_PLAN(double VALOR_FACTOR_PLAN) {
        this.VALOR_FACTOR_PLAN = VALOR_FACTOR_PLAN;
    }

    @Override
    public double montoApagar() {
        return this.getValorPlan()+(this.getSueldoAfiliado()*this.getNumeroDeCargas()*this.getVALOR_FACTOR_PLAN());
    }

    @Override
    public void imprimirplan() {
        System.out.println("Nombre Plan");
        System.out.println("Nombre Afiliado: "+this.getNombreAfiliado());
        System.out.println("Nombre tipo de plan: Con Cargas");
        System.out.println("N° cargas: "+this.getNumeroDeCargas());
        System.out.println("Total a pagar $"+this.montoApagar());
    }

    private double calcularValorFactorPlan(){
        if(this.numeroDeCargas == 1){
            return 0.05;
        }else if (this.numeroDeCargas == 2) {
            return 0.08;
        }else if (this.numeroDeCargas >= 3){
            return 0.25;
        } else {
            throw new IllegalArgumentException("La carga no puede ser menor que 1");
        }
    }
}

