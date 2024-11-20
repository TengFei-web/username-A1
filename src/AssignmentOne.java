import java.util.ArrayList;

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

        // Part 5 – Collection of appointments

        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 创建预约的方法
        createAppointment(appointmentList, "John Doe", "1234567890", "08:00", new GeneralPractitioner(111, "Dr. Smith", "Chief physician", true));
        createAppointment(appointmentList, "Jane Smith", "0987654321", "10:00", new GeneralPractitioner(112, "Dr. Johnson", "Deputy Chief Physician", true));
        createAppointment(appointmentList, "Bob Johnson", "1111111111", "14:30", new Surgeon(201, "Dr. Lee", "Surgery", "Cardiac Surgery"));
        createAppointment(appointmentList, "Alice Brown", "2222222222", "14:30", new Surgeon(202, "Dr. Wang", "Surgery", "Orthopedic Surgery"));

        // 打印现有预约
        printExistingAppointments(appointmentList);

        // 取消一个预约
        cancelBooking(appointmentList, "1234567890");

        // 再次打印现有预约
        printExistingAppointments(appointmentList);

        System.out.println("    ");
    }

    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientMobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, patientMobilePhone, preferredTimeSlot, selectedDoctor);
        appointmentList.add(newAppointment);
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
        if (appointmentList.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointmentList) {
                appointment.printAllVariables();
                System.out.println("    ");
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientMobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientMobilePhone().equals(patientMobilePhone)) {
                appointmentList.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The mobile phone number was not found in the existing appointments.");
        }
    }
}
