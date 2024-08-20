package Inmuebles;

public class Local extends Inmueble {

    enum Tipo { INTERNO, CALLE }

    protected Tipo tipoLocal;

    public Local(int identificadorInmobiliario, int área, String dirección, Tipo tipoLocal) {
        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
