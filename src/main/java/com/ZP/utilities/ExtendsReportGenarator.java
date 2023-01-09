package com.ZP.utilities;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReportGenarator {

	public static ExtentReports extent;

	public static ExtentReports extentreprts() {

		String str = "C:\\Users\\mallikarjun\\eclipse-workspace\\ZigWheelsProject\\Reports";

		ExtentSparkReporter reporter = new ExtentSparkReporter(str);

		reporter.config().setDocumentTitle("PS Automation Project");

		reporter.config().setReportName("PS Automation");

		reporter.config().setTheme(Theme.DARK);

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Project Name", "PS Automation");

		extent.setSystemInfo("User Name", "Mallikarjun Sapali");

		extent.setSystemInfo("EmpId", "CZ106");

		extent.setSystemInfo("Environment", "Automation Testing");

		extent.setSystemInfo("State Demo", " All State is Passed");

		return extent;
	}
}