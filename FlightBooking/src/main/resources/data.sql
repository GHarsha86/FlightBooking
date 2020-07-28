use flight;

CREATE TABLE `airlineinfo`  (
  `airlineid` bigint(20) NOT NULL,
  `airlinelogo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `nameofairline` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`airlineid`) USING BTREE
);


INSERT INTO `airlineinfo` VALUES (1, 'airindia.png', 'Air India'), (6, 'indigo.png', 'Indigo'), (11, 'air-asia.png', 'Air Asia'), (16, 'spicejet.png', 'Spicejet'), (21, 'vistara.png', 'Vistara'), (26, 'truejet.png', 'Trujet'), (31, 'goair.png', 'GoAir');
COMMIT;

	CREATE TABLE `fare`  (
  `fareid` bigint(20) NOT NULL,
  `currency` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `fare` double NOT NULL,
  PRIMARY KEY (`fareid`) USING BTREE
);

INSERT INTO `fare` VALUES (37, 'INR', 4500), (40, 'INR', 3500), (43, 'INR', 5000), (46, 'INR', 2546), (49, 'INR', 7500), (52, 'INR', 10000), (55, 'INR', 7438), (58, 'INR', 8743), (61, 'INR', 1955), (64, 'INR', 2500), (67, 'INR', 4943), (70, 'INR', 4943), (73, 'INR', 4500), (76, 'INR', 6200), (79, 'INR', 5000), (82, 'INR', 1200), (85, 'INR', 1389), (88, 'INR', 11000), (91, 'INR', 15000);
COMMIT;


CREATE TABLE `flightinfo`  (
  `flightinfoid` bigint(20) NOT NULL,
  `flightnumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `flighttype` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `numberofseats` int(11) NOT NULL,
  PRIMARY KEY (`flightinfoid`) USING BTREE
);


INSERT INTO `flightinfo` VALUES (2, 'AI-840', 'Airbus', 150), (3, 'AI-850', 'Airbus', 150), (4, 'AI-860', 'Airbus', 150), (5, 'AI-870', 'Airbus', 150), (7, '6E-6684', 'Airbus', 150), (8, '6E-6685', 'Airbus', 150), (9, '6E-6686', 'Airbus', 150), (10, '6E-6687', 'Airbus', 150), (12, 'I5-755', 'Airbus', 150), (13, 'I5-756', 'Airbus', 150), (14, 'I5-757', 'Airbus', 150), (15, 'I5-758', 'Airbus', 150), (17, 'SG-432', 'Airbus', 150), (18, 'SG-433', 'Airbus', 150), (19, 'SG-434', 'Airbus', 150), (20, 'SG-435', 'Airbus', 150), (22, 'UK-830', 'Airbus', 150), (23, 'UK-831', 'Airbus', 150), (24, 'UK-832', 'Airbus', 150), (25, 'UK-833', 'Airbus', 150), (27, '2T-518', 'Airbus', 150), (28, '2T-519', 'Airbus', 150), (29, '2T-520', 'Airbus', 150), (30, '2T-521', 'Airbus', 150), (32, 'G8-424', 'Airbus', 150), (33, 'G8-425', 'Airbus', 150), (34, 'G8-426', 'Airbus', 150), (35, 'G8-427', 'Airbus', 150);
COMMIT;



CREATE TABLE `inventory`  (
  `invid` bigint(20) NOT NULL,
  `count` int(11) NOT NULL,
  PRIMARY KEY (`invid`) USING BTREE
);

INSERT INTO `inventory` VALUES (38, 100), (41, 98), (44, 100), (47, 100), (50, 100), (53, 100), (56, 100), (59, 100), (62, 100), (65, 100), (68, 100), (71, 100), (74, 100), (77, 100), (80, 100), (83, 120), (86, 100), (89, 100), (92, 100);
COMMIT;




CREATE TABLE `bookingrecord`  (
  `bookingid` bigint(20) NOT NULL,
  `bookingdate` datetime(0) NULL DEFAULT NULL,
  `destination` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `fare` double NOT NULL,
  `flightdate` date NULL DEFAULT NULL,
  `flightnumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `flighttime` time(0) NULL DEFAULT NULL,
  `origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bookingid`) USING BTREE
);

INSERT INTO `bookingrecord` VALUES (93, '2020-07-14 10:44:19', 'HYDERABAD', 3500, '2020-08-21', 'AI-850', '01:15:00', 'DELHI', 'Confirmed');
COMMIT;



CREATE TABLE `flightsinfo`  (
  `airlineid` bigint(20) NOT NULL,
  `flightinfoid` bigint(20) NOT NULL,
  UNIQUE INDEX `UK_mnghyk14c0ufcb2gs2k6fab40`(`flightinfoid`) USING BTREE,
  INDEX `FKm5m2579nqtr1wele0bimvme8m`(`airlineid`) USING BTREE,
  CONSTRAINT `FKlda61sltnw69kxw7b0gx6sj5s` FOREIGN KEY (`flightinfoid`) REFERENCES `flightinfo` (`flightinfoid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKm5m2579nqtr1wele0bimvme8m` FOREIGN KEY (`airlineid`) REFERENCES `airlineinfo` (`airlineid`) ON DELETE RESTRICT ON UPDATE RESTRICT
);

INSERT INTO `flightsinfo` VALUES (1, 2), (1, 3), (1, 4), (1, 5), (6, 7), (6, 8), (6, 9), (6, 10), (11, 12), (11, 13), (11, 14), (11, 15), (16, 17), (16, 18), (16, 19), (16, 20), (21, 22), (21, 23), (21, 24), (21, 25), (26, 27), (26, 28), (26, 29), (26, 30), (31, 32), (31, 33), (31, 34), (31, 35);
COMMIT;



CREATE TABLE `flight`  (
  `id` bigint(20) NOT NULL,
  `destination` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `duration` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `flightdate` date NULL DEFAULT NULL,
  `flightnumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `flighttime` time(0) NULL DEFAULT NULL,
  `origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `fareid` bigint(20) NULL DEFAULT NULL,
  `flightinfoid` bigint(20) NULL DEFAULT NULL,
  `invid` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKpekyhxlpp2g4l0emd9vj9qjvc`(`fareid`) USING BTREE,
  INDEX `FKh342xxi0c2ciiqifrhhc9g2kf`(`flightinfoid`) USING BTREE,
  INDEX `FKi31ay2wj2odp6ij5uvfunmk0y`(`invid`) USING BTREE,
  CONSTRAINT `FKh342xxi0c2ciiqifrhhc9g2kf` FOREIGN KEY (`flightinfoid`) REFERENCES `flightinfo` (`flightinfoid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKi31ay2wj2odp6ij5uvfunmk0y` FOREIGN KEY (`invid`) REFERENCES `inventory` (`invid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKpekyhxlpp2g4l0emd9vj9qjvc` FOREIGN KEY (`fareid`) REFERENCES `fare` (`fareid`) ON DELETE RESTRICT ON UPDATE RESTRICT
);

INSERT INTO `flight` VALUES (36, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'AI-840', '02:12:00', 'DELHI', 37, 2, 38), (39, 'HYDERABAD', '2 hrs 45 mins', '2020-08-21', 'AI-850', '01:15:00', 'DELHI', 40, 3, 41), (42, 'MUMBAI', '2 hrs 50 mins', '2020-08-21', 'AI-860', '02:30:00', 'CHENNAI', 43, 4, 44), (45, 'HYDERABAD', '1 hrs 45 mins', '2020-08-21', 'AI-870', '02:45:00', 'PUNE', 46, 5, 47), (48, 'PORTBLAIR', '3 hrs 00 mins', '2020-08-21', '6E-6684', '03:00:00', 'CHENNAI', 49, 7, 50), (51, 'DELHI', '3 hrs 15 mins', '2020-08-21', '6E-6685', '03:15:00', 'BENGULURU', 52, 8, 53), (54, 'PUNE', '4 hrs 07 mins', '2020-08-21', '6E-6686', '03:15:00', 'DELHI', 55, 9, 56), (57, 'MANGALORE', '3 hrs 30 mins', '2020-08-21', '6E-6687', '03:15:00', 'HYDERABAD', 58, 10, 59), (60, 'AHMADABAD', '6 hrs 00 mins', '2020-08-21', 'I5-755', '04:30:00', 'MUMBAI', 61, 12, 62), (63, 'KOLKATA', '3 hrs 15 mins', '2020-08-21', 'I5-756', '04:45:00', 'HYDERABAD', 64, 13, 65), (66, 'DELHI', '1 hrs 00 mins', '2020-08-21', 'I5-757', '07:45:00', 'KOLKATA', 67, 14, 68), (69, 'MUMBAI', '1 hrs 00 mins', '2020-08-21', 'SG-434', '11:45:00', 'DELHI', 70, 19, 71), (72, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'SG-435', '02:45:00', 'DELHI', 73, 20, 74), (75, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'UK-830', '10:15:00', 'DELHI', 76, 22, 77), (78, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'UK-831', '11:30:00', 'DELHI', 79, 23, 80), (81, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'UK-832', '11:55:00', 'DELHI', 82, 24, 83), (84, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', 'UK-833', '11:55:00', 'DELHI', 85, 25, 86), (87, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', '2T-518', '10:15:00', 'DELHI', 88, 27, 89), (90, 'CHENNAI', '2 hrs 15 mins', '2020-08-21', '2T-519', '19:35:00', 'DELHI', 91, 28, 92);
COMMIT;

CREATE TABLE `passenger`  (
  `passengerid` bigint(20) NOT NULL,
  `emailaddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `firstname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `lastname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `mobilenumber` bigint(20) NOT NULL,
  `bookingid` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`passengerid`) USING BTREE,
  INDEX `FKl88xs6x4f3sniu0kyyxi2qetl`(`bookingid`) USING BTREE,
  CONSTRAINT `FKl88xs6x4f3sniu0kyyxi2qetl` FOREIGN KEY (`bookingid`) REFERENCES `bookingrecord` (`bookingid`) ON DELETE RESTRICT ON UPDATE RESTRICT
);

INSERT INTO `passenger` VALUES (94, 'praveen@abc.com', 'Praveen', 'Male', 'Reddy', 1212121212, 93), (95, 'james@abc.com', 'James', 'Male', 'Goedic', 3243654321, 93);
COMMIT;



CREATE TABLE `bookingdetails`  (
  `bookingid` bigint(20) NOT NULL,
  `passengerid` bigint(20) NOT NULL,
  UNIQUE INDEX `UK_m9f07ovxqj00puevb0g5o2c4w`(`passengerid`) USING BTREE,
  INDEX `FKl5h29vblxp8bu7eoamyob4877`(`bookingid`) USING BTREE,
  CONSTRAINT `FKl5h29vblxp8bu7eoamyob4877` FOREIGN KEY (`bookingid`) REFERENCES `bookingrecord` (`bookingid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKt7035yt3ss88xi52jlvsmsbld` FOREIGN KEY (`passengerid`) REFERENCES `passenger` (`passengerid`) ON DELETE RESTRICT ON UPDATE RESTRICT
);

INSERT INTO `bookingdetails` VALUES (93, 94), (93, 95);
COMMIT;
