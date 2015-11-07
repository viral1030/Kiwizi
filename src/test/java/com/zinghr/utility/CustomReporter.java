package com.zinghr.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import org.testng.IInvokedMethod;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.collections.Lists;
import org.testng.internal.Utils;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;

import com.zinghr.init.SeleniumInit;

public class CustomReporter extends CustomReporterListener
{
	
	 private static final Logger L = Logger.getLogger(CustomReporterListener.class);

	    // ~ Instance fields ------------------------------------------------------

	    private PrintWriter m_out;

	    private int m_row;
	    
	    private int failedCounter = 0;

	    private Integer m_testIndex;

	    private int m_methodIndex;

	    private Scanner scanner;
	    
	    int passed = 0;
	    int total = 0;
	    
	    
	    private static HashMap<String, String> map = new HashMap<String,String>();

	    // ~ Methods --------------------------------------------------------------

	    
	   /* public static void maperrors() {
		
	    	System.out.println("In Error mapping..............*************************3465768487488............");
			map.put("org.openqa.selenium.remote.UnreachableBrowserException: Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure. ", "Server or Node is not running.");
			map.put("Timed out after 20 seconds waiting for visibility of Proxy element", "Particular Element is not found on page after 20 second waiting can be due to Page is not loaded completely OR Element is Not found on page");
			map.put("Unable to locate the element", "Particular Element is not located on page can be due to Page is not loaded completely OR Element is Not found on page");
			map.put("no such element", "element could not be found.  you may want to check : 1.Check your xpath in automation code. 2.Element may not present on the screen.");
			map.put("Unable to bind to locking port 7054 within 45000 ms", "Port is already locked by other browser and may not be free.");
			map.put("Unexpected error launching Internet Explorer", "Unable to launch IE.");
			map.put("Unable to find element on closed window", "Browser window may closed unexpectedly.");
			map.put("Error communicating with the remote browser.", "remote browser may have died.");
			map.put("Unable to locate element: {\"method\":\"xpath\",\"selector\":", "xpath of the particular element getting changed OR Page is not loaded completely.");
			map.put("Error forwarding the new session Error forwarding the request Connect to", "Connection may be refused by the node/server.");
	    }
*/
	  
		public CustomReporter() {
			super();
			map.put("Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure.", "Server or Node is not running.");
			map.put("Timed out after 35 seconds waiting for visibility of Proxy element", "Particular Element is not located on page. 1.Page is not loaded completely 2. Element is Not found on page 3. Possibility for \"BUG\"");
			map.put("Unable to locate", "Particular Element is not located on page. Either Page is not loaded completely OR Element is Not found on page");
			map.put("no such element", "element could not be found.  Check Possibility: 1.Update automation code. 2.Element may not present on the screen. 3.Possibility for \"BUG\"");
			map.put("Unable to bind to locking port 7054 within 45000 ms", "Port is already locked by other browser and may not be free.Please restart selenium node and server");
			map.put("Unexpected error launching Internet Explorer", "Unable to launch IE.");
			map.put("Unable to find element on closed window", "Browser window may closed unexpectedly. This will fix automatically on next run");
			map.put("Error communicating with the remote browser.", "remote browser may have died. Please restart selenium node and server");
			map.put("Unable to locate element: {\"method\":\"xpath\",\"selector\":", "xpath of the particular element getting changed OR Page is not loaded completely.");
			map.put("Error forwarding the new session Error forwarding the request Connect to", "Connection may be refused by the node/server. Please restart selenium node and server");
			map.put("element not visible", "Element is not found on page : 1.Update automation code. 2.Element may not present on the screen.");
			map.put("Timed out after 35 seconds waiting for visibility of [[AppiumDriver:", "Particular Element is not located on page. 1.Page is not loaded completely 2. Element is Not found on page 3. Possibility for \"BUG\"");
		
		}

		/**
		 * 
		 *  Creates summary of the run 
		 */
	    @Override
	    public void generateReport(List<XmlSuite> xml, List<ISuite> suites,
	            String outdir) {
	        try {
	            m_out = createWriter(outdir);
	        } catch (IOException e) {
	            L.error("output file", e);
	            return;
	        }

	        startHtml(m_out);
	        //generateSuiteSummaryReport(suites);
	        TotalTime(suites);
	        generateMethodSummaryReport(suites);
	       
	        //generateMethodDetailReport(suites);
	        endHtml(m_out);
	        m_out.flush();
	        m_out.close();
	    }

	    String Time;
	    public String TotalTime(List<ISuite> suites)
		{
		   long time_start = Long.MAX_VALUE;
           long time_end = Long.MIN_VALUE;
           ITestContext overview = null;
           
           for (ISuite suite : suites) {
        	   Map<String, ISuiteResult> itests = suite.getResults();
        	   for (ISuiteResult r : itests.values()) {
        		   overview = r.getTestContext();
        		   time_start = Math.min(overview.getStartDate().getTime(),
        				   			time_start);
        		   time_end = Math.max(overview.getEndDate().getTime(), time_end);
        	   	   }
           	}
	          // m_out.println("</tr><td  class=\"numi\"><center>"+((time_end - time_start) / 1000.) / 60.+"</center></td> </tr>");
	           NumberFormat formatter = new DecimalFormat("#,##0.0");
	           Time = String.valueOf(formatter.format(((time_end - time_start) / 1000.) / 60.));
	           
	           return Time;
		   }
	    
	    protected PrintWriter createWriter(String outdir) throws IOException {
	        //java.util.Date now = new Date();
	        new File(outdir).mkdirs();
	        return new PrintWriter(new BufferedWriter(new FileWriter(new File(
	                outdir, "KiwiQA-Customize-Report"
	                        + ".html"))));
	    }

	    /**
	     * Creates a table showing the highlights of each test method with links to
	     * the method details
	     *  @param suites
	     */
	    protected void generateMethodSummaryReport(List<ISuite> suites) {
	        m_methodIndex = 0;
	        startResultSummaryTable("methodOverview");
	        int testIndex = 1;
	        for (ISuite suite : suites) {
	            if (suites.size() > 1) {
	                titleRow(suite.getName(), 5);
	            }
	            Map<String, ISuiteResult> r = suite.getResults();
	            for (ISuiteResult r2 : r.values()) {
	                ITestContext testContext = r2.getTestContext();
	                String testName = testContext.getName();
	                m_testIndex = testIndex;
	                resultSummary_passed(suite, testContext.getPassedTests());
	                
	                resultSummary(suite, testContext.getFailedConfigurations(),
	                        testName, "failed", " (configuration methods)");
	                resultSummary(suite, testContext.getFailedTests(), testName,
	                        "failed", "");
	                /*resultSummary(suite, testContext.getSkippedConfigurations(),
	                        testName, "skipped", " (configuration methods)");
	                resultSummary(suite, testContext.getSkippedTests(), testName,
	                        "skipped", "");
	                resultSummary(suite, testContext.getPassedTests(), testName,
	                        "passed", "");*/
	                
	                testIndex++;
	                
	            }
	        }
	        testCaseNo();
	        m_out.println("</table>");
	    }
	    
	    public void testCaseNo() {

	    	  m_out.println("<td bgcolor='#99CCFF' colspan='4' align='left' height='30px'><h3 style='margin-top:0px;margin-bottom:0px;'> Total Test Cases  : "
	    	    + (failedCounter + passed) + "</br> Failed Test Cases  : "
	    	    + (failedCounter) + "</br> Passed Test cases : " 
	    	    + passed+ "</br></h3></td>");

	    	 }
	    
	    private void resultSummary_passed(ISuite suite, IResultMap tests) {
	    	  System.out.println("passed count : " + passed);
	    	  for (ITestNGMethod method : getMethodSet(tests, suite)) {
	    	   passed++;

	    	  }
	    	 }

	    /**
	     *  Creates a section showing known results for each method 
	     *  
	     */
	    protected void generateMethodDetailReport(List<ISuite> suites) {
	        m_methodIndex = 0;
	        for (ISuite suite : suites) {
	            Map<String, ISuiteResult> r = suite.getResults();
	            for (ISuiteResult r2 : r.values()) {
	                ITestContext testContext = r2.getTestContext();
	                if (r.values().size() > 0) {
	                    m_out.println("<h1>" + testContext.getName() + "</h1>");
	                }
	                resultDetail(testContext.getFailedConfigurations());
	                resultDetail(testContext.getFailedTests());
	                /*resultDetail(testContext.getSkippedConfigurations());
	                resultDetail(testContext.getSkippedTests());
	                resultDetail(testContext.getPassedTests());*/
	            }
	        }
	    }

	    /**
	     * @param tests
	     */
	    int namecount=0;
	    
	    private void resultSummary(ISuite suite, IResultMap tests, String testname,
	            String style, String details) {
	    	
	        if (tests.getAllResults().size() > 0) {
	        	
	            StringBuffer buff = new StringBuffer();
	            String lastClassName = "";
	            int mq = 0;
	            int cq = 0;
	            for (ITestNGMethod method : getMethodSet(tests, suite)) {
	                m_row += 1;
	                m_methodIndex += 1;
	                ITestClass testClass = method.getTestClass();
	                String className = testClass.getName();
	               // if (mq == 0)
	                {
	                    String id = (m_testIndex == null ? null : "t"
	                            + Integer.toString(m_testIndex));
	                    //titleRow(testname + " &#8212; " + style + details, 5, id);
	                    //
	                    
	                    
	                    m_out.print("<tr");
	        	        if (id != null) {
	        	            m_out.print(" id=\"" + id + "\"");
	        	        }
	        	        m_out.println("><td><b>" + testname + "</b></td>");
	        	        m_row = 0;
	                    
	                    
	                    //
	                    m_testIndex = null;
	                    namecount++;
	                    failedCounter++;
	                }
	                
	               /* if (!className.equalsIgnoreCase(lastClassName)) {
	                    if (mq > 0) {
	                        cq += 1;
	                        m_out.print("<tr class=\"" + style
	                                + (cq % 2 == 0 ? "even" : "odd") + "\">"
	                                + "<td");
	                        if (mq > 1) {
	                            m_out.print(" rowspan=\"" + mq + "\"");
	                        }
	                        m_out.println(">" + lastClassName + "</td>" + buff);
	                       
	                    }
	                    mq = 0;
	                    buff.setLength(0);
	                    lastClassName = className;
	                }*/
	                Set<ITestResult> resultSet = tests.getResults(method);
	                long end = Long.MIN_VALUE;
	                long start = Long.MAX_VALUE;
	                for (ITestResult testResult : tests.getResults(method)) {
	                    if (testResult.getEndMillis() > end) {
	                        end = testResult.getEndMillis();
	                    }
	                    if (testResult.getStartMillis() < start) {
	                        start = testResult.getStartMillis();
	                    }
	                }
	                mq += 1;
	                if (mq > 1) {
	                  /*  buff.append("<tr class=\"" + style
	                            + (cq % 2 == 0 ? "odd" : "even") + "\">");*/
	                }
	                
	                if (mq > 0) {
		                cq += 1;
		                /*m_out.print("<td");
		                if (mq > 1) {
		                    m_out.print(" rowspan=\"" + mq + "\"");
		                }
		                m_out.println(">" + lastClassName + "</td>");*/
		                
		               
			               getShortException(tests);
		                    
		                    
		            }
	                
	                String description = method.getDescription();
	                String testInstanceName = resultSet
	                        .toArray(new ITestResult[] {})[0].getTestName();
	              /*  buff.append("<td class=\"numi\"><center>"
	                        + (end - start)/1000 + "</center></td>" + "</tr>"
	                        );*/
	                m_out.println("<td class=\"numi\"><center>"
	                        + (end - start)/1000 + "</center></td>" + "</tr>");
	                
	               
	               
	            }
	           /* if (mq > 0) {
	                cq += 1;
	                m_out.print("<tr class=\"" + style
	                        + (cq % 2 == 0 ? "even" : "odd") + "\">" + "<td");
	                if (mq > 1) {
	                    m_out.print(" rowspan=\"" + mq + "\"");
	                }
	                m_out.println(">" + lastClassName + "</td>" + buff);
	            }
	            */
	            //
	            
	           
	        }      
	    }

	    /** 
	     * Starts and defines columns result summary table 
	     * 
	     */
	    private void startResultSummaryTable(String style) {
	        tableStart(style, "summary");
	        Date date = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a z,MM/dd/yyyy");
	      
	        
	       
	        
	        m_out.println("<tr><td colspan='4'><center><h2>Failed Test Cases Analysis</h2></center></td></tr>");
		    // m_out.println("<tr><td colspan='4'>To view Full Report : <a href=\"http://52.0.218.82:8080/job/dev2_Pley_Chrome/HTML_Report/\">http://52.0.218.82:8080/job/dev2_Pley_Chrome/HTML_Report</a></td></tr>");
		    m_out.println("<tr><td colspan='4'>Overall test suite completion : <b>"+Time+" minutes</b></br> Date and Time of Run: <b>"+sdf.format(date)+"</b></br> Browser Name : <b>"+SeleniumInit.browserName+"</b></br> Browser Version: <b>"+SeleniumInit.browserVersion+"</b> </br>OS: <b>"+SeleniumInit.osName+"</b></td></tr>");
		    m_out.println("<tr bgcolor='grey'><th>Test Cases</th>"
		                + "<th>Failure Reason</th><th>Failure Error</th><th>Total Time<br/>(sec.)</th></tr>");
		    m_row = 0;
	    }

	    private String qualifiedName(ITestNGMethod method) {
	        StringBuilder addon = new StringBuilder();
	        String[] groups = method.getGroups();
	        int length = groups.length;
	        if (length > 0 && !"basic".equalsIgnoreCase(groups[0])) {
	            addon.append("(");
	            for (int i = 0; i < length; i++) {
	                if (i > 0) {
	                    addon.append(", ");
	                }
	                addon.append(groups[i]);
	            }
	            addon.append(")");
	        }

	        return "<b>" + method.getMethodName() + "</b> " + addon;
	    }

	    private void resultDetail(IResultMap tests) {
	        for (ITestResult result : tests.getAllResults()) {
	            ITestNGMethod method = result.getMethod();
	            m_methodIndex++;
	            String cname = method.getTestClass().getName();
	            m_out.println("<h2 id=\"m" + m_methodIndex + "\">" + cname + ":"
	                    + method.getMethodName() + "</h2>");
	            Set<ITestResult> resultSet = tests.getResults(method);
	            generateForResult(result, method, resultSet.size());
	            m_out.println("<p class=\"totop\"><a href=\"#summary\">back to summary</a></p>");

	        }
	    }

	    /**
	     * Write the first line of the stack trace
	     * 
	     * @param tests
	     */
	    private void getShortException(IResultMap tests) {

	        for (ITestResult result : tests.getAllResults()) {
	            m_methodIndex++;
	            Throwable exception = result.getThrowable();
	            List<String> msgs = Reporter.getOutput(result);
	            boolean hasReporterOutput = msgs.size() > 0;
	            boolean hasThrowable = exception != null;
	            if (hasThrowable) {
	            	
	            	 String str = Utils.stackTrace(exception, true)[0];
	            	 scanner = new Scanner(str);
		                String firstLine = scanner.nextLine();
		                
		                
	            	 m_out.println("<td>");
	            	 for (Entry<String, String> e : map.entrySet()) {
	            		
	            		 if (firstLine.contains(e.getKey())) {
	            				//m_out.print(map.get(str));
	            				//m_out.print("contains </br>");
		                		m_out.print(e.getValue()+"</br>");
	            		   }else{
		                		//m_out.print("Not contains </br>");
		                		//m_out.print(str+"</br>");
	            		   }
	            		 }
	            	 
	            	 m_out.println("</td>");
	            	 
	            		
		                /*	if(map.containsKey(str))
		                	{
		                		m_out.print(map.get(str));
		                	}else{
		                		m_out.print("Not contains");
		                		m_out.print(str);
		                	}*/
		                	
		               
	            	 
	            	 m_out.println("<td>");
	                boolean wantsMinimalOutput = result.getStatus() == ITestResult.SUCCESS;
	                if (hasReporterOutput) {
	                    m_out.print("<h3>"
	                            + (wantsMinimalOutput ? "Expected Exception"
	                                    : "Failure") + "</h3>");
	                }

	                // Getting first line of the stack trace
	               
	               
	               
	                m_out.println(firstLine);
	                m_out.println("</td>");
	            }
	         
	           
	        }
	    }

	    /**
	     * Write all parameters
	     * 
	     * @param tests
	     */
	    private void getParameters(IResultMap tests) {

	        for (ITestResult result : tests.getAllResults()) {
	            m_methodIndex++;
	            Object[] parameters = result.getParameters();
	            boolean hasParameters = parameters != null && parameters.length > 0;
	            if (hasParameters) {

	                for (Object p : parameters) {
	                    m_out.println(Utils.escapeHtml(Utils.toString(p)) + " | ");
	                }
	            }

	        }
	    }

	    private void generateForResult(ITestResult ans, ITestNGMethod method,
	            int resultSetSize) {
	        Object[] parameters = ans.getParameters();
	        boolean hasParameters = parameters != null && parameters.length > 0;
	        if (hasParameters) {
	            tableStart("result", null);
	            m_out.print("<tr class=\"param\">");
	            for (int x = 1; x <= parameters.length; x++) {
	                m_out.print("<th>Param." + x + "</th>");
	            }
	            m_out.println("</tr>");
	            m_out.print("<tr class=\"param stripe\">");
	            for (Object p : parameters) {
	                m_out.println("<td>" + Utils.escapeHtml(Utils.toString(p))
	                        + "</td>");
	            }
	            m_out.println("</tr>");
	        }
	        List<String> msgs = Reporter.getOutput(ans);
	        boolean hasReporterOutput = msgs.size() > 0;
	        Throwable exception = ans.getThrowable();
	        boolean hasThrowable = exception != null;
	        if (hasReporterOutput || hasThrowable) {
	            if (hasParameters) {
	                m_out.print("<tr><td");
	                if (parameters.length > 1) {
	                    m_out.print(" colspan=\"" + parameters.length + "\"");
	                }
	                m_out.println(">");
	            } else {
	                m_out.println("<div>");
	            }
	            if (hasReporterOutput) {
	                if (hasThrowable) {
	                    m_out.println("<h3>Test Messages</h3>");
	                }
	                for (String line : msgs) {
	                    m_out.println(line + "<br/>");
	                }
	            }
	            if (hasThrowable) {
	                boolean wantsMinimalOutput = ans.getStatus() == ITestResult.SUCCESS;
	                if (hasReporterOutput) {
	                    m_out.println("<h3>"
	                            + (wantsMinimalOutput ? "Expected Exception"
	                                    : "Failure") + "</h3>");
	                }
	                generateExceptionReport(exception, method);
	            }
	            if (hasParameters) {
	                m_out.println("</td></tr>");
	            } else {
	                m_out.println("</div>");
	            }
	        }
	        if (hasParameters) {
	            m_out.println("</table>");
	        }
	    }

	    protected void generateExceptionReport(Throwable exception,
	            ITestNGMethod method) {
	        m_out.print("<div class=\"stacktrace\">");
	        m_out.print(Utils.stackTrace(exception, true)[0]);
	        m_out.println("</div>");
	    }

	    /**
	     * Since the methods will be sorted chronologically, we want to return the
	     * ITestNGMethod from the invoked methods.
	     */
	    private Collection<ITestNGMethod> getMethodSet(IResultMap tests,
	            ISuite suite) {
	        List<IInvokedMethod> r = Lists.newArrayList();
	        List<IInvokedMethod> invokedMethods = suite.getAllInvokedMethods();
	        for (IInvokedMethod im : invokedMethods) {
	            if (tests.getAllMethods().contains(im.getTestMethod())) {
	                r.add(im);
	            }
	        }
	        Arrays.sort(r.toArray(new IInvokedMethod[r.size()]), new TestSorter());
	        List<ITestNGMethod> result = Lists.newArrayList();

	        // Add all the invoked methods
	        for (IInvokedMethod m : r) {
	            result.add(m.getTestMethod());
	        }

	        // Add all the methods that weren't invoked (e.g. skipped) that we
	        // haven't added yet
	        for (ITestNGMethod m : tests.getAllMethods()) {
	            if (!result.contains(m)) {
	                result.add(m);
	            }
	        }
	        return result;
	    }

	    @SuppressWarnings("unused")
	    public void generateSuiteSummaryReport(List<ISuite> suites) {
	        tableStart("testOverview", null);
	        m_out.print("<tr>");
	        tableColumnStart("Test");
	        tableColumnStart("Methods<br/>Passed");
	        tableColumnStart("Scenarios<br/>Passed");
	        tableColumnStart("# skipped");
	        tableColumnStart("# failed");
	        tableColumnStart("Error messages");
	        tableColumnStart("Parameters");
	        tableColumnStart("Start<br/>Time");
	        tableColumnStart("End<br/>Time");
	        tableColumnStart("Total<br/>Time");
	        tableColumnStart("Included<br/>Groups");
	        tableColumnStart("Excluded<br/>Groups");

	        m_out.println("</tr>");
	        NumberFormat formatter = new DecimalFormat("#,##0.0");
	        int qty_tests = 0;
	        int qty_pass_m = 0;
	        int qty_pass_s = 0;
	        int qty_skip = 0;
	        int qty_fail = 0;
	        long time_start = Long.MAX_VALUE;
	        long time_end = Long.MIN_VALUE;
	        m_testIndex = 1;
	        for (ISuite suite : suites) {
	            if (suites.size() > 1) {
	                titleRow(suite.getName(), 8);
	            }
	            Map<String, ISuiteResult> tests = suite.getResults();
	            for (ISuiteResult r : tests.values()) {
	                qty_tests += 1;
	                ITestContext overview = r.getTestContext();
	               IResultMap irm =  overview.getFailedTests();
	               
	                startSummaryRow(overview.getName());
	                
	               /* int q = getMethodSet(overview.getPassedTests(), suite).size();
	                qty_pass_m += q;
	                summaryCell(q, Integer.MAX_VALUE);
	                q = overview.getPassedTests().size();
	                qty_pass_s += q;
	                summaryCell(q, Integer.MAX_VALUE);
	                q = getMethodSet(overview.getSkippedTests(), suite).size();
	                qty_skip += q;
	                summaryCell(q, 0);*/
	               int q = getMethodSet(overview.getFailedTests(), suite).size();
	                qty_fail += q;
	                summaryCell(q, 0);

	                // NEW
	                // Insert error found
	                m_out.print("<td class=\"numi" + (true ? "" : "_attn") + "\">");
	                getShortException(overview.getFailedTests());
	                getShortException(overview.getSkippedTests());
	                m_out.println("</td>");

	                // NEW
	                // Add parameters for each test case (failed or passed)
	                m_out.print("<td class=\"numi" + (true ? "" : "_attn") + "\">");

	                // Write OS and Browser
	                // m_out.println(suite.getParameter("os").substring(0, 3) +
	                // " | "
	                // + suite.getParameter("browser").substring(0, 3) + " | ");

	                getParameters(overview.getFailedTests());
//	                getParameters(overview.getPassedTests());
//	                getParameters(overview.getSkippedTests());
	                m_out.println("</td>");

	                Date dt = new Date();
	                // NEW
	                summaryCell(dt.toString()
	                        ,
	                        true);
	                m_out.println("</td>");
	                summaryCell(
	                		dt.toString(),
	                        true);
	                m_out.println("</td>");

	                time_start = Math.min(overview.getStartDate().getTime(),
	                        time_start);
	                time_end = Math.max(overview.getEndDate().getTime(), time_end);
	                summaryCell(
	                        formatter.format((overview.getEndDate().getTime() - overview
	                                .getStartDate().getTime()) / 1000.)
	                                + " seconds", true);
	                summaryCell(overview.getIncludedGroups());
	                summaryCell(overview.getExcludedGroups());
	                m_out.println("</tr>");
	                m_testIndex++;
	            }
	        }
	        if (qty_tests > 1) {
	            m_out.println("<tr class=\"total\"><td>Total</td>");
	            summaryCell(qty_pass_m, Integer.MAX_VALUE);
	            summaryCell(qty_pass_s, Integer.MAX_VALUE);
	            summaryCell(qty_skip, 0);
	            summaryCell(qty_fail, 0);
	            summaryCell(" ", true);
	            summaryCell(" ", true);
	            summaryCell(" ", true);
	            summaryCell(" ", true);
	            summaryCell(
	                    formatter.format(((time_end - time_start) / 1000.) / 60.)
	                            + " minutes", true);
	            m_out.println("<td colspan=\"3\">&nbsp;</td></tr>");
	        }
	        m_out.println("</table>");
	    }

	    private void summaryCell(String[] val) {
	        StringBuffer b = new StringBuffer();
	        for (String v : val) {
	            b.append(v + " ");
	        }
	        summaryCell(b.toString(), true);
	    }

	    private void summaryCell(String v, boolean isgood) {
	        m_out.print("<td class=\"numi" + (isgood ? "" : "_attn") + "\">" + v
	                + "</td>");
	    }

	    private void startSummaryRow(String label) {
	        m_row += 1;
	        m_out.print("<tr"
	                + (m_row % 2 == 0 ? " class=\"stripe\"" : "")
	                + "><td style=\"text-align:left;padding-right:2em\"><a href=\"#t"
	                + m_testIndex + "\">" + label + "</a>" + "</td>");
	    }

	    private void summaryCell(int v, int maxexpected) {
	        summaryCell(String.valueOf(v), v <= maxexpected);
	    }

	    private void tableStart(String cssclass, String id) {
	        m_out.println("<table border=\"5\" cellspacing=\"0\" cellpadding=\"0\""
	                + (cssclass != null ? " class=\"" + cssclass + "\""
	                        : " ")
	                + (id != null ? " id=\"" + id + "\"" : "") + ">");
	        m_row = 0;
	    }

	    private void tableColumnStart(String label) {
	        m_out.print("<th>" + label + "</th>");
	    }

	    private void titleRow(String label, int cq) {
	        titleRow(label, cq, null);
	    }

	    private void titleRow(String label, int cq, String id) {
	        m_out.print("<tr");
	        if (id != null) {
	            m_out.print(" id=\"" + id + "\"");
	        }
	        m_out.println("><th colspan=\"" + cq + "\">" + label + "</th></tr>");
	        m_row = 0;
	    }

	    /** Starts HTML stream */
	    protected void startHtml(PrintWriter out) {
	        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">");
	        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
	        out.println("<head>");
	        out.println("<title>KiwiQA - TestNG Report</title>");
	        out.println("<style type=\"text/css\">");
	        out.println("table {margin-bottom:1px;border-collapse:collapse;empty-cells:show}");
	        out.println("td,th {solid #009;padding:.25em .5em;}");
	        out.println(".result th {vertical-align:bottom}");
	        out.println(".param th {padding-left:1em;padding-right:1em}");
	        out.println(".param td {padding-left:.5em;padding-right:2em}");
	        out.println(".stripe td,.stripe th {background-color: #E6EBF9}");
	        out.println(".numi,.numi_attn {text-align:right}");
	        out.println(".total td {font-weight:bold}");
	        out.println(".passedodd td {background-color: #0A0}");
	        out.println(".passedeven td {background-color: #3F3}");
	        out.println(".skippedodd td {background-color: #CCC}");
	        out.println(".skippedodd td {background-color: #DDD}");
	        out.println(".failedodd td,.numi_attn {background-color: #F9C1C1}");
	        out.println(".failedeven td,.stripe .numi_attn {background-color: #F9C1C1}");
	        out.println(".stacktrace {white-space:pre;font-family:monospace}");
	        out.println(".totop {font-size:85%;text-align:center;border-bottom:2px solid #000}");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");
	    }

	    /** Finishes HTML stream */
	    protected void endHtml(PrintWriter out) {
	        out.println("<center> Report customized by KiwiQA </center></br></br>");
	        out.println("</body></html>");
	    }

	    // ~ Inner Classes --------------------------------------------------------
	    /** Arranges methods by classname and method name */
	    
	    private class TestSorter implements Comparator<IInvokedMethod>
	    {

	    	
	    	
			public int compare(IInvokedMethod o1, IInvokedMethod o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getDate()-o2.getDate());
			
			}

			public Comparator<IInvokedMethod> reversed() {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<IInvokedMethod> thenComparing(
					Comparator<? super IInvokedMethod> other) {
				// TODO Auto-generated method stub
				return null;
			}

			public <U> Comparator<IInvokedMethod> thenComparing(
					Function<? super IInvokedMethod, ? extends U> keyExtractor,
					Comparator<? super U> keyComparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public <U extends Comparable<? super U>> Comparator<IInvokedMethod> thenComparing(
					Function<? super IInvokedMethod, ? extends U> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<IInvokedMethod> thenComparingInt(
					ToIntFunction<? super IInvokedMethod> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<IInvokedMethod> thenComparingLong(
					ToLongFunction<? super IInvokedMethod> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<IInvokedMethod> thenComparingDouble(
					ToDoubleFunction<? super IInvokedMethod> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
				// TODO Auto-generated method stub
				return null;
			}

			public <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
				// TODO Auto-generated method stub
				return null;
			}

			public <T> Comparator<T> nullsFirst(
					Comparator<? super T> comparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T> Comparator<T> nullsLast(
					Comparator<? super T> comparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T, U> Comparator<T> comparing(
					Function<? super T, ? extends U> keyExtractor,
					Comparator<? super U> keyComparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T, U extends Comparable<? super U>> Comparator<T> comparing(
					Function<? super T, ? extends U> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T> Comparator<T> comparingInt(
					ToIntFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T> Comparator<T> comparingLong(
					ToLongFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public <T> Comparator<T> comparingDouble(
					ToDoubleFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}
	    	
	    	
	    }

}
