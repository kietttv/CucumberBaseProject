package project.com.testcases;

import org.testng.annotations.Test;
import project.com.helpers.ExcelHelpers;
import project.com.helpers.PropertiesHelpers;
import project.com.utils.LogUtils;

public class TestHandle {
    @Test
    public void testReadPropertiesFile(){
        PropertiesHelpers.loadAllFiles();
        System.out.println(PropertiesHelpers.getValue("BROWSER"));
    }

    @Test
    public void testExcelHelpers(){
        ExcelHelpers excelHelpers = new ExcelHelpers();
        excelHelpers.setExcelFile("src/test/resources/testdatas/CRM.xlsx", "Sheet1");
        System.out.println(excelHelpers.getCellData("EMAIL", 1));
        System.out.println(excelHelpers.getCellData("PASSWORD", 1));
    }

    @Test
    public void testLog4j2(){
        LogUtils.info("Cucumber TestNG");
    }
}
