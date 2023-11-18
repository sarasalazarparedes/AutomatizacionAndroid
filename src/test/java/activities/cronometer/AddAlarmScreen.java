package activities.cronometer;

import control.Button;
import org.openqa.selenium.By;

public class AddAlarmScreen {
    public Button sixButton = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]"));
    public Button thrityBUtton = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"30\"]"));
    public Button pmButton = new Button(By.xpath("//android.widget.RadioButton[@resource-id=\"android:id/pm_label\"]"));
    public Button okButton = new Button(By.id("android:id/button1"));
}
