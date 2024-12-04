package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends Utility {

    HomePage homePage = new HomePage();
    ComputerPage computerPage =new ComputerPage();

    public void selectMenu(String menu){
        homePage.clickOnComputerInTopMenu(menu);
    }

    @Test
    public void verifyPageNavigation(){

        // click on all Computers
        selectMenu("Computers");

        // Verify desktop text
        Assert.assertEquals("Computers",
                computerPage.getComputerPageTitle(),"Computers text is not matched!");

    }
}
