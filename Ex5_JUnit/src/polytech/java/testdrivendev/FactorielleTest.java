package fr.gatay.cedric.epudi.di4.tp3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class FactorielleTest {
private IFactorielle factorielle;
@Before
public void setUp() throws Exception {
    //factorielle = new FactorielleLineaire();
    factorielle = new FactorielleRecursive();
    //factorielle = new FactorielleRecursiveNonTerminale();
}
@Test
public void testFactorielleZero(){
    Assert.assertEquals(1, 
          factorielle.factorielle(0));
}
@Test
public void testFactorielleCinq(){
    Assert.assertEquals(120, 
        factorielle.factorielle(5));
}
@Test
public void testFactNegativeKO(){
    try {
      factorielle.factorielle(-1);
      Assert.fail(IFactorielle.EXC_MSG);
    } catch (Exception e) {
      Assert.assertTrue(e instanceof
        IllegalArgumentException);
    }
}
}