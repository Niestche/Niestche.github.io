package homework;

import java.util.Scanner;

public class TaxTest {
    public static void main(String[] args) {
        //需求：完成一个个税计算程序，在用户输入入税前工资后，
        //计算出它对应的纳税数额，以及税后工资为多少？
        //分析
        //1.键盘输入税前工资
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的工资：");
        double salary=sc.nextInt();
        double tax=0;
        salary=(salary-salary*0.1);
        //2.扣除三险一金后，判断你的税前工资在哪一梯队。
        //扣除三险一金后，工资在5000之内的
        if(salary<5000){
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);
        }
        //扣除三险一金后，工资在5000~8000之间的
        else if(5000<=salary&&salary<8000){
            tax=(salary-5000)*0.03;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);
        }
        //扣除三险一金后，8000~17000之间的
        else if(8000<=salary&&salary<17000){
            tax=3000*0.03+(salary-5000-3000)*0.1;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }
        //扣除三险一金后，工资在17000~30000之间的
        else if(17000<=salary&&salary<30000){
            tax=3000*0.03+9000*0.1+(salary-5000-12000)*0.2;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }
        //扣除三险一金后，工资在30000~40000之间的
        else if(30000<=salary&&salary<40000){
            tax=3000*0.03+9000*0.1+13000*0.2+(salary-5000-25000)*0.25;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }
        //扣除三险一金后，工资在40000~60000之间的
        else if(40000<=salary&&salary<60000){
            tax=3000*0.03+9000*0.1+13000*0.2+10000*0.25+(salary-5000-40000)*0.3;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }
        //扣除三险一金后，工资在60000~85000之间的
        else if(60000<=salary&&salary<85000){
            tax=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+(salary-5000-60000)*0.35;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }
        //扣除三险一金后，工资在85000之上的
        else {
            tax=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+25000*0.35+(salary-5000-80000)*0.45;
            salary=salary-tax;
            System.out.println("您应缴纳的税款为"+tax);
            System.out.println("您的税后工资为"+salary);

        }

    }
}
