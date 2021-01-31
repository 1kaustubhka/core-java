package com.cybage.JunitExample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@ExcludeTags("Dev")
@SelectPackages("com.cybage.JunitExample")
public class MyTestSuite {

}
