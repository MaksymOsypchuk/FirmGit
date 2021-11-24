package views;

import models.Employee;
import utils.Validator;

import java.util.Scanner;

public class EmployeeView {

    Employee model;
    String title;
    double hourlyRate;
    double totalHours;
    Scanner scanner;

    public EmployeeView(Employee model){
        this.model = model;
    }

    public void getInputs(){

        // Создаем экземпляр Scanner
        scanner = new Scanner(System.in);

        // Ввод данных (НЕ ЗАБЫТЬ ДОБАВИТЬ ВАЛИДАЦИЮ!)

        title = "Введите часовую ставку работника: ";
        System.out.print(title);
        model.setHourlyRate(hourlyRate);
    }
}
