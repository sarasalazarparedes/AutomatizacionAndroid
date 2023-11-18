package activities.cronometer;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button addAlarm = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Button titleAlarm = new Button(By.id("com.google.android.deskclock:id/edit_label"));

}
