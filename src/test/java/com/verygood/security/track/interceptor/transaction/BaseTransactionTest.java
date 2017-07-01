package com.verygood.security.track.interceptor.transaction;

import com.verygood.security.track.BaseTest;
import com.verygood.security.track.interceptor.EntityTrackingTransactionInterceptor;

import org.hibernate.Interceptor;

public abstract class BaseTransactionTest extends BaseTest {

  @Override
  protected Interceptor interceptor() {
    EntityTrackingTransactionInterceptor interceptor = new EntityTrackingTransactionInterceptor();
    interceptor.setEntityTrackingListener(entityTrackingListener);
    return interceptor;
  }
}
