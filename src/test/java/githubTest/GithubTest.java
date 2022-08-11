package githubTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.collections.ItemWithText;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest {
    @BeforeAll
    static void configure() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void openComparePlans() {
        open("https://github.com/");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $$(byClassName("h2-mktg")).shouldHave(new ItemWithText("Choose the plan that’s right for you."));

    }

    @AfterAll
    static void closing() {
        closeWebDriver();
    }

}
