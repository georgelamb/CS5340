/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_BOND_STEREO;
import net.sf.jniinchi.INCHI_BOND_TYPE;
import net.sf.jniinchi.JniInchiAtom;
import net.sf.jniinchi.JniInchiBond;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJniInchiBond {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(" T:");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 1963, 1963);
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getOriginAtom();
      assertEquals(0, jniInchiAtom1.getCharge());
  }

  @Test
  public void test1()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Q5VB}UBt,,{z!6-L6x");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, (JniInchiAtom) null, (-1956), (-1956));
      JniInchiAtom jniInchiAtom1 = jniInchiBond0.getTargetAtom();
      assertNull(jniInchiAtom1);
  }

  @Test
  public void test2()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("@?BGd*!/K");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      jniInchiBond0.debug();
      assertEquals("InChI Bond: @?BGd*!/K-@?BGd*!/K // Type: NONE // Stereo: NONE", jniInchiBond0.getDebugString());
  }

  @Test
  public void test3()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = jniInchiBond0.getBondStereo();
      jniInchiBond0.setStereoDefinition(iNCHI_BOND_STEREO0);
      assertEquals("InChI Bond: - // Type: SINGLE // Stereo: NONE", jniInchiBond0.getDebugString());
  }

  @Test
  public void test4()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      INCHI_BOND_TYPE iNCHI_BOND_TYPE1 = jniInchiBond0.getBondType();
      assertEquals(INCHI_BOND_TYPE.SINGLE, iNCHI_BOND_TYPE1);
  }

  @Test
  public void test5()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      int int0 = jniInchiBond0.getInchiBondStereo();
      assertEquals(0, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.SINGLE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      int int0 = jniInchiBond0.getInchiBondType();
      assertEquals(1, int0);
  }
}
