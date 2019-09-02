import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class negatifPembayaranSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("navigate to kitabisa pages")
	def navigate_to_kitabisa_pages() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://kitabisa.com/campaign/proteksi/contribute')
	}

	@When("set amounts (.*)")
	def set_amount(String amounts) {

		WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_Rp_amount'), amounts)
	}

	@And("set names (.*)")
	def set_names(String names) {

		WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_fullname'),
				names)
	}

	@And("set emails (.*)")
	def set_emails(String emails) {

		WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'),
				emails)
	}

	@And("submit button")
	def submit_button() {

		WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_LANJUTKAN PEMBAYARAN'))
	}

	@Then("alert appears")
	def alert_appears() {

		WebUI.verifyTextPresent('LANJUTKAN PEMBAYARAN', false)
		
		WebUI.closeBrowser()
	}
}