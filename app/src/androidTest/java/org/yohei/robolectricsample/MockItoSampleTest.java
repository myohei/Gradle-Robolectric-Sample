package org.yohei.robolectricsample;

import android.content.SharedPreferences;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.List;

/**
 * Created by yohei on 5/3/14.
 */
@RunWith(RobolectricGradleTestRunner.class)
public class MockItoSampleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMockPreference() throws Exception {
        SharedPreferences sp = Mockito.mock(SharedPreferences.class);
        Mockito.doReturn("sample").when(sp).getString("hoge", "");
        Assert.assertEquals("sample", sp.getString("hoge", ""));
    }

    @Test
    public void testMockList() throws Exception {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("one");
        Mockito.when(mockList.get(1)).thenReturn("two");
        Mockito.doReturn("three").when(mockList).get(2);

        Assert.assertEquals("one",mockList.get(0));
        Assert.assertEquals("two",mockList.get(1));
        Assert.assertEquals("three",mockList.get(2));
    }
}
