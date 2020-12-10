public class BackSystem {
    private static long bankBalance = 100;

    public static synchronized void handleRequest(Request request){
        System.out.println();
        System.out.println("ЗАЯВКА. КЛИЕНТ: " + request.clientName + "; ТИП ЗАПРОСА: "
            + request.type.toString() + "; СУММА: " + request.sum);
        System.out.print("Итог: ");

        if (request.type == RequestType.GET){
            if (bankBalance >= request.sum){
                bankBalance -= request.sum;
                System.out.println("Операция выполнена. Баланс банка: "+bankBalance);
            }
            else{
                System.out.println("У банка нет столько денег. Запрос отклонён.");
            }
        }

        if (request.type == RequestType.GIVE){
            bankBalance += request.sum;
            System.out.println("Операция выполнена. Баланс банка: "+bankBalance);
        }
    }
}
