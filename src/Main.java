void main() {
    Isapre banDoctor = new Isapre();
    PlanConCarga plan1 = new PlanConCarga("123-4","Juan",700_000,true,3);
    banDoctor.agregarPlan(plan1);
    PlanSimple plan2= new PlanSimple("123-5","Seba",500_000,true);
    banDoctor.agregarPlan(plan2);

    System.out.println("\nBuscar afiliado por run");
    banDoctor.buscarAfiliadoPorRun("123-6");
    banDoctor.buscarAfiliadoPorRun("123-4");

    System.out.println("\nBuscarconcarga");
    banDoctor.buscaAfiliadoConCarga();
}
