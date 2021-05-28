import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass1 = stackAr0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) '4');
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((-1.0d));
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(0.0d);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) 0);
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction((double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) (-1L));
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (byte) 100);
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction(0.0d);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) 1.0f);
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) ' ');
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) 0);
        int int6 = stackAr0.magicFunction((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) 100L);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) 0);
        int int6 = stackAr0.magicFunction((double) 100L);
        int int8 = stackAr0.magicFunction((double) 'a');
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction(0.0d);
        int int6 = stackAr0.magicFunction((double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        int int12 = stackAr0.magicFunction((double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction(0.0d);
        int int6 = stackAr0.magicFunction((double) 0.0f);
        int int8 = stackAr0.magicFunction(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) 100L);
        int int10 = stackAr0.magicFunction((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 100);
        int int4 = stackAr0.magicFunction((double) 1);
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        int int12 = stackAr0.magicFunction(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (byte) 100);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction(0.0d);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 100);
        int int4 = stackAr0.magicFunction((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction(0.0d);
        int int6 = stackAr0.magicFunction((double) (byte) -1);
        int int8 = stackAr0.magicFunction((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction((double) (byte) 1);
        int int10 = stackAr0.magicFunction((double) (short) -1);
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 0.0f);
        int int4 = stackAr0.magicFunction(0.0d);
        int int6 = stackAr0.magicFunction((double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) '4');
        int int6 = stackAr0.magicFunction((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) (short) 100);
        int int12 = stackAr0.magicFunction((double) (byte) 100);
        int int14 = stackAr0.magicFunction((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) 100L);
        int int10 = stackAr0.magicFunction(1.0d);
        int int12 = stackAr0.magicFunction((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        int int12 = stackAr0.magicFunction(1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) 100L);
        int int10 = stackAr0.magicFunction((double) 100);
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction((double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) (-1L));
        int int6 = stackAr0.magicFunction(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((double) 'a');
        int int12 = stackAr0.magicFunction((double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((-1.0d));
        int int12 = stackAr0.magicFunction((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (byte) 100);
        int int8 = stackAr0.magicFunction((double) (-1.0f));
        int int10 = stackAr0.magicFunction(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (byte) 100);
        int int8 = stackAr0.magicFunction(0.0d);
        int int10 = stackAr0.magicFunction((double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 100.0f);
        int int6 = stackAr0.magicFunction(0.0d);
        int int8 = stackAr0.magicFunction(100.0d);
        int int10 = stackAr0.magicFunction((-1.0d));
        int int12 = stackAr0.magicFunction((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) (byte) 10);
        int int4 = stackAr0.magicFunction((double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) 0);
        int int6 = stackAr0.magicFunction((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) 0);
        int int6 = stackAr0.magicFunction((double) 100L);
        int int8 = stackAr0.magicFunction((double) 'a');
        int int10 = stackAr0.magicFunction((double) 100.0f);
        int int12 = stackAr0.magicFunction((double) ' ');
        java.lang.Class<?> wildcardClass13 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int2 = stackAr0.magicFunction((double) 1);
        int int4 = stackAr0.magicFunction((double) (byte) 10);
        int int6 = stackAr0.magicFunction((double) (short) 1);
        int int8 = stackAr0.magicFunction((double) (short) -1);
        int int10 = stackAr0.magicFunction((double) (byte) 10);
        int int12 = stackAr0.magicFunction((-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }
}

