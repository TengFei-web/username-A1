class GeneralPractitioner extends HealthProfessional{
    private boolean canTreatAllAges;
    public GeneralPractitioner(){

    }
        public GeneralPractitioner(int ID, String name, String appointment, boolean canTreatAllAges) {
            super(ID, name, appointment);
            this.canTreatAllAges = canTreatAllAges;
        }
    
        public boolean isCanTreatAllAges() {
            return canTreatAllAges;
        }
    
        public void setCanTreatAllAges(boolean canTreatAllAges) {
            this.canTreatAllAges = canTreatAllAges;
        }

        public void GeneralPractitionerprintAllVariables() {
            super.printAllVariables();
            System.out.println("Can Treat All Ages: " + canTreatAllAges);
            System.out.println("Health Professional Type: General Practitioner");
        }
    }