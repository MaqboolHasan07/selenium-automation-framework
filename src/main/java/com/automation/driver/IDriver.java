package com.automation.driver;

import com.automation.driver.entity.DriverData;
import org.openqa.selenium.WebDriver;

public interface IDriver {

    WebDriver getDriver(DriverData driverData);
}
