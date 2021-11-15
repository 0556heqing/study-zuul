package com.heqing.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author heqing
 * @date 2019/7/2 18:32
 */
public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        log.info("---> send : "+request.getMethod());
        log.info("---> to : "+request.getRequestURL().toString());
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            rc.setSendZuulResponse(false);
            rc.setResponseStatusCode(401);
            log.info("---> fail ");
        } else {
            log.info("---> success ");
        }
        return null;
    }
}
