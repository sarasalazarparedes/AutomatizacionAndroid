package activities.cronometer;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditTitleAlarm {
    public TextBox labelTitle = new TextBox(By.xpath("//android.widget.EditText"));
    public Button okButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
}
