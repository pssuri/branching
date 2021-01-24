package com.myapp.dataaccessobject;

import com.myapp.domainobject.CarDO;
import org.springframework.data.repository.CrudRepository;

/**
 * Database Access Object for car table.
 * feature1 sample comment
 */

public interface CarRepository extends CrudRepository<CarDO, String> {

    CarDO findByLicensePlate(String licensePlate);
}
