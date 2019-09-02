import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/campaign/proteksi/contribute')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/button_LANJUTKAN PEMBAYARAN'))

WebUI.verifyTextPresent('LANJUTKAN PEMBAYARAN', false)

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_Rp_amount'), '10.000')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_PILIH'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/div_Transfer Mandiri'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_fullname'), 
    'rizza')

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    'r')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    'r@')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    'r@gmail')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/button_LANJUTKAN PEMBAYARAN'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    'r@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))

String abs = WebUI.getUrl()

println(abs)

WebUI.verifyTextNotPresent('LANJUTKAN PEMBAYARAN', false)

WebUI.closeBrowser()

