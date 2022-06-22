package devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "빌드가 자동으로 되는지 테스트111111111111111111111이제 배포도 되는가???";
    }
}
