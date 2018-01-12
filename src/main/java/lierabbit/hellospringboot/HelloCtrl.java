package lierabbit.hellospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCtrl
{
    @RequestMapping("/")//将地址映射到 / 即访问http://localhost:8080 就可以进入这个方法
    @ResponseBody//返回数据
    public String hello()
    {
        return "hello spring boot";
    }
}
