public class Surgeon extends HealthProfessional{
    
    private String surgicalSpecialty;

    public Surgeon() {
    }

    public Surgeon(int ID, String name, String appointment, String surgicalSpecialty) {
        super(ID, name, appointment);
        this.surgicalSpecialty = surgicalSpecialty;
    }

    public String getSurgicalSpecialty() {
        return surgicalSpecialty;
    }

    public void setSurgicalSpecialty(String surgicalSpecialty) {
        this.surgicalSpecialty = surgicalSpecialty;
    }

    public void SurgeonprintAllVariables() {
        super.printAllVariables();
        System.out.println("Surgical Specialty: " + surgicalSpecialty);
        System.out.println("Health Professional Type: Surgeon");
    }
}