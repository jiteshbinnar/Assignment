package HamcrestDemo;

import org.junit.Test;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

public class TestingDemo {
    @Test
    public void endsWithDemo()
    {
        String a="jiteshbinnar100@gmail.com";
        assertThat("jiteshbinnar@gmail.com",endsWith("@"));
    }
    @Test
    public void beginWith()
    {
        String a="jiteshbinnar@gmail.com";
        assertThat("jiteshbinnar@gmail.com",startsWith("j"));
    }
}
