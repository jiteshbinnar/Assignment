package BusinessDemo;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SimpleMockTesting {
    @Test
    public void listingObjects() {
        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);
        when(mocklist.get(0)).thenReturn("No Object Found");
        Assert.assertEquals(1, mocklist.size());
        Assert.assertEquals(2, mocklist.size());
        Assert.assertEquals(3, mocklist.size());
        Assert.assertEquals(4, mocklist.size());
        Assert.assertEquals("No Object Found", mocklist.get(0));
        System.out.println(mocklist.size());
        System.out.println(mocklist);
    }
}