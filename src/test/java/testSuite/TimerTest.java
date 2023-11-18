package testSuite;

import activities.cronometer.AddAlarmScreen;
import activities.cronometer.ClockScreen;
import activities.cronometer.AlarmScreen;
import activities.cronometer.EditTitleAlarm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class TimerTest {
    ClockScreen clockScreen = new ClockScreen();
    AlarmScreen alarmScreen = new AlarmScreen();
    AddAlarmScreen addAlarmScreen = new AddAlarmScreen();
    EditTitleAlarm editTitleAlarm = new EditTitleAlarm();
    String typeAlarm = "Diplomado";
    @Test
    public void verifyStopwatch() throws InterruptedException {
        clockScreen.alarmButton.click();
        alarmScreen.addAlarm.click();
        addAlarmScreen.sixButton.click();
        addAlarmScreen.thrityBUtton.click();
        addAlarmScreen.pmButton.click();
        addAlarmScreen.okButton.click();
        alarmScreen.titleAlarm.click();
        editTitleAlarm.labelTitle.setText(typeAlarm);
        editTitleAlarm.okButton.click();
        Assertions.assertEquals(typeAlarm,alarmScreen.titleAlarm.getText(), "ERROR no se creo la alarma correctamente!");
        Thread.sleep(2000);

    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
