package com.plumelog.demo;
import com.plumelog.core.TraceId;
import com.plumelog.core.util.IdWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class Interceptor extends HandlerInterceptorAdapter{

    Logger logger = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*logger.info("进：preHandle ++++++++++++++++++++"+TraceId.logTraceID.get());
        String traceId = request.getHeader("TraceId");
        if (StringUtils.isEmpty(traceId)){
            IdWorker worker = new IdWorker(1,1,1);
            TraceId.logTraceID.set(String.valueOf(worker.nextId()));
        }else{
            TraceId.logTraceID.set(traceId);
        }
        logger.info("退：preHandle ++++++++++++++++++++"+TraceId.logTraceID.get());*/
        return true;
    }
}
