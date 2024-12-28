
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestMinPreis
{
     @Test
     public void testLeer()
     {
         Makler m;
         m=new Makler();
         assertEquals(m.minPreis(), null);
     }
     @Test
     public void testEinHaus()
     {
         Makler m;
         m= new Makler();
         Haus h1;
         h1=new Haus("Mödling", 5, 250000);
         m.hinzufügen(h1);
         assertEquals(m.minPreis(),h1);
     }
     @Test
     public void testZweiHaus()
     {
         Makler m;
         m= new Makler();
         Haus h1,h2;
         h1=new Haus("Wien", 5, 250000);
         h2=new Haus("Baden", 5, 500000);
         m.hinzufügen(h1);
         m.hinzufügen(h2);
         assertEquals(m.minPreis(),h1);
     }
}
