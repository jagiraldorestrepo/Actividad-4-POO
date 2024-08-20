package Inmuebles;

public class CasaIndependiente extends CasaUrbana {

    public CasaIndependiente(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
