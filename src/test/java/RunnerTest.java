import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { "src/test/java" },
    tags = ("@TEST"),
    stepNotifications = true,
    publish = true
)
public class RunnerTest {}
