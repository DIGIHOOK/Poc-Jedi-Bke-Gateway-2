package poc.jedi.bke.gateway.cucumber.stepdefs;

import poc.jedi.bke.gateway.PocJediBkeGateway2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PocJediBkeGateway2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
