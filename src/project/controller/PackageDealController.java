package project.controller;

import project.classes.Agency;
import project.classes.PackageDeal;

public class PackageDealController {

    private PackageDeal myPackageDeal;
    public PackageDealController()
    {

    }

    public void setPackageDeal(PackageDeal packageDeal)
    {
        this.myPackageDeal = packageDeal;
    }
    public void setAgency(Agency agency)
    {
        this.myPackageDeal.myAgency = agency;
    }
}
