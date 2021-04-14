package com.gordeev.server.webserver.repos;

import org.springframework.data.repository.CrudRepository;
import com.gordeev.server.webserver.domain.Device;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DeviceRepo extends CrudRepository<Device, Long> {

}