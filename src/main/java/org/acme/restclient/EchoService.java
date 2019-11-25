package org.acme.restclient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/")
@ApplicationScoped
@RegisterRestClient
@RegisterProvider(RequestFilter.class)
public interface EchoService {

  @GET
  @Path("/plain")
  String echo();
}
