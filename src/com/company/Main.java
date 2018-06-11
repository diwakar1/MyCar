package com.company;

public class Main {

    public static void main(String[] args) {
	Car mycar = new Car();
        Car myCar2 = new Car();

        mycar.setColor("blue");
        mycar.setWeight(100);
        mycar.setModel("Corrola");
        mycar.setMake( "toyota");
        mycar.setYear("2005");
        mycar.setEngineType( "double Engine");
        mycar.setNumberOfWheels(4);
        mycar.setSpeed(90);


        myCar2.setColor("red");
        myCar2.setWeight(200);
        myCar2.setModel("rap4");
        myCar2.setMake( "toyoto");
        myCar2.setYear("2015");
        myCar2.setEngineType( "triple Engine");
        myCar2.setNumberOfWheels(4);
        myCar2.setSpeed(150);



        p("Vehicle " + mycar.start());
        p("Vehicle " + myCar2.start());
        p("Vehicle " + myCar2.acclerate());
        p("Vehicle " + mycar.acclerate());
        p("Vehicle " + mycar.readSpeed());
        p("Vehicle " + myCar2.readSpeed());
        p("Vehicle " + myCar2.stop());
        p("Vehicle " + mycar.stop());




    }
    public static  void p(String s){
        System.out.println(s);
    }
}
