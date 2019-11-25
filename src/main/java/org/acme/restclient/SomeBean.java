package org.acme.restclient;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomeBean {

  public String foo() {
    return "service-bar";
  }
}
