/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 04:26:08 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.insert(0);
      aVLTree0.insert(823);
      aVLTree0.insert((-2992));
      aVLTree0.insert((-651));
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.insert(823);
      aVLTree0.insert((-2992));
      aVLTree0.insert(1);
      aVLTree0.insert((-651));
      aVLTree0.delete((-2992));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.key = 2374;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.delete(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1263);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1263);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node0;
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1363);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(1363);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1));
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.insert(0);
      aVLTree0.insert(823);
      aVLTree0.insert((-651));
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.insert((-2988));
      aVLTree0.insert((-689));
      aVLTree0.insert(1);
      aVLTree0.insert(0);
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.insert(0);
      aVLTree0.insert(823);
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      aVLTree0.delete((-2297));
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2142));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-2142));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      int int0 = aVLTree0.height();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(823);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2895));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
  }
}
