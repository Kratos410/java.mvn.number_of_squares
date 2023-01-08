import ru.netology.sgr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        // минимальное значение
        int startOfRange = 150;
        // максимальное значение
        int endOfRange = 696;
        // из чисел от 10 до 99, сколько их квадратов в сумме  попали в  диапазон чисел между минимальным и максимальным значением.
        int total = service.calcNumberOfSquareNumbers(startOfRange, endOfRange);
        System.out.println(total);
    }



}