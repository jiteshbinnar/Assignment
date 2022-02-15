package Hamcrest;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;
public class Test1 {
    @Test
    public void startsWith() {
        String a = "jiteshbinnar100@gmail.com";
        assertThat("jiteshbinnar100@gmail.com", containsString("@"));
    }

}
