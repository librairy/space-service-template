package org.librairy.service.space.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.librairy.service.space.AvroClient;
import org.librairy.service.space.facade.model.Point;
import org.librairy.service.space.services.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AvroController.class,MyService.class})
@WebAppConfiguration
public class AvroTest {

    private static final Logger LOG = LoggerFactory.getLogger(AvroTest.class);

    @Test
    public void addTest() throws InterruptedException, IOException {

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        client.open(host,port);

        Point point = Point.newBuilder().setId("id").setName("name").setType("type").setShape(Arrays.asList(new Double[]{0.1,0.2})).build();

        client.add(point);

        client.close();
    }


}