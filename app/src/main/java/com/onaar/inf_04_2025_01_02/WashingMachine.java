package com.onaar.inf_04_2025_01_02;

public class WashingMachine extends Device {

    private int nrProgram;

    public WashingMachine() {
        nrProgram = 0;
    }

    public int setWashingProgram(int program) {
        if (program >= 1 && program <= 12) {
            nrProgram = program;
        } else {
            nrProgram = 0;
        }

        return nrProgram;
    }
}