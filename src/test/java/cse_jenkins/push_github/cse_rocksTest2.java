package cse_jenkins.push_github;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cse_rocksTest2 {

    cse_rocks cal = new cse_rocks();

    @Test
    void test1() {
        int result = cal.mul(2, 3);
        assertEquals(6, result);
    }
}