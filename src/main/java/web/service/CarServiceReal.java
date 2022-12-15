package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceReal implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}