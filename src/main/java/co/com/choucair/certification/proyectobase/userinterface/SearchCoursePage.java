package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    //There is no permission to view the list of this course
    /*public static final Target BUTTON_UC =
            Target.the("select choucair university")
                    .located(
                            By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE =
            Target.the("search course")
                    .located(
                            By.id("coursesearchbox"));
    public static final Target BUTTON_GO =
            Target.the("click to search for the course")
                    .located(
                            By.id("//buttom[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE =
            Target.the("click to select the course")
                    .located(
                            By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));¨*/

    public static final Target BUTTON_UC =
            Target.the("Select courses and certifications")
                    .located(
                            By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE =
            Target.the("search course")
                    .located(
                            By.id("coursesearchbox"));
    public static final Target BUTTON_GO =
            Target.the("click to search for the course")
                    .located(
                            By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE =
            Target.the("click to select the course")
                    .located(By.xpath("//a[contains(text(),'ISTQB Agile Tester Extension')]"));
    public static final Target NAME_COURSE =
            Target.the("Extract the name of the course")
                    .located(By.xpath("//h3[@class='coursename']"));
}
