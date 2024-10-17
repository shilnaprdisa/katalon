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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sistro.petrokimia-gresik.com/Account/Login')

WebUI.setText(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/input_Username_UserName'), 
    'mq_uppclp')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/input_Password_Password'), 
    'iQvWr0/cjwRWKSj6PMkwYQ==')

WebUI.click(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/input_Show Password_showPass'))

WebUI.click(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/span_Pilih Region'))

WebUI.click(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/span_Pupuk Kujang'))

WebUI.click(findTestObject('Object Repository/Login Manager Diswil/Page_SISTRO - Pupuk Indonesia/button_Sign in'))

WebUI.verifyElementText(findTestObject('Page_Sistro/div_Role Anda  Manajer Kuota, Data Bagian P_18341a'), '')

WebUI.closeBrowser()
