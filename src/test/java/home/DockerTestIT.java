package home;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class DockerTestIT {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new PhantomJSDriver();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void shouldHaveIndexPage() {
        driver.get("http://192.168.1.79:8888/");
        assertThat(driver.getTitle(), containsString("Apache Tomcat"));
    }
}
