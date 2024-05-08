package RunnerPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BasePackage.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (features = "src\\test\\java\\FeaturePackage\\Luma.feature",glue = "StepPackage",dryRun = false,publish = true,
					plugin = {"html:target\\Report1.html","json:target\\repart2.json"})
public class RunnerClass extends BaseClass{
	@BeforeClass
	public static void start() {
		
		BrowserLanuch();
		maximise();
	}
	@AfterClass
	public static void end() {
		
		quit();
	}

}
