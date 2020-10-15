package com.example.javaanli.demo.support;


import com.example.javaanli.demo.annotation.LogRecord;
import com.example.javaanli.demo.entity1.LogInfo;
import com.example.javaanli.demo.service1.LogInfoServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

@Component
@Aspect
public class LogAopImpl {

    @Autowired
    private LogInfoServiceImpl logInfoService;
/*
	    标识这个方法是个前置通知,  切点表达式表示执行任意类的任意方法.
	    第一个 * 代表匹配任意修饰符及任意返回值,
	    第二个 * 代表任意类的对象,
	    第三个 * 代表任意方法,
	    参数列表中的 ..  匹配任意数量的参数
	 */


    //    @Pointcut("@annotation(com.example.javaanli.demo.annotation.LogRecord)","execution(public * com.didispace.web..*.*(..))")
    @Pointcut("execution(public * com.example.javaanli.demo..*.*(..))")
    public void controllerLog() {

    }

        @Around("controllerLog()")
        public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
            System.out.println("计入日志");
            HttpServletRequest httpServletRequest = getHttpServletRequest();
            if (httpServletRequest == null) {
                return null;
            }
            LogInfo logInfo = new LogInfo();
            /*从切面值入点获取植入点方法*/
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            /*获取切入点方法*/
            Method method = signature.getMethod();
            /*获取方法上的值*/
            LogRecord systemControllerLog = method.getAnnotation(LogRecord.class);
            Object proceed = joinPoint.proceed();
            /*保存操作事件*/
            if (systemControllerLog != null && proceed != null) {
                String operation = systemControllerLog.operation();
                /*保存日志类型*/
                logInfo.setLogOp(operation);
                String type = systemControllerLog.type();
                logInfo.setLogType(type);
//                String token = httpServletRequest.getHeader("token");
//                if (StringUtils.isBlank(token)) {
//                    return null;
//                }
//                User user = JWTUtil.unsign(token, User.class);
//                if (user == null) {
//                    return null;
//                }
//                logInfo.setUserId(user.getId());
                logInfo.setUrl(httpServletRequest.getRequestURI());
                logInfo.setCreateTime(new Date());

                logInfoService.insertLog(logInfo);

            }
            return proceed;
        }


        private HttpServletRequest getHttpServletRequest() {
            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes) ra;
            return sra != null ? sra.getRequest() : null;
        }
}
