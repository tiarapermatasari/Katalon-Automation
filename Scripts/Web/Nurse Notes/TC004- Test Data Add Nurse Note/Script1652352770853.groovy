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

WebUI.click(findTestObject('Object Repository/Nurse note/Page_Seraphim/svg'))

WebUI.click(findTestObject('Object Repository/Nurse note/Page_Seraphim/p_Nurses Notes'))

WebUI.click(findTestObject('Object Repository/Nurse note/Page_Seraphim/strong_Add Notes'))

WebUI.setText(findTestObject('Object Repository/Nurse note/Page_Seraphim/textarea_Add Notes_subjective'), subjective)

WebUI.setText(findTestObject('Object Repository/Nurse note/Page_Seraphim/textarea_Subjective cannot be empty_objective'), 
    objective)

WebUI.setText(findTestObject('Object Repository/Nurse note/Page_Seraphim/textarea_Objective cannot be empty_assesment'), 
    assement)

WebUI.setText(findTestObject('Object Repository/Nurse note/Page_Seraphim/textarea_Assesment cannot be empty_plan'), plan)

WebUI.click(findTestObject('Object Repository/Nurse note/Page_Seraphim/button_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Nurse note/Page_Seraphim/div_nurse note created successfully'), 
    0)

WebUI.takeElementScreenshot(findTestObject('Object Repository/Nurse note/Page_Seraphim/div_nurse note created successfully'), 
    FailureHandling.STOP_ON_FAILURE)

