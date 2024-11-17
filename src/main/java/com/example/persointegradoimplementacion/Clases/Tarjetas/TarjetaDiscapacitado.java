package com.example.persointegradoimplementacion.Clases.Tarjetas;

public class TarjetaDiscapacitado extends Tarjeta{
    public double tarifa = 1300;

    public TarjetaDiscapacitado(double saldo, String idTarjeta) {
        super(saldo, idTarjeta);
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
