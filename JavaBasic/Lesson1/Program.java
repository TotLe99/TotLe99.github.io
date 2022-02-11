package Lesson1;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //logic

        //create department.
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketting";

        //create position.
        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Trưởng phòng";

        Position position2 = new Position();
        position2.id = 2;
        position2.name = "Nhân viên";

        //create group.
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java";
        group1.createDate = new Date("2020/09/15");

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "C##";
        group2.createDate = new Date("2020/03/29");

        //create account.
        Account account1 = new Account();
        account1.id = 2903;
        account1.fullName = "Lê Văn Tốt";
        account1.email = "totlv@gmail.com";
        account1.department = department1;

        Group[] groupOfAccount1 = { group1, group2 };
        account1.groups = groupOfAccount1;

        account1.createDate = new Date("2021/04/11"); //date.
        account1.gender = Gender.MALE; //enum

        Account account2 = new Account();
        account2.id = 1509;
        account2.fullName = "Nguyễn G";
        account2.email = "ng@gmail.com";
        account2.department = department2;

        Group[] groupOfAccount2 = { group2};
        account2.groups = groupOfAccount2;

        account2.createDate = new Date("2021/03/11");
        account2.gender = Gender.FEMALE;

        Account account3 = new Account();
        account3.id = 1234;
        account3.fullName = "Nguyễn A";
        account3.email = "nga@gmail.com";
        account3.department = department2;

        account2.createDate = new Date("2021/03/16");
        account2.gender = Gender.MALE;

        //In ra
        System.out.println("Thông tin phòng ban 1: ");
        System.out.println("Tên: " + department1.name);
        System.out.println("id: " + department1.id + "\n");

        System.out.println("Thông tin phòng ban 2: ");
        System.out.println("Tên: " +department2.name);
        System.out.println("id: " + department2.id + "\n");

        System.out.println("Tên chức vụ: ");
        System.out.println("PositionID: " +position1.id);
        System.out.println("Position Name: " + position1.name + "\n");
        System.out.println("PositionID: " +position2.id);
        System.out.println("Position Name: " + position2.name + "\n");


        System.out.println("Thông tin Account 1: ");
        System.out.println("id: " +account1.id);
        System.out.println("Name: " + account1.fullName);
        System.out.println("Email: " + account1.email);
        System.out.println("Gender " + account1.gender);
        System.out.println("Department Name: " + department1.name);
        System.out.println("Group: " + groupOfAccount1);
        System.out.println("Creat Date: " + account1.createDate + "\n");

        System.out.println("Thông tin Account 2: ");
        System.out.println("id: " +account2.id);
        System.out.println("Name: " + account2.fullName);
        System.out.println("Email: " + account2.email);
        System.out.println("Gender " + account2.gender);
        System.out.println("Department Name: " + department2.name);
        System.out.println("Creat Date: " + account2.createDate + "\n");

        System.out.println("Thông tin Groups: ");
        System.out.println("GroupID: " + group1.id);
        System.out.println("Tên Group: " +group1.name);
        System.out.println("Người tạo: " + account1.fullName);
        System.out.println("Ngày tạo: " + group1.createDate + "\n");

        System.out.println("GroupID: " + group2.id);
        System.out.println("Tên Group: " +group2.name);
        System.out.println("Người tạo: " + account1.fullName);
        System.out.println("Ngày tạo: " + group2.createDate + "\n");

    }
    
}