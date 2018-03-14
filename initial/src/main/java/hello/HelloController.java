package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "OK";
    }
    
    @RequestMapping("/10ms")
    public String index10ms() throws InterruptedException {
        Thread.sleep(10);
        return "OK";
    }
    
}
