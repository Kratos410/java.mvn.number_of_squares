import ru.netology.sgr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int startOfRange = 150;
        int endOfRange =696;
        int rt = service.calcNumberOfSquareNumbers(startOfRange, endOfRange);
        System.out.println(rt);
    }



}