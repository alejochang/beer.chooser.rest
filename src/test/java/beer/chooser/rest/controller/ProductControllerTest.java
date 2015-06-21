package beer.chooser.rest.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import beer.chooser.rest.BeerChooserApp;
import beer.chooser.rest.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=BeerChooserApp.class)
public class ProductControllerTest {
	
	@Autowired
    private ProductService productServiceMock; 
    
    @Before
    public void setUp() {
    	
    }

    @Test
    public void testGetChoiceOfTheDay() {
        assertFalse(false);
    }

    @Test
    public void testGetBeer() {
    	assertTrue(true);
    }
    
    @Test
    public void testGetPreviousChoices() {
        assertNotEquals(true, false);
    }

}
