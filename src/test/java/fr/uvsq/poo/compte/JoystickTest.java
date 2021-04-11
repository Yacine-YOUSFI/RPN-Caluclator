package fr.uvsq.poo.compte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoystickTest {

    @Test
    public void testIsOn() {
        Joystick j = new Joystick();
        assertEquals(true, j.isOn());
    }

    @Test
    public void testIsOff() {
        Joystick js = new Joystick();
        assertEquals(true, js.turnOff());
    }
}