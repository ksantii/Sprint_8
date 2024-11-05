
public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверка длины строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверка наличия ровно одного пробела
        int spaceIndex = name.indexOf(' ');
        if (spaceIndex == -1 || spaceIndex != name.lastIndexOf(' ')) {
            return false;
        }

        // Проверка, что пробел не в начале и не в конце
        if (spaceIndex == 0 || spaceIndex == name.length() - 1) {
            return false;
        }

        // Если все условия выполнены, возвращаем true
        return true;
    }
}