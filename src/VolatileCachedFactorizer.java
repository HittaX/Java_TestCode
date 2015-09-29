/**
 * Created by songzp on 9/3/15.
 */

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

public class VolatileCachedFactorizer implements Servlet {


    private volatile OneValueCache cache =
            new OneValueCache(null,null);
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
//        BigInteger i = extractFrom
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
