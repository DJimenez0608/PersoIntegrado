package com.example.persointegradoimplementacion.Clases.Tarjetas;

public class TarjetaEstudiante extends Tarjeta{
    public double tarifa = 1400;

    public TarjetaEstudiante(double saldo, String idTarjeta) {
        super(saldo, idTarjeta);
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
