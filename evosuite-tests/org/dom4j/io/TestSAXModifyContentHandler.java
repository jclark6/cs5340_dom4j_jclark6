/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.dom4j.QName;
import org.dom4j.io.ElementStack;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXModifyContentHandler;
import org.dom4j.io.XMLWriter;
import org.junit.BeforeClass;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Locator2Impl;

@RunWith(EvoSuiteRunner.class)
public class TestSAXModifyContentHandler {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0, (ElementHandler) null, (ElementStack) null);
      assertEquals(false, sAXModifyContentHandler0.isStripWhitespaceText());
  }

  @Test
  public void test1()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      XMLWriter xMLWriter0 = sAXModifyContentHandler0.getXMLWriter();
      assertNull(xMLWriter0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0, (ElementHandler) null);
      sAXModifyContentHandler0.endEntity("xm_ns");
      assertEquals(false, sAXModifyContentHandler0.isStripWhitespaceText());
  }

  @Test
  public void test3()  throws Throwable  {
      QName qName0 = QName.get("=");
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)qName0.getDocumentFactory();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0);
      XMLWriter xMLWriter0 = new XMLWriter();
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.notationDecl("=", "=", "=");
      assertEquals(false, sAXModifyContentHandler0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test4()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.startDTD((String) null, (String) null, (String) null);
      assertEquals(false, sAXModifyContentHandler0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test5()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      XMLWriter xMLWriter0 = new XMLWriter((OutputStream) byteArrayOutputStream0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.startDTD("O", "O", "O");
      assertEquals(false, sAXModifyContentHandler0.isIgnoreComments());
  }

  @Test
  public void test6()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.endDTD();
      assertEquals(false, sAXModifyContentHandler0.isStripWhitespaceText());
  }

  @Test
  public void test7()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      OutputFormat outputFormat0 = new OutputFormat(" encoding=\"UTF-8\"");
      XMLWriter xMLWriter0 = new XMLWriter(outputFormat0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.endDTD();
      assertEquals(false, sAXModifyContentHandler0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test8()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.startEntity("");
      assertEquals(false, sAXModifyContentHandler0.isMergeAdjacentText());
  }

  @Test
  public void test9()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      StringWriter stringWriter0 = new StringWriter(1320);
      XMLWriter xMLWriter0 = new XMLWriter((Writer) stringWriter0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.startEntity((String) null);
      assertEquals(false, sAXModifyContentHandler0.isIgnoreComments());
  }

  @Test
  public void test10()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      StringWriter stringWriter0 = new StringWriter(1320);
      XMLWriter xMLWriter0 = new XMLWriter((Writer) stringWriter0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.endEntity((String) null);
      assertEquals(false, sAXModifyContentHandler0.isIgnoreComments());
  }

  @Test
  public void test11()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.notationDecl("n", "n", "n");
      assertEquals(false, sAXModifyContentHandler0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test12()  throws Throwable  {
      QName qName0 = QName.get("=");
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)qName0.getDocumentFactory();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0);
      sAXModifyContentHandler0.startDocument();
      assertEquals(false, sAXModifyContentHandler0.isStripWhitespaceText());
  }

  @Test
  public void test13()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      XMLWriter xMLWriter0 = new XMLWriter((OutputStream) byteArrayOutputStream0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.startDocument();
      assertEquals(false, sAXModifyContentHandler0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test14()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      sAXModifyContentHandler0.setDocumentLocator((Locator) locator2Impl0);
      assertEquals(0, locator2Impl0.getColumnNumber());
  }

  @Test
  public void test15()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      StringWriter stringWriter0 = new StringWriter(1320);
      XMLWriter xMLWriter0 = new XMLWriter((Writer) stringWriter0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.setDocumentLocator((Locator) null);
      assertEquals(false, sAXModifyContentHandler0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0, (ElementHandler) null);
      sAXModifyContentHandler0.endDocument();
      assertEquals(false, sAXModifyContentHandler0.isMergeAdjacentText());
  }

  @Test
  public void test17()  throws Throwable  {
      QName qName0 = QName.get("=");
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)qName0.getDocumentFactory();
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler((DocumentFactory) defaultDocumentFactory0);
      XMLWriter xMLWriter0 = new XMLWriter();
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.endDocument();
      assertEquals(false, sAXModifyContentHandler0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test18()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.startPrefixMapping("n", "n");
      assertEquals(false, sAXModifyContentHandler0.isStripWhitespaceText());
  }

  @Test
  public void test19()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      OutputFormat outputFormat0 = new OutputFormat(" encoding=\"UTF-8\"");
      XMLWriter xMLWriter0 = new XMLWriter(outputFormat0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.startPrefixMapping(" encoding=\"UTF-8\"", " encoding=\"UTF-8\"");
      assertEquals(false, sAXModifyContentHandler0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test20()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      sAXModifyContentHandler0.endPrefixMapping((String) null);
      assertEquals(false, sAXModifyContentHandler0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test21()  throws Throwable  {
      SAXModifyContentHandler sAXModifyContentHandler0 = new SAXModifyContentHandler();
      StringWriter stringWriter0 = new StringWriter(1320);
      XMLWriter xMLWriter0 = new XMLWriter((Writer) stringWriter0);
      sAXModifyContentHandler0.setXMLWriter(xMLWriter0);
      sAXModifyContentHandler0.endPrefixMapping((String) null);
      assertEquals(false, sAXModifyContentHandler0.isIncludeExternalDTDDeclarations());
  }
}