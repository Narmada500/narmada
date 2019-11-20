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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Testlogin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot(null)


//WebUI.navigateToUrl('https://my.500apps.com/#/login')

//WebUI.setText(findTestObject('Object Repository/Page_Login/input_Login_email'), 'narmada+billing@invox.com')

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Login_password'), 'XFu5psyYm8gWjWMt8cB1OA==')

//WebUI.click(findTestObject('Object Repository/Page_Login/button_LOGIN'))

//WebUI.click(findTestObject('Object Repository/Page_Portal Home/a_Schedulely'))

//WebUI.switchToWindowTitle('Dashboard')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Events'))

WebUI.click(findTestObject('Object Repository/Page_Event List/button_Add Event'))

WebUI.closeBrowser()

