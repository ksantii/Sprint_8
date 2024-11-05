public class Praktikum {

    public static void main(String[] args) {
        // Создаем переменную с именем и фамилией
        String fullName = "Тимоти Шаламе";

        // Создаем экземпляр класса Account
        Account account = new Account(fullName);

        // Проверяем, можно ли использовать имя и фамилию для печати на карте
        boolean canEmboss = account.checkNameToEmboss();

        // Выводим результат
        if (canEmboss) {
            System.out.println("Имя и фамилия подходят для печати на карте.");
        } else {
            System.out.println("Имя и фамилия не подходят для печати на карте.");
        }
    }
}