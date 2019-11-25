package org.acme.restclient;

import java.io.IOException;
import javax.inject.Inject;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import org.jboss.logging.Logger;

public class RequestFilter implements ClientRequestFilter {

  private static final Logger log = Logger.getLogger(RequestFilter.class);

  @Inject
  AppConfig config;

  @Inject
  SomeBean bean;

  @Override
  public void filter(ClientRequestContext requestContext) throws IOException {
    log.infof("bean.foo() = <%s> ", bean.foo());
    log.infof("Config.getFoo() = <%s> ", config.getFoo());
  }
}
