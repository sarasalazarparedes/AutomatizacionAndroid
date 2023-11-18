package activities.cronometer;

import control.Button;
import org.openqa.selenium.By;

public class ClockScreen {
    public Button alarmButton = new Button(By.xpath("//android.widget.TextView[@text=\"ALARM\"]"));
}
