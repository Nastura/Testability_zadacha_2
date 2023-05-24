//Входные параметры
//Рост - в метрах
//Вес - в кг

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(1.65F, 75.0F);
        System.out.println(index);
    }
}