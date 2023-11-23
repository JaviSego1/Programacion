package Teoria;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonaTest {



    static Persona persona1, persona2;

    @BeforeAll
    static void setUp() {
         persona1 = new Persona(
                "juan", "garcia fernandez", 15, "12345678a");
         persona2 = new Persona(
               "juani", "fernandez roman", 25, "11111111N");
    }

    @Test
    void getNombre() {
            assertEquals("juan", persona1.getNombre());
            assertNotEquals("JUAN", persona1.getNombre());
            assertNotNull(persona1.getNombre());
    }

    @Test
    void getApellidos() {
        assertEquals("garcia fernandez", persona1.getApellidos());
        assertNotEquals("martinez lopez", persona1.getApellidos());
        assertNotNull(persona1.getApellidos());
    }

    @Test
    void getEdad() {
        assertEquals("15", persona1.getEdad());
        assertNotEquals("20", persona1.getEdad());
    }

    @Test
    void getDni() {
        assertEquals("12345678a", persona1.getDni().toLowerCase());
        assertEquals("12345678A", persona1.getDni().toUpperCase());
        assertNotEquals("12345678l", persona1.getDni());
        assertNotNull(persona1.getDni());
    }

    @Test
    void setNombre() {
        persona2.setNombre("joaquin");
        assertNotEquals("juani", persona2.getNombre());
        assertEquals("joaquin", persona2.getNombre());
    }

    @Test
    void setApellidos() {
    }

    @Test
    void setEdad() {
        persona1.setEdad(35);
        assertNotEquals(25, persona2.getEdad());
        assertEquals(35, persona2.getEdad());

    }

    @Test
    void testToString() {
        assertNotNull(persona1.toString());
        assertNotEquals("12345678A, garcia fernandez, juan, 15", persona1.toString());
        assertEquals("12345678A, garcia fernandez, juan, 15", persona1.toString());
    }

    @Test
    void esMayorDeEdad() {
        assertEquals(false, persona1.esMayorDeEdad());
        assertFalse(persona1.esMayorDeEdad());
        assertTrue(persona2.esMayorDeEdad());
    }
}