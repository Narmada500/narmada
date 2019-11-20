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
import java.util.concurrent.ThreadLocalRandom



WebUI.openBrowser('')

WebUI.navigateToUrl('https://my.500apps.com/a/#/login')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Schedule/Page_Login/input_Login_email'), 'narmada+billing@invox.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Schedule/Page_Login/input_Login_password'), 'XFu5psyYm8gWjWMt8cB1OA==')

WebUI.click(findTestObject('Object Repository/Schedule/Page_Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Schedule/Page_Portal Home/a_Schedulely'))

WebUI.navigateToUrl('https://schedule.500apps.com/#/dashboard/my-events/')
WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Events'))

WebUI.click(findTestObject('Object Repository/Page_Event List/span_Add Event'))
Date today = new Date()

String todaysDate = today.format('MMddyy-hhmm')

String EventName = 'Ename ' + todaysDate

WebUI.setText(findTestObject('Object Repository/Page_Add Event/input__Name'), EventName)


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Add Event/select_Select meeting type In PersonGo To M_2f7b23'), 
    '15720', true)

WebUI.setText(findTestObject('Object Repository/Page_Add Event/input__Duration'), '60')

WebUI.setText(findTestObject('Object Repository/Page_Add Event/input_Location_location'), 'Hyderabad')

WebUI.setText(findTestObject('Object Repository/Page_Add Event/input_Minimum time before the event_min-time'), '30')

WebUI.click(findTestObject('Object Repository/Page_Add Event/button_Event Color Tag_colorfirst'))

WebUI.setText(findTestObject('Object Repository/Page_Add Event/textarea_Description_description'), 'Test Description')

WebUI.click(findTestObject('Object Repository/Page_Add Event/button_Next Step'))

WebUI.click(findTestObject('Object Repository/Page_Add Event/input__start_date'))
WebUI.click(findTestObject('Object Repository/Page_Add Event/startdate'))


WebUI.click(findTestObject('Object Repository/Page_Add Event/Second Step'))

WebUI.click(findTestObject('Object Repository/Page_Add Event/button_Save Event'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

title = WebUI.getWindowTitle()
println(title)
//WebUI.verifyMatch(title, “All Events”, true)

WebUI.click(findTestObject('Object Repository/Page_Event List/i_Ends On _far fa-ellipsis-h fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_Event List/a_View Calendar Page'))

WebUI.switchToWindowTitle('Appointment Booking')

WebUI.click(findTestObject('Object Repository/Page_Appointment Booking/div_1100 AM'))

WebUI.setText(findTestObject('Object Repository/Page_Appointment Booking/input_Your Name_name'), 'Raga')

WebUI.setText(findTestObject('Object Repository/Page_Appointment Booking/input_Your Email_email'), 'ragaqt@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Appointment Booking/button_Confirm'))

WebUI.switchToWindowTitle('Event List')

WebUI.click(findTestObject('Object Repository/Page_Event List/a_Dashboard'))

WebUI.closeBrowser()

