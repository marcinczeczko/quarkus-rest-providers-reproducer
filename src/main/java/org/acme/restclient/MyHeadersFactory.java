package org.acme.restclient;

import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;
import org.jboss.logging.Logger;

public class MyHeadersFactory implements ClientHeadersFactory {
  private static final Logger log = Logger.getLogger(MyHeadersFactory.class);
  @Inject
  AppConfig config;

  @Inject
  SomeBean bean;

  @Override
  public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders, MultivaluedMap<String, String> clientOutgoingHeaders) {
    MultivaluedMap headers = new MultivaluedHashMap();

    log.infof("SomeBean = <%s> ", bean);
    log.infof("AppConfig = <%s> ", config);

    headers.add("x-config-header", config != null ? config.getFoo() : "<null>");
    headers.add("x-bean-header", bean != null ? bean.foo() : "<null>");
    return headers;
  }
}
