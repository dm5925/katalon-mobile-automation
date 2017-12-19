import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/ApiDemos.apk'

'Start the application'
Mobile.startApplication(path, false)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Scroll to Element and Swipe Vertical/heading_API_Demos'), 45)

'Take ScreenShot and Save with "HomePage" name using relative path'
Mobile.takeScreenshot('.\\ScreenShots\\HomePage.png', FailureHandling.STOP_ON_FAILURE)

'Scroll to Views text'
Mobile.scrollToText('Views', FailureHandling.STOP_ON_FAILURE)

'Take ScreenShot and Save with "View" name using relative path'
Mobile.takeScreenshot('.\\ScreenShots\\View.png', FailureHandling.STOP_ON_FAILURE)

'Tap on Views'
Mobile.tap(findTestObject('API Demos Objects/Scroll to Element and Swipe Vertical/text_Views'), 20)

'Scroll to Tabs text'
Mobile.scrollToText('Tabs', FailureHandling.STOP_ON_FAILURE)

'Take ScreenShot and Save with "Tab" name using absolute path'
Mobile.takeScreenshot('E:\\ScreenShots\\Tab.jpg', FailureHandling.STOP_ON_FAILURE)

'Close the Application'
Mobile.closeApplication()

