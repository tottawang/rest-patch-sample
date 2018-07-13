package com.sample.servicename.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sample")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

  @PATCH
  public void patchSample(Book bookUpdate) {
    System.out.println(bookUpdate.getTitle());
    if (bookUpdate.getSubTitle() != null) {
      if (bookUpdate.getSubTitle().isPresent()) {
        System.out.println("Subtitle exists: " + bookUpdate.getSubTitle().get());
      } else {
        System.out.println("Subtitle exists but its null");
      }
    } else {
      System.out.println("Subtitle doesn't exist");
    }
  }

}
