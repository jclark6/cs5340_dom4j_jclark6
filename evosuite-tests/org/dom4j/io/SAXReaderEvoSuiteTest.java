/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.xerces.jaxp.SAXParserImpl;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.dom4j.io.DispatchHandler;
import org.dom4j.io.SAXReader;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class SAXReaderEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) defaultDocumentFactory0);
      sAXReader0.setEncoding("resolve-dtd-uris");
      File file0 = new File("");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      try {
        sAXReader0.read(uRL0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line -1 of document  : Invalid encoding name \"RESOLVE-DTD-URIS\". Nested exception: Invalid encoding name \"RESOLVE-DTD-URIS\".
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      
      sAXReader0.setIncludeInternalDTDDeclarations(true);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try {
        sAXReader0.read((InputStream) pipedInputStream0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Pipe not connected Nested exception: Pipe not connected
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      
      sAXReader0.setMergeAdjacentText(true);
      assertEquals(true, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test3()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((String) null);
      assertNotNull(sAXReader0);
      
      sAXReader0.setValidation(true);
      assertEquals(true, sAXReader0.isValidating());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
  }

  @Test
  public void test4()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      try {
        sAXReader0.setProperty("", "1");
        fail("Expecting exception: SAXNotRecognizedException");
      } catch(SAXNotRecognizedException e) {
        /*
         * Property '' is not recognized.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader((XMLReader) xMLFilterImpl0);
      sAXReader0.setDispatchHandler((DispatchHandler) null);
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
  }

  @Test
  public void test6()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      sAXReader0.setErrorHandler((ErrorHandler) xMLFilterImpl0);
      try {
        sAXReader0.read((Reader) null, "");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line 1 of document file:///mnt/fastdata/ac1gf/SF110/dist/62_dom4j/ : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      try {
        sAXReader0.setXMLReaderClassName("!");
        fail("Expecting exception: SAXException");
      } catch(SAXException e) {
        /*
         * SAX2 driver class ! not found
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.setDefaultHandler((ElementHandler) null);
      sAXReader0.removeHandler("Provider for ");
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isValidating());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
  }

  @Test
  public void test9()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader((XMLReader) xMLFilterImpl0);
      sAXReader0.resetHandlers();
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(true, sAXReader0.isStringInternEnabled());
  }

  @Test
  public void test10()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      sAXReader0.setIgnoreComments(false);
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
  }

  @Test
  public void test11()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)sAXReader0.getDocumentFactory();
      assertNotNull(defaultDocumentFactory0);
      
      SAXReader sAXReader1 = new SAXReader((DocumentFactory) defaultDocumentFactory0, true);
      assertEquals(true, sAXReader1.isValidating());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader1.isIgnoreComments());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader1.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(true, sAXReader1.isStringInternEnabled());
      assertEquals(false, sAXReader1.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader1.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader1.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
  }

  @Test
  public void test12()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.getErrorHandler();
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
  }

  @Test
  public void test13()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.getEncoding();
      assertEquals(true, sAXReader0.isValidating());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
  }

  @Test
  public void test14()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.setStringInternEnabled(true);
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(true, sAXReader0.isValidating());
  }

  @Test
  public void test15()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.addHandler("schema-not-supported", (ElementHandler) null);
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) defaultDocumentFactory0);
      sAXReader0.removeHandler((String) null);
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
  }

  @Test
  public void test17()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(false);
      sAXReader0.getEntityResolver();
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader0.isValidating());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
  }

  @Test
  public void test18()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setStripWhitespaceText(false);
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test19()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      sAXReader0.setDocumentFactory((DocumentFactory) null);
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(true, sAXReader0.isValidating());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
  }

  @Test
  public void test20()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader((XMLReader) xMLFilterImpl0, false);
      sAXReader0.setXMLReader((XMLReader) xMLFilterImpl0);
      assertEquals(false, sAXReader0.isValidating());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
  }

  @Test
  public void test21()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) defaultDocumentFactory0);
      SAXParserImpl.JAXPSAXParser sAXParserImpl_JAXPSAXParser0 = (SAXParserImpl.JAXPSAXParser)sAXReader0.getXMLReader();
      assertNotNull(sAXParserImpl_JAXPSAXParser0);
      
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) sAXParserImpl_JAXPSAXParser0);
      sAXReader0.setXMLFilter((XMLFilter) xMLFilterImpl0);
      File file0 = new File("");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      try {
        sAXReader0.read(uRL0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line 1 of document file:/mnt/fastdata/ac1gf/SF110/dist/62_dom4j/ : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader((XMLReader) xMLFilterImpl0);
      try {
        sAXReader0.setFeature((String) null, true);
        fail("Expecting exception: SAXNotRecognizedException");
      } catch(SAXNotRecognizedException e) {
        /*
         * Feature: null
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      sAXReader0.setEntityResolver((EntityResolver) xMLFilterImpl0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try {
        sAXReader0.read((InputStream) pipedInputStream0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Pipe not connected Nested exception: Pipe not connected
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("schema-not-supported");
        fail("Expecting exception: SAXException");
      } catch(SAXException e) {
        /*
         * SAX2 driver class schema-not-supported not found
         */
      }
  }

  @Test
  public void test25()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((String) null, true);
      assertEquals(true, sAXReader0.isStringInternEnabled());
      assertEquals(false, sAXReader0.isStripWhitespaceText());
      assertEquals(false, sAXReader0.isIncludeInternalDTDDeclarations());
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      assertEquals(true, sAXReader0.isValidating());
      assertNotNull(sAXReader0);
      assertEquals(false, sAXReader0.isIgnoreComments());
      assertEquals(false, sAXReader0.isMergeAdjacentText());
  }

  @Test
  public void test26()  throws Throwable  {
      SAXReader sAXReader0 = null;
      try {
        sAXReader0 = new SAXReader("fC3q0!dvtpHl+D3l", true);
        fail("Expecting exception: SAXException");
      } catch(SAXException e) {
        /*
         * SAX2 driver class fC3q0!dvtpHl+D3l not found
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXReader sAXReader0 = new SAXReader((XMLReader) xMLFilterImpl0, false);
      try {
        sAXReader0.read((String) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * No parent for filter Nested exception: No parent for filter
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          SAXReader sAXReader0 = new SAXReader(false);
          sAXReader0.setEncoding("%Xp~j`QEIN<3Hc\"");
          try {
            sAXReader0.read("http://apache.org/xml/features/validation/dynamic");
            fail("Expecting exception: DocumentException");
          } catch(DocumentException e) {
            /*
             * Security manager blocks (java.net.SocketPermission apache.org:80 connect,resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1034)
             * sun.net.www.http.HttpClient.openServer(HttpClient.java:528)
             * sun.net.www.http.HttpClient.<init>(HttpClient.java:234)
             * sun.net.www.http.HttpClient.New(HttpClient.java:307)
             * sun.net.www.http.HttpClient.New(HttpClient.java:324)
             * sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:970)
             * sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:911)
             * sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:836)
             * sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1172)
             * org.apache.xerces.impl.XMLEntityManager.setupCurrentEntity(Unknown Source)
             * org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
             * org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             * org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             * org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
             * org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
             * org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser.parse(Unknown Source)
             * org.dom4j.io.SAXReader.read(SAXReader.java:436)
             * org.dom4j.io.SAXReader.read(SAXReader.java:314)
             * sun.reflect.GeneratedMethodAccessor164.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             *  Nested exception: Security manager blocks (java.net.SocketPermission apache.org:80 connect,resolve)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1034)
             * sun.net.www.http.HttpClient.openServer(HttpClient.java:528)
             * sun.net.www.http.HttpClient.<init>(HttpClient.java:234)
             * sun.net.www.http.HttpClient.New(HttpClient.java:307)
             * sun.net.www.http.HttpClient.New(HttpClient.java:324)
             * sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:970)
             * sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:911)
             * sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:836)
             * sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1172)
             * org.apache.xerces.impl.XMLEntityManager.setupCurrentEntity(Unknown Source)
             * org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source)
             * org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             * org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
             * org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
             * org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
             * org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser.parse(Unknown Source)
             * org.dom4j.io.SAXReader.read(SAXReader.java:436)
             * org.dom4j.io.SAXReader.read(SAXReader.java:314)
             * sun.reflect.GeneratedMethodAccessor164.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test29()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      sAXReader0.setEncoding("");
      try {
        sAXReader0.read((InputStream) pipedInputStream0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line -1 of document  : Invalid encoding name \"\". Nested exception: Invalid encoding name \"\".
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      try {
        sAXReader0.read((Reader) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      sAXReader0.setEncoding("");
      try {
        sAXReader0.read((Reader) null);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      SAXReader sAXReader0 = new SAXReader((DocumentFactory) defaultDocumentFactory0);
      try {
        sAXReader0.read((InputStream) null, "3BhN");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * /mnt/fastdata/ac1gf/SF110/dist/62_dom4j/3BhN (No such file or directory) Nested exception: /mnt/fastdata/ac1gf/SF110/dist/62_dom4j/3BhN (No such file or directory)
         */
      }
  }

  @Test
  public void test33()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InputStreamReader inputStreamReader0 = new InputStreamReader((InputStream) byteArrayInputStream0);
      try {
        sAXReader0.read((Reader) inputStreamReader0, "I6b~v\" Cv^rORTp");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line 1 of document I6b~v\" Cv^rORTp : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader((XMLReader) null);
      sAXReader0.setEncoding("");
      try {
        sAXReader0.read((Reader) null, "");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line -1 of document  : Invalid encoding name \"\". Nested exception: Invalid encoding name \"\".
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader();
      assertEquals(false, sAXReader0.isIncludeExternalDTDDeclarations());
      
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      sAXReader0.setIncludeExternalDTDDeclarations(true);
      try {
        sAXReader0.read((InputStream) pipedInputStream0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Pipe not connected Nested exception: Pipe not connected
         */
      }
  }

  @Test
  public void test36()  throws Throwable  {
      SAXReader sAXReader0 = new SAXReader(true);
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ParserAdapter parserAdapter0 = new ParserAdapter((Parser) xMLReaderAdapter0);
      DefaultHandler defaultHandler0 = new DefaultHandler();
      try {
        sAXReader0.configureReader((XMLReader) parserAdapter0, defaultHandler0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Validation not supported for XMLReader: org.xml.sax.helpers.ParserAdapter@4b321b3c Nested exception: Feature: http://xml.org/sax/features/validation
         */
      }
  }

  @Test
  public void test37()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver((String) null);
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity((String) null, (String) null);
      assertNull(inputSource0.getPublicId());
  }

  @Test
  public void test38()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("", "");
      assertNull(inputSource0.getEncoding());
  }

  @Test
  public void test39()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver((String) null);
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("set(int,Object) unsuppGrted", "set(int,Object) unsuppGrted");
      assertEquals("set(int,Object) unsuppGrted", inputSource0.getSystemId());
  }

  @Test
  public void test40()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("", "http://xml.org/sax/features/string-interning");
      assertEquals("http://xml.org/sax/features/string-interning", inputSource0.getSystemId());
  }

  @Test
  public void test41()  throws Throwable  {
      SAXReader.SAXEntityResolver sAXReader_SAXEntityResolver0 = new SAXReader.SAXEntityResolver("3BhN");
      InputSource inputSource0 = sAXReader_SAXEntityResolver0.resolveEntity("3BhN", "3BhN");
      assertNotNull(inputSource0);
      assertEquals("3BhN3BhN", inputSource0.getSystemId());
  }
}