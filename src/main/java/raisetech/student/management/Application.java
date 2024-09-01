package raisetech.student.management;

import ch.qos.logback.core.util.StringUtil;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
  private String name = "sakai mamoru";
  private  String age ="33";

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/name")
  public String getName() {
    return name + " " +age +"歳";


  }

  @PostMapping("/name")
  public void setName(String name,String age) {
    this.name = name;
    this.age=age;
  }

  //GET POST
  //GETは取得する、リクエストの結果を受け取る
  //POSTは情報を与える、渡す

}
