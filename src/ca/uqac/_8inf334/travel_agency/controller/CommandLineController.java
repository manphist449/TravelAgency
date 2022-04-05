package ca.uqac._8inf334.travel_agency.controller;

import java.util.Scanner;

abstract public class CommandLineController {

    protected Scanner scanner;

    public CommandLineController()
    {
        this.scanner = new Scanner(System.in);
    }

}
