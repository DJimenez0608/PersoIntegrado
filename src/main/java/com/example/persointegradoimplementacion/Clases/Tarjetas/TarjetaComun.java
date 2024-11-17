package com.example.persointegradoimplementacion.Clases.Tarjetas;

public class TarjetaComun extends Tarjeta{
    public double tarifa = 1700;

    public TarjetaComun(double saldo, String idTarjeta) {
        super(saldo, idTarjeta);
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void calcularDescuento(){}
}
