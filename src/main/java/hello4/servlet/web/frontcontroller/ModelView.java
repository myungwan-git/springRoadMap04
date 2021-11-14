package hello4.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter @Getter
public class ModelView {
  private String viewPath;
  private Map<String, Object> model = new HashMap<>();
}
