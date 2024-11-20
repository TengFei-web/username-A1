public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(111, "Dr. Smith", "Chief physician", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(112, "Dr. Johnson", "Deputy Chief Physician", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(113, "Dr. Brown", "Attending", false);

        // 创建两个外科医生对象
        Surgeon s1 = new Surgeon(201, "Dr. Lee", "Chief physician", "Cardiac Surgery");
        Surgeon s2 = new Surgeon(202, "Dr. Wang", "Attending", "Orthopedic Surgery");

        // 打印全科医生对象详细信息
        gp1.GeneralPractitionerprintAllVariables();
        System.out.println("    ");
        gp2.GeneralPractitionerprintAllVariables();
        System.out.println("    ");
        gp3.GeneralPractitionerprintAllVariables();
        System.out.println("    ");

        // 打印外科医生对象详细信息
        s1.SurgeonprintAllVariables();
        System.out.println("    ");
        s2.SurgeonprintAllVariables();
        System.out.println("    ");

        System.out.println("    ");
    }
}
