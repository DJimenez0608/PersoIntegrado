package com.example.persointegradoimplementacion.Clases.Tarjetas;

public class TarjetaTerceraEdad extends Tarjeta {
    public double tarifa = 1250;

    public TarjetaTerceraEdad(double saldo, String idTarjeta) {
        super(saldo, idTarjeta);
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
