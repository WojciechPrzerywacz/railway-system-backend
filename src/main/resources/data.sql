INSERT INTO locomotive (id, engine_power, max_load, locomotive_name) VALUES (1, 4000, 1000, 'Parowóz3000'), (2, 7000, 7000, 'Pendolino'), (3, 15000, 20000, 'PKPINTERCITY');
INSERT INTO wagon (id,type,max_load, load_weight ) VALUES (1,'cargo', 1000, 400),(2,'carriage', 600, 400),(3,'cargo', 1000, 800),
(4,'carriage', 600, 500),(5,'tank', 800, 550),(6,'tank', 900, 750);
INSERT INTO train (id, locomotive_id) VALUES (1,1), (2,2);
INSERT INTO train_wagons (train_id, wagons_id) VALUES (1,1), (1,2);
INSERT INTO train_wagons (train_id, wagons_id) VALUES (2,1), (2,2);
INSERT INTO passages(id, start, destination, train_id) VALUES (1, 'Działoszyn', 'Honolulu', 1);