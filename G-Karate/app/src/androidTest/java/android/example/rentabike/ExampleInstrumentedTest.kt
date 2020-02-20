package android.example.rentabike

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented HomeActivity, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under HomeActivity.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("eu.laramartin.master_detailsample", appContext.packageName)
    }
}
