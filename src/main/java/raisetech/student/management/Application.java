package raisetech.student.management;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//
@SpringBootApplication
@RestController
public class Application {

  private String name = "Sakai Mamoru";
  private String age = "33";
  private Map<String, String> student = new HashMap<>() {
    {
      put("A", "10");
      put("B", "20");
      put("C", "30");
      put("D", "33");
    }
  };

  //複数の情報を登録したらどうなる
  //マップの中の一部の情報を更新したい

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/studentInfo")
  public String getStudentInfo() {
    return name + " " + age + "歳";
  }

  @PostMapping("/studentInfo")
  public void setStudentInfo(String name, String age) {
    this.name = name;
    this.age = age;
  }

  @PostMapping("/studentName")
  public void updateStudentInfo(String name) {
    this.name = name;
  }

  @GetMapping("/studentMap")
  public Map<String, String> getStudent() {
    return student;
  }

  @PostMapping("updateStudentMap")
  public void updateStudentMap(String name, String age) {
    if (student.containsKey(name)) {
      student.put(name, age);
    } else {
    }
  }
}


