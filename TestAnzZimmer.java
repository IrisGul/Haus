

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAnzZimmer
{
    @Test
    public void testZuWenig()
    {
        Haus zimmer1;
        zimmer1=new Haus("Wien", 0, 50000);
        assertEquals(zimmer1.getAnzZimmer(),4);
    }
    @Test
    public void testZuViel()
    {
        Haus zimmer2;
        zimmer2=new Haus("Wien", 11, 60000);
        assertEquals(zimmer2.getAnzZimmer(),4);
    }
    @Test
    public void testOk()
    {
        Haus zimmer2;
        zimmer2=new Haus("Wien", 5, 60000);
        assertEquals(zimmer2.getAnzZimmer(),5);
    }
}
