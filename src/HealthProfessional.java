public class HealthProfessional {
    private int ID;
    private String name;
    private String appointment; // 与描述基本信息相关的另一个实例变量

    // 默认构造函数
    public HealthProfessional() {
    }

    // 初始化所有实例变量的构造函数
    public HealthProfessional(int ID, String name, String appointment) {
        this.ID = ID;
        this.name = name;
        this.appointment = appointment;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;

    }

    public String getAppointment(){
        return appointment;
    }
    
    public void setAppointment(String appointment){
        this.appointment=appointment;
    }

    // 打印所有实例变量的方法
    public void printAllVariables() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Appointment: " + appointment);
    }
}

