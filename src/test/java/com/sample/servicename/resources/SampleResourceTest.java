package com.sample.servicename.resources;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class SampleResourceTest {

  private SampleResource shellResource;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    shellResource = new SampleResource();
  }

  @Test
  public void getSampleTest() {

  }

}
