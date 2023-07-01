package org.automation.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generalExtentReport() {
		ExtentReports extentReport=new ExtentReports();
		File extentReportFile = new File(System.getProperty("user.dir")+ "\\test-output\\extentReports\\extentAzureDevOps.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Azure DevOps Test Automation Report");
		sparkReporter.config().setDocumentTitle("Azure DevOps Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/mm/yyyy hh:mm:ss");
		extentReport.attachReporter(sparkReporter);
			extentReport.setSystemInfo("Operating System ", System.getProperty("os.name"));
			extentReport.setSystemInfo("Java Version ", System.getProperty("java.version"));
			return extentReport;
		
	}

}
