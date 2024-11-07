insert into measurement(value, raining, sensor_id)
values(-3, false, 1);
insert into measurement(value, raining, sensor_id)
values(-5, true, 1);
insert into measurement(value, raining, sensor_id)
values(1, false, 1);


select sensor.name, measurement.id, measurement.value,
       measurement.raining from sensor join measurement
       on sensor.id = measurement.sensor_id;