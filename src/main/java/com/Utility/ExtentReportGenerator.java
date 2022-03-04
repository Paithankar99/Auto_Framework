package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
		public static ExtentReports extent;
		public static ExtentReports getReport() {
		String path="C:\\Users\\HP\\eclipse-workspace\\Auto_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Framework Report Name");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);	
		extent.setSystemInfo("Project", "BS_Batch");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Version build", "3.1.0");
		extent.setSystemInfo("QA", "PQR");
		return extent;
		}
	
	}


