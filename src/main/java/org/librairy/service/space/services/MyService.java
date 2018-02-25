package org.librairy.service.space.services;

import org.apache.avro.AvroRemoteException;
import org.librairy.service.space.facade.model.Neighbour;
import org.librairy.service.space.facade.model.Point;
import org.librairy.service.space.facade.model.PointList;
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
    public boolean addPoint(Point point) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public Point getPoint(String s) throws AvroRemoteException {
        //TODO
        return null;
    }

    @Override
    public boolean removePoint(String s) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public boolean removeAll() throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public PointList listPoints(int i, String s) throws AvroRemoteException {
        //TODO
        return new PointList("", Collections.emptyList());
    }

    @Override
    public boolean index(double v) throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public boolean isIndexed() throws AvroRemoteException {
        //TODO
        return false;
    }

    @Override
    public double compare(List<Double> list, List<Double> list1) throws AvroRemoteException {
        return 0;
    }

    @Override
    public List<Neighbour> getNeighbours(String s, int i, List<String> s1) throws AvroRemoteException {
        //TODO
        return Collections.emptyList();
    }

    @Override
    public List<Neighbour> getSimilar(List<Double> list, int i, List<String> s) throws AvroRemoteException {
        //TODO
        return Collections.emptyList();
    }
}
