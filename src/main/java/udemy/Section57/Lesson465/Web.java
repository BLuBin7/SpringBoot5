package udemy.Section57.Lesson465;

/**
 * Created by Binh
 * Date : 2/19/2023 - 6:00 PM
 * Description :
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("add")
public class Web {
    @GetMapping(value="/hello")
    public String sayHello(){
        return "Hello World";
    }
}
