package org.josue;

public class FacadeCajero {
    private UsuarioValidacion val = new UsuarioValidacion();
    private RecargaMovil rec = new RecargaMovil();
    private RetirarDinero ret = new RetirarDinero();

    public String sacarDinero()
    {
        return val.valida() + ret.retirar();
    }

    public String recargaMovil()
    {
        return val.valida() + rec.recarga();
    }
}
