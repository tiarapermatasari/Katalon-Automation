import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web/Login/TC001 - Login valid data'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/svg'))

WebUI.click(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/p_Vital Sign'))

WebUI.click(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/strong_Add Vital Sign'))

WebUI.setText(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/input_Add Vital Sign_bloodPressureSystolic'), 
    bpSistolik)

WebUI.setText(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/input_Add Vital Sign_bloodPressureDiastolic'), 
    bpDiastolik)

WebUI.setText(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/input_Add Vital Sign_heartRate'), 
    heartRate)

WebUI.setText(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/input_Add Vital Sign_respirationRate'), 
    respirationRate)

WebUI.setText(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/input_Add Vital Sign_bodyTemperature'), 
    bodyTemperature)

WebUI.click(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/button_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Vital Sign/Add Vital Sign/Page_Seraphim/div_vital sign created successfully'), 
    0)

WebUI.takeElementScreenshot(findTestObject('Vital Sign/Add Vital Sign/Page_Seraphim/div_vital sign created successfully'))

WebUI.closeBrowser()

