package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
  private final RestTemplate restTemplate;

  public ProductController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/front/products")
  public String getAllProducts(Model model) {
    return restTemplate.getForObject("http://product-back/getAllProducts", String.class);
  }
}
