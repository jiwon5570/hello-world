package hello.world.common;

import hello.world.BoundedContext974Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext974Application.class })
public class CucumberSpingConfiguration {}
