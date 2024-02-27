/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;

@SuppressWarnings("all")
public class UITestscript_Test_A1EED52F4BEFA5C0E5C2B66366336231 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public UITestscript_Test_A1EED52F4BEFA5C0E5C2B66366336231(IContainer container, String invocationId) {
		super(container, "UITestscript", invocationId, "A1EED52F4BEFA5C0E5C2B66366336231", "/UITestproject/Tests/UITestscript.testsuite", "C:/Users/karthick_ba/git/UIScript/UITestproject/Tests/UITestscript.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: UITestscript_Test_A1EED52F4BEFA5C0E5C2B66366336231 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EED52F4C3205F0E5C2B66366336231");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jpetstore.aspectran.com",
												  "A1EED52F4C5A9C90E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>jpetstore.aspectran.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1EED52F4C5A9C90E5C2B66366336231\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"jpetstore.aspectran.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/jpetstore.aspectran.com\\/catalog\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is Sign In Sign Up ? containing Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1EED52F4C6FD240E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>Sign In Sign Up ?<\\/b> containing Hyperlink whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4C6FD240E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In  Sign Up  ?\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:471;left:626;bottom:583;right:1252\\\", \\\"Geometry\\\": { \\\"height\\\": 112, \\\"width\\\": 626, \\\"x\\\": 626, \\\"y\\\": 471 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 583, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign In Sign Up ?\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"MenuContent\\\", \\\"left\\\": 626, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1252, \\\"tagname\\\": \\\"div\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 471, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"352\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1EED52F4CF5CB24E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4CF5CB24E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":760,\"isWeb\":false,\"description\":\"Think <i>760<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4CF5CB24E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:513;left:857;bottom:540;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 74, \\\"x\\\": 857, \\\"y\\\": 513 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 540, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signonForm\\\", \\\"left\\\": 857, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 932, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 513, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"493\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Login - jpetstore.aspectran.com",
												  "A1EED52F4D133E34E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D133E34E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":1602,\"isWeb\":false,\"description\":\"Think <i>1,602<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D133E34E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:522;left:899;bottom:582;right:998\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 98, \\\"x\\\": 899, \\\"y\\\": 522 }, \\\"Style$array$\\\": \\\"background-color:rgb(70, 84, 91);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"46545BFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 582, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 899, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 998, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 522, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"345\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish located at position 1 - jpetstore.aspectran.com",
												  "A1EED52F4D289AF4E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D289AF4E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":2260,\"isWeb\":false,\"description\":\"Think <i>2,260<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D289AF4E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:293;left:714;bottom:320;right:789\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 75, \\\"x\\\": 714, \\\"y\\\": 293 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(67, 146, 26);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:10px;padding-right:10px;padding-top:0px;text-align:center;text-decoration:none solid rgb(67, 146, 26);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 320, \\\"color\\\": \\\"43921AFF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/catalog\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 714, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 10, \\\"padding-right\\\": 10, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 789, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(67, 146, 26)\\\", \\\"top\\\": 293, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"379\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='QuickLinks']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is FI-SW-01 - jpetstore.aspectran.com",
												  "A1EED52F4D41A131E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D41A131E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":1320,\"isWeb\":false,\"description\":\"Think <i>1,320<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>FI-SW-01<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D41A131E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"FI-SW-01\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:358;left:432;bottom:385;right:534\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 102, \\\"x\\\": 432, \\\"y\\\": 358 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 187, 255);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(51, 187, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 385, \\\"color\\\": \\\"33BBFFFF\\\", \\\"content\\\": \\\"FI-SW-01\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/catalog\\\\\\/products\\\\\\/FI-SW-01\\\", \\\"left\\\": 432, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 534, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 187, 255)\\\", \\\"top\\\": 358, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"380\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Url is /cart/addItemToCart?itemId=EST-1 - jpetstore.aspectran.com",
												  "A1EED52F4D57E854E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D57E854E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":1441,\"isWeb\":false,\"description\":\"Think <i>1,441<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Url<\\/b> is <b>\\/cart\\/addItemToCart?itemId=EST-1<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D57E854E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"href\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/cart\\/addItemToCart?itemId=EST-1\"},\"name\":\"href\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:204;left:1578;bottom:264;right:1732\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 154, \\\"x\\\": 1578, \\\"y\\\": 204 }, \\\"Style$array$\\\": \\\"background-color:rgb(70, 84, 91);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"46545BFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 264, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Add to Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/cart\\\\\\/addItemToCart?itemId=EST-1\\\", \\\"left\\\": 1578, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1732, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 204, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"394\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td[5]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Proceed to Checkout - jpetstore.aspectran.com",
												  "A1EED52F4D6CF6F4E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D6CF6F4E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":2014,\"isWeb\":false,\"description\":\"Think <i>2,014<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Proceed to Checkout<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D6CF6F4E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Proceed to Checkout\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:391;left:825;bottom:451;right:1072\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 246, \\\"x\\\": 825, \\\"y\\\": 391 }, \\\"Style$array$\\\": \\\"background-color:rgb(71, 84, 92);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"47545CFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 451, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Proceed to Checkout\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/order\\\\\\/newOrderForm\\\", \\\"left\\\": 825, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1072, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 391, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"482\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Cart']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Continue - jpetstore.aspectran.com",
												  "A1EED52F4D80F424E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D80F424E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":2531,\"isWeb\":false,\"description\":\"Think <i>2,531<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Continue<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D80F424E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:557;left:823;bottom:617;right:955\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 131, \\\"x\\\": 823, \\\"y\\\": 557 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 617, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Continue\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 823, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 955, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 557, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"544\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Confirm - jpetstore.aspectran.com",
												  "A1EED52F4D9629D4E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EED52F4D9629D4E5C2B66366336231\",\"preferredThinktime\":0,\"thinktime\":1922,\"isWeb\":false,\"description\":\"Think <i>1,922<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Confirm<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4D9629D4E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Confirm\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:459;left:838;bottom:519;right:959\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 120, \\\"x\\\": 838, \\\"y\\\": 459 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 519, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Confirm\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 838, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 959, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 459, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"553\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - jpetstore.aspectran.com",
												  "A1EED52F4DA9B1D0E5C2B66366336231",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"114e8568-7bd7-4d7b-8828-a09020afd5de\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EED52F4DA9B1D0E5C2B66366336231\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/UITestproject/Tests/UITestscript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
