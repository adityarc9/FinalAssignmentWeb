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

WebUI.click(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/a_Hello maulanaadityargmail.com'))

WebUI.setText(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/input_Phone number_Input.PhoneNumber'), '081357654329')

WebUI.click(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/button_Save'))

WebUI.click(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/a_Password'))

'alternate pass : HicSwrvHyDoXIvvq6yj/4w=='
WebUI.setEncryptedText(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/input_Current password_Input.OldPassword'), 
    '8oKH6jVhc6nmRlIcALlDgQ==')

'alternate pass : 8oKH6jVhc6nmRlIcALlDgQ=='
WebUI.setEncryptedText(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/input_New password_Input.NewPassword'), 
    'HicSwrvHyDoXIvvq6yj/4w==')

'alternate pass : 8oKH6jVhc6nmRlIcALlDgQ=='
WebUI.setEncryptedText(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/input_Confirm new password_Input.ConfirmPassword'), 
    'HicSwrvHyDoXIvvq6yj/4w==')

WebUI.click(findTestObject('Object Repository/Fungsi Profile/Page_DemoShop/button_Update password'))

WebUI.closeBrowser()

