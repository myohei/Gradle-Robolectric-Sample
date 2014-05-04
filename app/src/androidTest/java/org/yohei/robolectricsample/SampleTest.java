package org.yohei.robolectricsample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by yohei on 5/1/14.
 */
@RunWith(RobolectricGradleTestRunner.class)
public class SampleTest {

    @Before
    public void setup() {
        // setup
    }

    @After
    public void teardown() {
        // teardown
    }

    @Test
    public void sampleTest() {
        Assert.assertEquals("a", "a");
    }
}
