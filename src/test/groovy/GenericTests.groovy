import com.paymentcomponents.common.Utils
import org.junit.Assert
import org.junit.Test

/**
 * Created by aalexandrakis on 08/04/2017.
 */
class GenericTests {

    @Test
    public void excludedUris() {
        String excludedPaths = "/authentication/init,/v2/api-docs,/swagger-ui.html"
        String excludedPaths2 = "/authentication/init,/v2/api-docs,/swagger-ui.html, /webjars/.*"
        String currentPath = "/swagger-ui.html"
        String currentPath2 = "/webjars/*"
        String currentCheckPath = "/checkit"
        String excludedVerbs = "OPTIONS"
        String currentVerb = "GET"

        Assert.assertFalse(Utils.filterUri(currentVerb, currentPath, excludedVerbs.split(","), excludedPaths.split(",")))
        Assert.assertFalse(Utils.filterUri("OPTIONS", currentPath, excludedVerbs.split(","), excludedPaths.split(",")))
        Assert.assertTrue(Utils.filterUri(currentVerb, currentCheckPath, excludedVerbs.split(","), excludedPaths.split(",")))
        Assert.assertFalse(Utils.filterUri(currentVerb, currentPath2, excludedVerbs.split(","), excludedPaths2.split(",")))
    }
}
