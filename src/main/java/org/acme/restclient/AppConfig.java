package org.acme.restclient;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "myapp")
public class AppConfig {

  private String foo;

  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }
}
