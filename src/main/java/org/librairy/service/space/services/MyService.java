package org.librairy.service.space.services;

import org.apache.avro.AvroRemoteException;
import org.librairy.service.space.facade.model.Neighbour;
import org.librairy.service.space.facade.model.Point;
import org.librairy.service.space.facade.model.SpaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Component
public class MyService implements SpaceService {

    private static final Logger LOG = LoggerFactory.getLogger(MyService.class);

    @Value("#{environment['RESOURCE_FOLDER']?:'${resource.folder}'}")
    String resourceFolder;

    String model              ;

    @PostConstruct
    public void setup() throws IOException {

        //// Load resources
        //model              = Paths.get(resourceFolder,"resource.bin").toFile().getAbsolutePath();

        LOG.info("Service initialized");
    }


    @Override
    public boolean add(Point point) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public Point get(String s) throws AvroRemoteException {
        //TODO
        return null;
    }

    @Override
    public boolean remove(String s) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public boolean removeAll() throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public List<Point> list(int i, String s) throws AvroRemoteException {
        //TODO
        return Collections.emptyList();
    }

    @Override
    public boolean index(double v) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public List<Neighbour> neighbours(String s, int i, String s1) throws AvroRemoteException {
        //TODO
        return Collections.emptyList();
    }

    @Override
    public List<Neighbour> similar(List<Double> list, int i, String s) throws AvroRemoteException {
        //TODO
        return Collections.emptyList();
    }
}
