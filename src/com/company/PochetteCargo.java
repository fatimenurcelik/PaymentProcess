package com.company;

public class PochetteCargo implements cargo{
    @Override
    public void cargoBehavior() {
        System.out.println("Your product will be sent safely in a plastic bag.");
    }
}
