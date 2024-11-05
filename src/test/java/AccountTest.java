import org.junit.Test;
import static org.junit.Assert.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class AccountTest {

    @Test
    @Description("Проверка валидного имени и фамилии")
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(checkName(account));
    }

    @Test
    @Description("Проверка слишком короткого имени")
    public void testTooShortName() {
        Account account = new Account("Ти");
        assertFalse(checkName(account));
    }

    @Test
    @Description("Проверка слишком длинного имени")
    public void testTooLongName() {
        Account account = new Account("Тимоти Шаламе Тимоти Шаламе");
        assertFalse(checkName(account));
    }

    @Test
    @Description("Проверка имени без пробела")
    public void testNoSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(checkName(account));
    }

    @Test
    @Description("Проверка пробела в начале")
    public void testSpaceAtStart() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(checkName(account));
    }

    @Test
    @Description("Проверка пробела в конце")
    public void testSpaceAtEnd() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(checkName(account));
    }

    @Test
    @Description("Проверка нескольких пробелов")
    public void testMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(checkName(account));
    }

    @Step("Проверка имени: {0}")
    private boolean checkName(Account account) {
        return account.checkNameToEmboss();
    }
}