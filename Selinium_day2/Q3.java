//Implicit Wait:
//        During Implicit wait if the Web Driver cannot find An element immediately because of its availability,
//        it will keep polling (around 250 milli seconds) the DOM to get the element.
//        If the element is not available within the specified Time an NoSuchElementException will be raised.
//        It generally waits for the whole DOM tree to load.
//        We generally have only one implicit wait and that is used in the beginning.
//
//        Syntax:
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//
//        Explicit Wait:
//        There can be instance when a particular element takes more than a minute to load.
//        It is specified for a particular element and waits for that element to load rather than the whole DOM Tree.
//        We can have multiple explicit wait for different components.
//
//        Syntax:
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
