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

WebUI.callTestCase(findTestCase('Login/TC6 - Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Profile_kasirAja/button_P'))

WebUI.click(findTestObject('Object Repository/Profile_kasirAja/a_Panjimart'))

WebUI.sendKeys(findTestObject('User/input_nama_nama'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('User/input_nama_nama'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Profile_kasirAja/input_nama_nama'), 'Panji-mart')

WebUI.sendKeys(findTestObject('User/input_email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('User/input_email_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Profile_kasirAja/input_password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Profile_kasirAja/button_simpan'))

WebUI.verifyElementPresent(findTestObject('User/div_email is not allowed to be empty'), 0)

