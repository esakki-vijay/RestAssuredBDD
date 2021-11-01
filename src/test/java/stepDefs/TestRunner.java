package stepDefs;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = { "src/test/resources/Features" }, 
		glue = { "stepDefs" }, 
		plugin = { "pretty", "html:target/HtmlReports.html"},
		monochrome = true
	//	tags = "@smoke"
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
