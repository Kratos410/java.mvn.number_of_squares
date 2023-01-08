import ru.netology.sgr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        // минимальная граница
        int startOfRange = 150;
        // максимальная граница
        int endOfRange = 696;
        // сколько из их квадратов попали в определённый диапазон чисел
        int total = service.calcNumberOfSquareNumbers(startOfRange, endOfRange);
        System.out.println(total);
    }



}