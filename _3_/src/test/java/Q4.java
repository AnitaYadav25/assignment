import org.testng.annotations.*;

public class Q4 {



    @Test
    public void test(){
        System.out.println("Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before class");

    }
    @BeforeGroups
    public void beforeGroup(){
        System.out.println("before Group");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before Method");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("before test");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("before group");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("after group");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After class");

    }
    @AfterGroups
    public void afterGroup(){
        System.out.println("before Group");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after Method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println(" after suite");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("after test");
    }
}