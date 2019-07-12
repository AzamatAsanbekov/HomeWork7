package com.company;

public class Main {

    public static void main(String[] args) {

        Boss Azamat = new Boss(500, 50);

        Azamat.Voice();

        Azamat.changeBossDefence();

        Azamat.printInfo();


        Warrior Maks = new Warrior(250, 20);

        Magic Diana = new Magic(250, 20);

        Mental DoctorStrange = new Mental(250, 20);


        int num = Azamat.getHealth();

        switch (num) {

            case 1:
                Maks.rage();

                Diana.printInfo();

                break;

            case 2:
                Diana.rage();

                Diana.magicalHit();

                break;

            case 3:

                DoctorStrange.rage();

                DoctorStrange.kineticHit();

                break;

            default:

                break;


        }


        Maks.Voice();

        Maks.printInfo();


        Diana.Voice();

        Diana.printInfo();


        DoctorStrange.Voice();

        DoctorStrange.printInfo();


    }

}



