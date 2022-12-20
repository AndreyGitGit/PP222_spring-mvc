package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.Collections;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return Collections.emptyList();
        }
        return carDao.getCars(count);
    }
}
