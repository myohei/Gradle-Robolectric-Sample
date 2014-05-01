package org.yohei.robolectricsample;

import android.app.Application;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;

/**
 * Created by yohei on 5/1/14.
 */
public class RobolectricGradleTestRunner extends RobolectricTestRunner {
    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your AndroidManifest.xml file
     * and res directory by default. Use the {@link Config} annotation to configure.
     *
     * @param testClass the test class to be run
     * @throws org.junit.runners.model.InitializationError if junit says so
     */
    public RobolectricGradleTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected AndroidManifest getAppManifest(Config config) {
        String myAppPath = Application.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String manifestPath = myAppPath + "../../../src/main/AndroidManifest.xml";
        return createAppManifest(Fs.fileFromPath(manifestPath));
    }
}
