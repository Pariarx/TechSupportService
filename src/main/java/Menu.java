
import entityes.Master;
import repos.EmployeeRepo;
import repos.MasterRepo;
import repos.Resources;
import repos.WorkTypeRepo;
import java.util.Scanner;

public class Menu {
    static EmployeeRepo employees=new EmployeeRepo();

    static MasterRepo masters=new MasterRepo();

    static WorkTypeRepo works=new WorkTypeRepo();

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
            while(true) {
                method();
                System.out.println("Нужно ли еще провести какую-то работу да/нет");
                String check = scanner.next();
                if (!check.equals("да"))
                    break;
            }


         }

    public static void method(){

        EmployeeRepo employees=new EmployeeRepo();

        MasterRepo masters=new MasterRepo();

        WorkTypeRepo works=new WorkTypeRepo();

        Scanner scanner=new Scanner(System.in);
        int numberEmp=2;
        while(!employees.getEmployees().get(numberEmp-1).isStatus()) {
            System.out.println(Resources.BLUE + "Выберете оператора, к которому нужно позвонить: " + Resources.RESET);
            System.out.println(employees);
            numberEmp = scanner.nextInt();
            if(!employees.getEmployees().get(numberEmp-1).isStatus())
                System.out.println(Resources.RED+"Данный оператор занят, выберете другого: "+Resources.RESET);
        }
        System.out.println(Resources.BLUE +"Введите имя заказчика: "+Resources.RESET);
        String name=scanner.next();
        System.out.println(Resources.BLUE +"Введите номер аудитории, где нужно провести работы: "+Resources.RESET);
        String numberA=scanner.next();
        System.out.println(Resources.BLUE +"Выберете вид работы который нужно провести"+Resources.RESET);
        System.out.println(works);
        int numberOfWork=scanner.nextInt();
        Master master=null;
        int s=0;
        for(int i=0;i<masters.getMasters().size();i++){
            if(masters.getMasters().get(i).isStatus()) {
                master = masters.getMasters().get(i);
                s=i;
            }
            masters.getMasters().remove(s);
        }
        System.out.println(Resources.BLUE+"Чек заявки: "+Resources.RESET);
        assert master != null;
        System.out.printf("""
                %s
                Имя заказчика: %s, номер аудитории: %s
                Оператор: %s %s
                Мастер: %s
                Вид работ: %s %s
                Время выполнения: %s мин.
                %s""",Resources.PURPLE,name,numberA,employees.getEmployees().get(numberEmp-1).getFio(),Resources.PURPLE,master.getFio(),works.getWorkTypes().get(numberOfWork-1).getWorkName(),Resources.PURPLE,works.getWorkTypes().get(numberOfWork-1).getWorkTime(),Resources.RESET);

    }
}
