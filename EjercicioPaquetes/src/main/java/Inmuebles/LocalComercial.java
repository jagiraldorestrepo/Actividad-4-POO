package Inmuebles;

public class LocalComercial extends Local {

    protected static double valorArea = 3000000;
    protected String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int área, String dirección, Tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
    }
}

