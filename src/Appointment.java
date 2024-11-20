public class Appointment {
    private String patientName;
    private String patientMobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor; // 可以是GeneralPractitioner或Surgeon等子类的对象，这里以HealthProfessional作为基类类型

    // 默认构造函数
    public Appointment() {
    }

    // 第二个构造函数，初始化所有实例变量
    public Appointment(String patientName, String patientMobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobilePhone = patientMobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 获取患者姓名的方法
    public String getPatientName() {
        return patientName;
    }

    // 设置患者姓名的方法
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // 获取患者手机号的方法
    public String getPatientMobilePhone() {
        return patientMobilePhone;
    }

    // 设置患者手机号的方法
    public void setPatientMobilePhone(String patientMobilePhone) {
        this.patientMobilePhone = patientMobilePhone;
    }

    // 获取首选时间段的方法
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    // 设置首选时间段的方法
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    // 获取选定医生的方法
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // 设置选定医生的方法
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
    public void printAllVariables() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile Phone: " + patientMobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor:");
        switch (selectedDoctor) {
            case GeneralPractitioner gp -> gp.printAllVariables();
            case Surgeon s -> s.printAllVariables();
            default -> System.out.println("Unknown doctor type");
        }
    }
}