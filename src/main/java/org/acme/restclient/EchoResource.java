package org.acme.restclient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@ApplicationScoped
@Path("/echo")
public class EchoResource {
  private static final Logger log = Logger.getLogger(EchoResource.class);

  @RestClient
  @Inject
  EchoService service;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    log.info("HELOO RESOURCE");
    return service.echo();
  }
}