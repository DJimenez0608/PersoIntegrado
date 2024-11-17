package com.example.persointegradoimplementacion.Clases.Tarjetas;

public abstract  class Tarjeta {
    public double saldo ;
    public String idTarjeta;

    public Tarjeta(double saldo, String idTarjeta) {
        this.saldo = 0;
        this.idTarjeta = idTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public void recargartarjeta() {}
    public void consultarSaldo(){}
}
