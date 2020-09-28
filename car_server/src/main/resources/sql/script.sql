INSERT INTO `cars`.`brand` (`id`, `name`) VALUES ('1', 'mercedes');
INSERT INTO `cars`.`brand` (`id`, `name`) VALUES ('2', 'bmw');
INSERT INTO `cars`.`brand` (`id`, `name`) VALUES ('3', 'VW');
INSERT INTO `cars`.`brand` (`id`, `name`) VALUES ('4', 'Renault');
INSERT INTO `cars`.`brand` (`id`, `name`) VALUES ('5', 'Audi');

INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('1', 'Polo', '3');
INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('2', 'C230', '1');
INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('3', '5 series', '2');
INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('4', 'logan', '4');
INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('5', 'A6', '5');
INSERT INTO `cars`.`model` (`id`, `name`, `brand_id`) VALUES ('6', 'Polo', '3');

INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('1', 'Horizont');
INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('2', 'Gefest');
INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('3', 'Belwest');
INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('4', 'Marko');
INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('5', 'Kalinka');
INSERT INTO `cars`.`tenant` (`id`, `name`) VALUES ('6', 'Malinka');

INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('1', '3', '6',  'AA 0000-0');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('2', '2', '3',  'AB 1000-7');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('3', '3', '1', 'AA 1111-7');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('4', '4', '4',  'AO 1234-5');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('5', '5', '5',  'AH 1325-7');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('6', '3', '1',  'AP 3265-5');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('7', '2', '3',  'AB 9845-5');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`,  `number`) VALUES ('8', '2', '3',  'AP 6542-7');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`, `number`) VALUES ('9', '5', '5', 'AP 1365-7');
INSERT INTO `cars`.`car` (`id`, `brand_id`, `model_id`, `number`) VALUES ('10', '5', '5', 'AM 3360-7');






