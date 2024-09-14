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

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Enter the Store (2)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_K9-BD-01 (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_FL-DSH-01 (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Proceed to Checkout (1)'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_username (1)'), 
    'mrlonelymo2003')

assert true

WebUI.setEncryptedText(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_password (1)'), 
    'G6b3ADzBf0bSLqc3QoLOpw==')

assert true

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_signon (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img_Sign Out_img_cart'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Proceed to Checkout (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/td_Card Number (1)'))

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/input_Use a fakenumber_order.creditCard'), '222222222222')

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Confirm (1)'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Return to Main Menu (1)'))

WebUI.closeBrowser()

