/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.util.DoubleNameMap;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DoubleNameMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DoubleNameMap<Object> doubleNameMap0 = new DoubleNameMap<Object>();
      Object object0 = doubleNameMap0.get("");
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      DoubleNameMap<Object> doubleNameMap0 = new DoubleNameMap<Object>();
      DefaultDocumentFactory defaultDocumentFactory0 = new DefaultDocumentFactory();
      Namespace namespace0 = defaultDocumentFactory0.createNamespace("", "");
      QName qName0 = QName.get("", namespace0, "");
      Object object0 = doubleNameMap0.get(qName0);
      assertNull(object0);
  }

  @Test
  public void test2()  throws Throwable  {
      DoubleNameMap<Object> doubleNameMap0 = new DoubleNameMap<Object>();
      QName qName0 = new QName("$sGo{lQR2y]#hA9\"Yp");
      doubleNameMap0.remove(qName0);
      assertEquals("$sGo{lQR2y]#hA9\"Yp", qName0.getQualifiedName());
  }

  @Test
  public void test3()  throws Throwable  {
      DoubleNameMap<Object> doubleNameMap0 = new DoubleNameMap<Object>();
      // Undeclared exception!
      try {
        doubleNameMap0.put((QName) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
