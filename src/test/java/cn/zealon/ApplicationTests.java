package cn.zealon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {

        String abc = "";
        System.out.println(abc.hashCode());
        System.out.println(System.currentTimeMillis());
    }

}
