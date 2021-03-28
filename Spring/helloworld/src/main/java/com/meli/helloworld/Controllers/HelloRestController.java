package com.meli.helloworld.Controllers;

import com.meli.helloworld.Entities.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {

    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/hello")
    public Greeting sayHello(@RequestParam(value = "name",defaultValue = "Wen") String name){
        return new Greeting(contador.incrementAndGet(),
                "Hi, " + name + " how are you?",
                this.getClass().getSimpleName());
    }

    @GetMapping("/bye/{name}")
    public Greeting sayBye(@PathVariable(value = "name") String name){
        return new Greeting(contador.incrementAndGet(),
                "Hi, " + name + " how are you?",
                this.getClass().getSimpleName());
    }
}
