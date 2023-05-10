package gg.example.jBehaveProjectTest;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.Arrays;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class Runner extends JUnitStories {

	public Runner() {
		super();
		
		new Configuration() {};
	}
	
	@Override
    public Configuration configuration() {
        return new MostUsefulConfiguration(); 
    }

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new ggSearchStep());
	}

	@Override
    public List<String> storyPaths(){
		StoryFinder finder = new StoryFinder();
    	String searchIn = codeLocationFromClass(this.getClass()).getFile();
    	return finder.findPaths(searchIn,Arrays.asList("**/*.story"), null);
    }
}
