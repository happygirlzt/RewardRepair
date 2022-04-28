/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 02:21:19 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelSink;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.junit.runner.RunWith;
import org.traccar.Context;
import org.traccar.TrackerServer;
import org.traccar.database.IdentityManager;
import org.traccar.protocol.Gl200Protocol;
import org.traccar.protocol.Gl200ProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gl200ProtocolDecoder_ESTest extends Gl200ProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      assertNotNull(defaultLocalClientChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localChannel0.isOpen());
      assertEquals(5, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(16);
      assertNotNull(mockInetSocketAddress0);
      
      DelayQueue<Delayed> delayQueue0 = new DelayQueue<Delayed>();
      assertNotNull(delayQueue0);
      
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Delayed delayed0 = delayQueue0.poll((-2235L), timeUnit0);
      assertNull(delayed0);
      
      try { 
        gl200ProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      assertNotNull(defaultLocalServerChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localServerChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isOpen());
      assertTrue(localServerChannel0.isReadable());
      assertEquals(4, (int)localServerChannel0.getId());
      
      String string0 = "w";
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("w", 592);
      assertNotNull(inetSocketAddress0);
      assertTrue(inetSocketAddress0.isUnresolved());
      assertEquals("w", inetSocketAddress0.getHostString());
      assertEquals("w:592", inetSocketAddress0.toString());
      assertEquals(592, inetSocketAddress0.getPort());
      
      try { 
        gl200ProtocolDecoder0.decode(localServerChannel0, inetSocketAddress0, inetSocketAddress0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.net.InetSocketAddress cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      assertNotNull(defaultLocalServerChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localServerChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isReadable());
      assertTrue(localServerChannel0.isOpen());
      assertEquals(3, (int)localServerChannel0.getId());
      
      ChannelSink channelSink0 = null;
      // Undeclared exception!
      try { 
        MockInetSocketAddress.createUnresolved("", (-213));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-213
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      String[] stringArray0 = new String[2];
      gl200Protocol0.setSupportedCommands(stringArray0);
      assertEquals(2, stringArray0.length);
      assertEquals("gl200", gl200Protocol0.getName());
      
      LinkedList<TrackerServer> linkedList0 = new LinkedList<TrackerServer>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      // Undeclared exception!
      try { 
        gl200Protocol0.initTrackerServers(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.TrackerServer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      assertNotNull(defaultLocalClientChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localChannel0.isReadable());
      assertTrue(localChannel0.isOpen());
      assertEquals(2, (int)localChannel0.getId());
      
      String string0 = null;
      List<String> list0 = defaultChannelPipeline0.getNames();
      assertNotNull(list0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress((String) null, 72424);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      assertNotNull(defaultLocalServerChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localServerChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertEquals(1, (int)localServerChannel0.getId());
      assertTrue(localServerChannel0.isReadable());
      assertTrue(localServerChannel0.isOpen());
      
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress((-1150));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1150
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      assertNotNull(gl200Protocol0);
      assertEquals("gl200", gl200Protocol0.getName());
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "(d{5}:dd:dd)?,";
      stringArray0[2] = "hvs0G9Ifn _).V";
      stringArray0[3] = "(x*),";
      stringArray0[4] = "";
      gl200Protocol0.setSupportedCommands(stringArray0);
      assertEquals(5, stringArray0.length);
      assertEquals("gl200", gl200Protocol0.getName());
      
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      assertNotNull(gl200ProtocolDecoder0);
      assertEquals("gl200", gl200Protocol0.getName());
      assertEquals("gl200", gl200ProtocolDecoder0.getProtocolName());
      
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      assertNotNull(defaultLocalServerChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertNotNull(defaultChannelPipeline0);
      assertFalse(defaultChannelPipeline0.isAttached());
      
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      assertNotNull(localServerChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isOpen());
      assertEquals(1, (int)localServerChannel0.getId());
      assertTrue(localServerChannel0.isReadable());
      
      InetAddress inetAddress0 = MockInetAddress.getByName("hvs0G9Ifn _).V");
      assertNotNull(inetAddress0);
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMulticastAddress());
      assertEquals("200.42.42.0", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertEquals("hvs0G9Ifn _).V/200.42.42.0", inetAddress0.toString());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isMCGlobal());
      assertFalse(inetAddress0.isMCLinkLocal());
      
      int int0 = 5;
      defaultLocalServerChannelFactory0.releaseExternalResources();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 5);
      assertNotNull(mockInetSocketAddress0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      try { 
        gl200ProtocolDecoder0.decode(localServerChannel0, mockInetSocketAddress0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Gl200Protocol gl200Protocol0 = null;
          Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder((Gl200Protocol) null);
          DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
          DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
          LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("", 7);
          mockInetSocketAddress0.getHostName();
          IdentityManager identityManager0 = mock(IdentityManager.class, new ViolatedAssumptionAnswer());
          Context.init(identityManager0);
          mockInetSocketAddress0.getHostName();
          gl200ProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, "");
          try { 
            gl200ProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, localChannel0);
            fail("Expecting exception: ClassCastException");
          
          } catch(ClassCastException e) {
             //
             // org.jboss.netty.channel.local.DefaultLocalChannel cannot be cast to java.lang.String
             //
             verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      ChannelFactory channelFactory0 = null;
      defaultChannelPipeline0.getSink();
      SocketChannel socketChannel0 = SocketChannel.open();
      SocketOption<LinkedList<Delayed>> socketOption0 = (SocketOption<LinkedList<Delayed>>) mock(SocketOption.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(socketOption0).toString();
      LinkedList<Delayed> linkedList0 = new LinkedList<Delayed>();
      // Undeclared exception!
      try { 
        socketChannel0.setOption(socketOption0, linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
      }
  }
}