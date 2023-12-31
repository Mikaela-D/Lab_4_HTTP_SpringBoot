package atu.ie.http_springboot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "https//jsonplaceholder.typicode.com")
public interface TodoClient {

    @GetMapping("/todos/1")
    TodoResponse fetchData();
}
