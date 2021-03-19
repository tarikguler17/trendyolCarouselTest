import org.testng.annotations.Test;

public class trendyolCarousel {
    @Test
    public void carouselTest(){
        HomePage homePage = new HomePage();
        homePage.goToPage();
        homePage.itemClick(9);// Buraya kaçıncı itema tıklamak istediğimizi giriyoruz
        assert homePage.isTitleContains("Koton");//Burada titleda olmasını beklediğimiz kelimeyi giriyoruz
        homePage.tearDown();
    }
}
