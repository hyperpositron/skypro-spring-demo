package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return "hello";
    }
//    @GetMapping(path = "/hello")
//    public String answerHello(){
//        return "<b>hello</b>";
//    }
    @GetMapping(path = "/hello")    //http://localhost:8080/hello?name=alan
    public String answerHello(@RequestParam("name")String userName){
        return "<b>hello </b>" + userName;
    }

    @GetMapping(path = "/vam_suda") //http://localhost:8080/vam_suda
    public String Ere() {
        return "<b>куда?? </b>";
    }
}
