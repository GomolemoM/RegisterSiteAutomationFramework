package Way2Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(


//you can specify which feature you want to run, we can also run all features
        features ="src/test/resources/features/",


//show where we can find the implementation regarding the steps in the feature files above
        glue = "Way2Steps",



//if true, it does not really run the steps. it just check if every step on feature files is defined
        dryRun = false,



//tags is similar to go groups in testNG


        monochrome = true,
        plugin = {
                "pretty", //prints gherkin steps in console
                "html:target/cucumber/report.html", //create a basic html report in target folder
                "json:target/cucumber/report.json",
                "message:target/cucumber/failed.message"


        }

)

public class TestRunner {

}
