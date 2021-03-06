package reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreporter {
	static ExtentReports  extent;	
	
	public static ExtentReports getreport()
	{
		String rep_path= System.getProperty("user.dir")+"\\Reports\\Extentreport\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(rep_path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Extentreport");
		reporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Role", "Automation Tester");
		extent.setSystemInfo("Resource", "Prasoon Bhaskaran");
		extent.setSystemInfo("Project", "Selftest Project");
		return extent;
		
	}

}
