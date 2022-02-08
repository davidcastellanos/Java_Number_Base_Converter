class Army {

    public static void createArmy() {
        // Create all objects here
        // 5 Units
        Unit unit1 = new Unit("Falcon");
        Unit unit2 = new Unit("Eagle");
        Unit unit3 = new Unit("Wolf");
        Unit unit4 = new Unit("Lion");
        Unit unit5 = new Unit("Tiger");
        // 3 Knights
        Knight knight1 = new Knight("Saint George");
        Knight knight2 = new Knight("Sir Galahad");
        Knight knight3 = new Knight("Sir William Marshal");
        // 1 General
        General general = new General("Julius Caesar");
        // 1 Doctor
        Doctor doctor = new Doctor("Hippocrates");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}