package org.librairy.service.space.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.librairy.service.space.facade.model.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyService.class)
@WebAppConfiguration
public class MyServiceTest {


    @Autowired
    MyService service;

    @Test
    public void add() throws IOException {

        Point point = Point.newBuilder().setId("id").setName("name").setType("type").setShape(Arrays.asList(new Double[]{0.1,0.2})).build();

        boolean result = service.add(point);

        Assert.assertFalse(result);
    }
}