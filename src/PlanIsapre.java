public abstract class  PlanIsapre implements Valor {
    private String runAfiliado;
    private String nombreAfiliado;
    private double sueldoAfiliado;
    private boolean planActivo;
    private double valorPlan;

    public PlanIsapre(String runAfiliado, String nombreAfiliado, double sueldoAfiliado, boolean planActivo) {
        this.runAfiliado = runAfiliado;
        this.nombreAfiliado = nombreAfiliado;
        this.sueldoAfiliado = sueldoAfiliado;
        this.planActivo = planActivo;
        this.valorPlan = calcularValorBasePlan();
    }

    public PlanIsapre() {
        this("no run","no name",550_000,false);
        this.valorPlan = 0;
    }

    public String getRunAfiliado() {
        return runAfiliado;
    }

    public void setRunAfiliado(String runAfiliado) {
        this.runAfiliado = runAfiliado;
    }

    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public void setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
    }

    public double getSueldoAfiliado() {
        return sueldoAfiliado;
    }

    public void setSueldoAfiliado(double sueldoAfiliado) {
        if (this.sueldoAfiliado<=0){
            throw new IllegalArgumentException("El sueldo no puede ser menor o igual a 0.");
        }else {
            this.sueldoAfiliado = sueldoAfiliado;
        }
    }

    public boolean isPlanActivo() {
        return planActivo;
    }

    public void setPlanActivo(boolean planActivo) {
        this.planActivo = planActivo;
    }

    public double getValorPlan() {
        return valorPlan;
    }

    public void setValorPlan(double valorPlan) {
        if (this.valorPlan <=0){
            throw new IllegalArgumentException("El valor no puede ser menor o igual a 0.");
        }
        this.valorPlan = valorPlan;
    }

    @Override
    public double calcularValorBasePlan() {
        return VALOR_BASE_PLAN + (this.sueldoAfiliado*0.055);
    }
    public abstract double montoApagar();

    public abstract void imprimirplan();
}
