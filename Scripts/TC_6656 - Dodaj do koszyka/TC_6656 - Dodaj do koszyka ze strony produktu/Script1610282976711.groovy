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

WebUI.navigateToUrl('http://automationpractice.com/index.php?id_product=2&controller=product')

productName = WebUI.getText(findTestObject('Object Repository/Page_Blouse - My Store/h1_Blouse'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Blouse - My Store/select_SML'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Color_White'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Blouse - My Store/span_Add to cart'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Blouse - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_My Store/div_Product successfully added to your shop_ab4221'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Store/h2_Product successfully added to your shopp_45f75f'), 
    'Product successfully added to your shopping cart')

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=order')

WebUI.verifyElementText(findTestObject('Page_Order - My Store/a_ProductName'), productName)

assert WebUI.getAttribute(findTestObject('Page_Order - My Store/input_quantity'), 'value') == 
expectedQuantity

