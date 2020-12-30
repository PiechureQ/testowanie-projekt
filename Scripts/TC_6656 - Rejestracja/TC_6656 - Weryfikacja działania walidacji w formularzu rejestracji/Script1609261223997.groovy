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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'), 0)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login - My Store/div_Invalid email address'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_Invalid email address'), 'Invalid email address.')

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email_create'), email)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login - My Store/form_Your personal informationTitleMr.Mrs.F_0dfd37'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 8 errors'), 'There are 8 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_You must register at least one phone number'), 
    'You must register at least one phone number.')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), phone)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 7 errors'), 'There are 7 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_lastname is required'), 'lastname is required.')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), surname)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 6 errors'), 'There are 6 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_firstname is required'), 'firstname is required.')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), name)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 5 errors'), 'There are 5 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_address1 is required'), 'address1 is required.')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), street)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 4 errors'), 'There are 4 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_city is required'), 'city is required.')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), city)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 3 errors'), 'There are 3 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_The ZipPostal code youve entered is inva_8cea72'), 
    'The Zip/Postal code you\'ve entered is invalid. It must follow this format: 00000')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), postCode)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There are 2 errors'), 'There are 2 errors')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_This country requires you to choose a State'), 
    'This country requires you to choose a State.')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    stateIndex, true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/p_There is 1 error'), 'There is 1 error')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Store/li_passwd is required'), 'passwd is required.')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), password)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My account - My Store/a_Sign out'))

