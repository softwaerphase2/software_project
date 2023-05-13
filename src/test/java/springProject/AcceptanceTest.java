package springProject;

import org.junit.runner. RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.core.snippets.SnippetType;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith (Cucumber.class)

@CucumberOptions (
		features = "uses_cases",
		plugin = { "summary", "html:target/cucumber/wikipedia.html"},
		monochrome = true,
		glue = "springProject",
		
		snippets = CAMELCASE
		
		)

public class AcceptanceTest {

}
/*import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CAMELCASE)
public class AcceptanceTest {

}*/