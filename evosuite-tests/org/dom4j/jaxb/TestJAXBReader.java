/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.jaxb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.dom4j.DocumentException;
import org.dom4j.ElementHandler;
import org.dom4j.jaxb.JAXBObjectHandler;
import org.dom4j.jaxb.JAXBReader;
import org.junit.BeforeClass;
import org.xml.sax.InputSource;

@RunWith(EvoSuiteRunner.class)
public class TestJAXBReader {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JAXBReader jAXBReader0 = new JAXBReader("Validation not supported for XMLReader: ", classLoader0);
      try {
        jAXBReader0.read((Reader) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("y.KDf", (ClassLoader) null);
      jAXBReader0.addHandler("y.KDf", (ElementHandler) null);
      assertEquals(false, jAXBReader0.isPruneElements());
  }

  @Test
  public void test2()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader(" : ", (ClassLoader) null);
      File file0 = new File(" : ");
      try {
        jAXBReader0.read(file0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         *  :  (No such file or directory) Nested exception:  :  (No such file or directory)
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("Validation not supported for XMLReader: ");
      jAXBReader0.removeHandler("Validation not supported for XMLReader: ");
      assertEquals(false, jAXBReader0.isPruneElements());
  }

  @Test
  public void test4()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader((String) null);
      try {
        jAXBReader0.read((String) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JAXBReader jAXBReader0 = new JAXBReader("FIwpa._w,q", classLoader0);
      try {
        jAXBReader0.read((Reader) null, "FIwpa._w,q");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      JAXBReader jAXBReader0 = new JAXBReader("aG-7Ne}]HX", classLoader0);
      File file0 = new File("aG-7Ne}]HX");
      try {
        jAXBReader0.read(file0, (Charset) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * aG-7Ne}]HX (No such file or directory) Nested exception: aG-7Ne}]HX (No such file or directory)
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("qdoaXHNi8bv%");
      try {
        jAXBReader0.read((InputSource) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("y.KDf", (ClassLoader) null);
      try {
        jAXBReader0.read((InputStream) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("bUTF-8");
      // Undeclared exception!
      try {
        jAXBReader0.read((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("");
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte) (-119), (int) (byte) (-119));
      try {
        jAXBReader0.read((InputStream) byteArrayInputStream0, "");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line -1 of document  : Premature end of file. Nested exception: Premature end of file.
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("y.KDf", (ClassLoader) null);
      jAXBReader0.addObjectHandler("y.KDf", (JAXBObjectHandler) null);
      assertEquals(false, jAXBReader0.isPruneElements());
  }

  @Test
  public void test12()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("y.KDf", (ClassLoader) null);
      jAXBReader0.removeObjectHandler("y.KDf");
      assertEquals(false, jAXBReader0.isPruneElements());
  }

  @Test
  public void test13()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("qdoaXHNi8bv%");
      jAXBReader0.resetHandlers();
      jAXBReader0.resetHandlers();
      assertEquals(false, jAXBReader0.isPruneElements());
  }

  @Test
  public void test14()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader(" : ", (ClassLoader) null);
      boolean boolean0 = jAXBReader0.isPruneElements();
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader("qdoaXHNi8bv%");
      jAXBReader0.setPruneElements(true);
      assertEquals(true, jAXBReader0.isPruneElements());
  }

  @Test
  public void test16()  throws Throwable  {
      JAXBReader jAXBReader0 = new JAXBReader(" : ", (ClassLoader) null);
      jAXBReader0.setPruneElements(false);
      assertEquals(false, jAXBReader0.isPruneElements());
  }
}
