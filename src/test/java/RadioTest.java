import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected,actual);

    }
    @Test
    public void nextVolumeAfter100(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected,actual);
    }
    @Test
    public void returnStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void nextVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.nextVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected,actual);
    }
    @Test
    public void SelectionAdoveTheAllowedVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        radio.nextVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void SelectionBelowTheAllowedVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.nextVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void SelectionAdoveTheAllowedStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void SelectionBelowTheAllowedStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
