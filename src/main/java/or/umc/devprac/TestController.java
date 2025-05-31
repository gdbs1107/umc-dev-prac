package or.umc.devprac;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @GetMapping("/hello")
    public void hello(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://item.kakaocdn.net/do/b45eb763b6518c8ab5c0e612205a603715b3f4e3c2033bfd702a321ec6eda72c");
    }
}
