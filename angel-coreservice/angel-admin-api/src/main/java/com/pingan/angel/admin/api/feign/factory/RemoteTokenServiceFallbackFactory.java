package com.pingan.angel.admin.api.feign.factory;

import com.pingan.angel.admin.api.feign.fallback.RemoteTokenServiceFallbackImpl;
import com.pingan.angel.admin.api.feign.RemoteTokenService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author lengleng
 * @date 2019/2/1
 */
@Component
public class RemoteTokenServiceFallbackFactory implements FallbackFactory<RemoteTokenService> {

	@Override
	public RemoteTokenService create(Throwable throwable) {
		RemoteTokenServiceFallbackImpl remoteTokenServiceFallback = new RemoteTokenServiceFallbackImpl();
		remoteTokenServiceFallback.setCause(throwable);
		return remoteTokenServiceFallback;
	}
}
