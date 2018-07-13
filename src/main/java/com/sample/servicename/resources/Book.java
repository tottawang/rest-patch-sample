package com.sample.servicename.resources;

import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

public class Book {

  String title;
  Optional<JsonNode> subTitle;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Optional<JsonNode> getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(Optional<JsonNode> subTitle) {
    this.subTitle = subTitle;
  }

}
