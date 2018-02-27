package hello.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class NewsFeedController {

  @RequestMapping(method=RequestMethod.GET)
  public String index() {
    return "index";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/news")
  public String getNews() {
    return "news";
  }

}
