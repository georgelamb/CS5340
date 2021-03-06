/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RADICAL;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class INCHI_RADICALEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.DOUBLET;
      int int0 = iNCHI_RADICAL0.getIndx();
      assertEquals(2, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(0);
      assertEquals(INCHI_RADICAL.NONE, iNCHI_RADICAL0);
  }

  @Test
  public void test2()  throws Throwable  {
      INCHI_RADICAL.getValue(584484463);
  }

  @Test
  public void test3()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(1);
      assertEquals(INCHI_RADICAL.SINGLET, iNCHI_RADICAL0);
  }

  @Test
  public void test4()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(2);
      assertEquals(INCHI_RADICAL.DOUBLET, iNCHI_RADICAL0);
  }

  @Test
  public void test5()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(3);
      assertEquals(INCHI_RADICAL.TRIPLET, iNCHI_RADICAL0);
  }
}
