-- MySQL dump 10.13  Distrib 8.2.0, for Win64 (x86_64)
--
-- Host: calomatic-db.mysql.database.azure.com    Database: testdb
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `my_row_id` bigint unsigned NOT NULL AUTO_INCREMENT /*!80023 INVISIBLE */,
  `Chinesename` text,
  `foodName` text,
  `Calories` int DEFAULT NULL,
  `Carb` double DEFAULT NULL,
  `Protein` double DEFAULT NULL,
  `Fat` double DEFAULT NULL,
  PRIMARY KEY (`my_row_id`)
) ENGINE=InnoDB AUTO_INCREMENT=252 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` (`my_row_id`, `Chinesename`, `foodName`, `Calories`, `Carb`, `Protein`, `Fat`) VALUES (1,'米饭','Rice',116,25,2.5,0.2),(2,'馒头','Steamed Bun',223,45,7,1),(3,'面包','Bread',313,60,9,3.5),(4,'全麦面包','Whole Wheat Bread',254,47,12,2),(5,'法棍','Baguette',372,76,13,3.7),(6,'黑麦面包','Rye Bread',229,48,8.5,1.2),(7,'煮玉米','Boiled Corn',84,19,2.7,1),(8,'蒸白薯','Steamed White Sweet Potato',96,22,1.7,0.2),(9,'蒸红薯','Steamed Red Sweet Potato',65,15,1.5,0.1),(10,'蒸紫薯','Steamed Purple Sweet Potato',117,27,2,0.3),(11,'蒸土豆','Steamed Potato',69,16,2,0.1),(12,'蒸山药','Steamed Chinese Yam',54,13,1.5,0.2),(13,'煮芋头','Boiled Taro',60,15,1,0.2),(14,'燕麦片','Oatmeal',338,60,13,7),(15,'薏米饭','Job\'s Tears Rice',132,28,4.5,1),(16,'红豆饭','Red Bean Rice',116,24,7.5,0.5),(17,'糙米饭','Brown Rice',116,24,2.5,1),(18,'黑米饭','Black Rice',115,24,3,1),(19,'小米饭','Millet Rice',120,23,3.5,1),(20,'藜麦（熟）','Cooked Quinoa',120,21,4,1.9),(21,'小米粥','Millet Porridge',46,10,1,0.5),(22,'绿豆粥','Mung Bean Porridge',49,11,3,0.3),(23,'百合山药粥','Lily and Chinese Yam Porridge',35,8,1,0.1),(24,'白粽子','Plain Rice Dumpling',118,25,2,0.5),(25,'烧肉粽','Meat Rice Dumpling',231,30,8,10),(26,'小米杂粮粥','Millet and Mixed Grain Porridge',138,29,4.2,1),(27,'无糖八宝粥','Sugar-Free Eight Treasure Porridge',133,28,3,1),(28,'南瓜小米粥','Pumpkin Millet Porridge',54,12,1.5,0.2),(29,'薏米红豆粥','Barley and Red Bean Porridge',78,16,3.5,0.5),(30,'米粉（干）','Dry Rice Noodles',349,80,7,0.5),(31,'荞麦面（湿）','Wet Buckwheat Noodles',150,30,5.5,1),(32,'煮魔芋面','Boiled Konjac Noodles',21,3,0,0),(33,'意大利面（通心粉)','Pasta',351,71,12,2),(34,'年糕','Rice Cake',220,50,4,1),(35,'蚕豆（煮）','Boiled Broad Beans',62,11,4.5,0.5),(36,'鹰嘴豆（熟)','Cooked Chickpeas',160,27,8.5,2.6),(37,'无糖藕粉','Sugar-Free Lotus Root Powder',373,88,5,0.1),(38,'苹果','Apple',53,14,0.3,0.2),(39,'橘子','Tangerine',44,11.2,0.8,0.2),(40,'橙子','Orange',48,12,0.9,0.2),(41,'草莓','Strawberry',32,7.7,0.7,0.3),(42,'西瓜','Watermelon',32,8,0.6,0.2),(43,'桃子','Peach',42,10,0.9,0.3),(44,'红心火龙果','Red Dragon Fruit',50,13,1.1,0.4),(45,'猕猴桃','Kiwi',61,14.7,1.1,0.5),(46,'蓝莓','Blueberry',57,14.5,0.7,0.3),(47,'柚子','Grapefruit',42,10.7,0.8,0.1),(48,'梨','Pear',51,13.8,0.4,0.3),(49,'葡萄','Grape',45,18.1,0.7,0.2),(50,'菠萝','Pineapple',44,11.4,0.5,0.1),(51,'樱桃','Cherry',46,12,1,0.3),(52,'丑柑','Ugly Mandarin',37,9.3,0.7,0.2),(53,'甜瓜','Melon',26,6.4,0.6,0.2),(54,'西柚','Pomelo',33,8.6,0.8,0.2),(55,'杨梅','Bayberry',30,7.6,0.4,0.1),(56,'番石榴','Guava',53,14,2.6,0.4),(57,'番茄','Tomato',15,3.5,0.9,0.2),(58,'黄瓜','Cucumber',16,3.6,0.7,0.1),(59,'生菜（煮）','Cooked Lettuce',16,2.9,1.3,0.2),(60,'水煮西兰花','Boiled Broccoli',26,5.1,2.8,0.4),(61,'拌金针菇','Mixed Enokitake',72,14,2.5,0.5),(62,'大白菜（煮)','Boiled Chinese Cabbage',14,3.1,1.2,0.2),(63,'炒胡萝卜片','Stir-fried Carrot Slices',56,10.6,1.1,3.3),(64,'菠菜（煮）','Boiled Spinach',23,3.7,2.9,0.4),(65,'蚝油包菜','Oyster Sauce Cabbage',40,6.2,2.1,2.2),(66,'上海青（煮）','Boiled Shanghai Bok Choy',12,2.2,1.5,0.2),(67,'清炒娃娃菜','Stir-fried Baby Cabbage',24,4.7,2.4,0.3),(68,'素炒小白菜','Stir-fried Small Bok Choy',31,4.2,3.1,0.7),(69,'凉拌木耳','Cold Black Fungus',51,12.3,1.7,0.2),(70,'白萝卜（煮）','Boiled White Radish',17,3.9,0.6,0.1),(71,'豆芽（绿豆芽）','Mung Bean Sprouts',16,2.6,1.8,0.1),(72,'花菜（煮)','Boiled Cauliflower',23,4.5,1.9,0.5),(73,'清炒油麦菜','Stir-fried Lettuce',28,5.4,2,0.3),(74,'清炒杏鲍菇','Stir-fried King Oyster Mushroom',56,10.4,2.2,0.3),(75,'凉拌茄子','Cold Eggplant',32,7.5,1,0.2),(76,'菜心（煮）','Boiled Choy Sum',27,3,2.6,0.7),(77,'清炒西葫芦','Stir-fried Zucchini',44,8.1,1.4,0.8),(78,'素炒莴笋','Stir-fried Celtuce',47,8.4,2,0.3),(79,'烧花菜','Roasted Cauliflower',46,4.7,3,2.5),(80,'凉拌海带','Cold Kelp',32,6.7,1.7,0.5),(81,'油菜（煮)','Boiled Rape',14,2,1.8,0.2),(82,'紫甘蓝（煮）','Boiled Red Cabbage',29,6.6,1.4,0.3),(83,'烫空心菜','Blanched Water Spinach',33,3,2.6,0.4),(84,'黄豆（煮)','Boiled Soybeans',172,9.9,16.6,9),(85,'黑豆（煮)','Boiled Black Beans',130,24.4,8.9,0.5),(86,'青豆（煮）','Boiled Green Beans',141,25.8,9.4,0.4),(87,'水煮豆腐','Boiled Tofu',117,2.2,12.8,7),(88,'内酯豆腐','Soft Tofu',50,1.9,5.5,2.7),(89,'豆腐（南）','Southern Tofu',87,2.4,8.1,4.8),(90,'包浆豆腐','Tofu with a thick layer',108,1.5,11,6.9),(91,'炖冻豆腐','Stewed Frozen Tofu',48,1.2,5.4,2.3),(92,'豆腐花','Tofu Pudding',15,0.1,2.1,0.6),(93,'豆渣','Okara or Soy Pulp',76,12,4.7,1.2),(94,'千张','Thousand-layer Tofu',262,20.2,17.3,20.1),(95,'豆腐干（白干）','Dried Tofu Sticks',197,7.4,23.5,12),(96,'五香素鸡','Five-spice Tofu',183,10,17.5,9),(97,'纳豆','Natto',211,14.4,18.5,11),(98,'豆浆','Soy Milk',31,3.3,2.9,1.6),(99,'黑豆浆','Black Soy Milk',39,4,3.3,2),(100,'豆汁（生）','Raw Soybean Juice',10,1,1,0.5),(101,'酸豆奶','Fermented Soy Milk',67,6.3,3.5,2.8),(102,'核桃（干）','Dried Walnuts',646,13.7,15.2,65.2),(103,'花生','Peanuts',313,16.1,26.3,49.2),(104,'腰果','Cashews',559,30.2,18.2,43.8),(105,'黑芝麻','Black Sesame Seeds',559,25.5,17.7,49.7),(106,'栗子','Chestnuts',214,45.5,3.2,2.2),(107,'开心果','Pistachios',631,28,20.3,52.5),(108,'杏仁','Almonds',578,21.6,21.1,49.9),(109,'瓜子仁','Sunflower Seeds',615,20,20.8,51.5),(110,'巴旦木（扁桃仁）','Almonds',540,19.7,20,47.7),(111,'碧根果','Pecans',691,13.9,9.2,71.2),(112,'南瓜子','Pumpkin Seeds',582,10.7,30.2,49),(113,'莲子（干）','Dried Lotus Seeds',350,64.3,17,1.1),(114,'榛子','Hazelnuts',561,16.7,15,60.8),(115,'夏威夷果','Macadamia Nuts',718,13.8,7.9,75.8),(116,'松子','Pine Nuts',553,13.1,13.7,68.4),(117,'白芝麻','White Sesame Seeds',536,23.4,17.7,47.5),(118,'亚麻籽','Flax Seeds',506,28.9,18.3,42.2),(119,'山核桃','Hickory Nuts',616,18.2,13.7,64.5),(120,'黑花生','Black Peanuts',570,16.1,25.8,49.2),(121,'麻辣烫','Spicy Hot Pot, mostly veggie',87,10.2,4.3,3.2),(122,'豆腐包子','Tofu Bun',190,25.3,7.8,6.2),(123,'鸡蛋肠粉','Egg Rice Noodle Roll',99,18.1,3.2,1.5),(124,'饺子/馄饨','Dumplings with veggie filling',198,22,7.8,6.2),(125,'花菜炒肉','Cauliflower Fried with Meat',83,5.1,6.8,3.2),(126,'苦瓜炒肉','Bitter Melon Fried with Meat',108,6,8.4,4.2),(127,'西兰花炒虾仁','Broccoli Fried with Shrimp',60,3.1,7.3,1.2),(128,'番茄龙利鱼','Tomato with Dragon Fish',64,4.2,7.9,0.7),(129,'白菜炖豆腐','Cabbage Stewed with Tofu',62,3.9,6.4,1.2),(130,'芹菜肉丝炒香干','Celery and Meat Strips Fried with Dried Tofu',81,4.2,7.3,3.1),(131,'小葱拌豆腐','Tofu Mixed with Green Onion',37,1.2,5.5,2.3),(132,'蒜蓉蒸茄子','Steamed Eggplant with Garlic Sauce',59,7.1,1.5,3.7),(133,'胡萝卜炒木耳','Carrot Fried with Black Fungus',43,6.3,2.1,0.5),(134,'炒青豆玉米','Fried Green Peas with Corn',126,17.8,3.9,4.1),(135,'西红柿炒西葫芦','Tomato Fried with Zucchini',36,6.4,1.8,0.3),(136,'番茄炒菜花','Tomato Fried with Cauliflower',43,6.5,2.1,0.4),(137,'清炒山药木耳','Stir-fried Yam with Black Fungus',92,20.3,2,0.2),(138,'西兰花炒胡萝卜','Broccoli Fried with Carrot',35,4.8,2.5,0.3),(139,'青椒炒鸡蛋','Green Pepper Fried with Egg',96,1.8,7.9,6.3),(140,'韭菜炒蛋','Chives Fried with Egg',98,2.1,8.4,6.7),(141,'鸭血粉丝汤','Duck Blood and Vermicelli Soup',32,4.8,3.9,0.4),(142,'虾皮紫菜汤','Shrimp Skin and Seaweed Soup',19,1.2,3.4,0.2),(143,'菠菜鸡蛋汤','Spinach and Egg Soup',34,2,4.9,1.1),(144,'番茄蛋花汤','Tomato and Egg Drop Soup',29,3.4,3.7,1),(145,'蔬菜沙拉','Vegetable Salad',39,3.7,2.1,2.9),(146,'玉米田园色拉','Corn Countryside Salad',51,8.4,2.3,2.8),(147,'鸡肉沙拉','Chicken Salad',49,1.5,7.5,2.2),(148,'黄瓜虾肉寿司卷','Cucumber and Shrimp Sushi Roll',112,20.1,4.8,1.2),(149,'黄瓜蟹肉鸡蛋寿司','Cucumber, Crab Meat, and Egg Sushi',104,15.2,6.3,2.3),(150,'日式凉拌洋蔥','Japanese Style Cold Mixed Onions',78,9.1,1.9,4.8),(151,'自制鸡蛋三明治','Homemade Egg Sandwich',209,21.4,13.7,9.8),(152,'韩式冷面','Korean Cold Noodles',121,24.3,5.1,1.2),(153,'韩式石锅拌饭','Korean Stone Pot Mixed Rice',113,20,4.3,3.7),(154,'无油松饼','Oil-free Pancake',217,45.3,5.7,1.2),(155,'芝士焗红薯','Cheese Baked Sweet Potato',161,18.3,3.9,7.2),(156,'番茄肉酱意面','Tomato Meat Sauce Spaghetti',71,13.2,3.4,1.5),(157,'咖喱海鲜风味炒意面','Curry Seafood Flavor Fried Spaghetti',185,22.3,8.1,7),(158,'羽衣甘蓝火鸡卷','Kale Turkey Roll',81,5,11.3,2),(159,'菠菜鹰嘴豆意大利面','Spinach and Chickpea Pasta',120,20.2,6.7,2.1),(160,'意式蔬菜汤','Italian Vegetable Soup',70,10.5,2.5,1.8),(161,'干煎牛排','Dry-fried Steak',147,0,26.1,5.4),(162,'地中海式烤三文鱼','Mediterranean Grilled Salmon',129,0,22.5,4.4),(163,'香茅烤罗非鱼','Lemongrass Grilled Tilapia',112,0,24,2.3),(164,'西班牙海鲜饭','Spanish Seafood Rice',90,15.2,6.1,1),(165,'海鲜汤泡饭','Seafood Soup over Rice',70,10.1,4.8,0.7),(166,'薄荷生活 低脂鸡胸肉（黑椒味)','Mint Life Low-fat Chicken Breast (Black Pepper Flavor)',114,0,23,1.5),(167,'薄荷生活 高蛋白风干牛肉','Mint Life High-Protein Dried Beef',223,1,42,7),(168,'薄荷健康0卡果冻水蜜桃味','Mint Health 0 Calorie Jelly Peach Flavor',0,0,0,0),(169,'薄荷健康0卡果冻（白玉荔枝味)','Mint Health 0 Calorie Jelly (Lychee Flavor)',0,0,0,0),(170,'薄荷生活 低脂扇贝魔芋丝（烧烤味）','Mint Life Low-fat Scallop Konjac Strips (BBQ Flavor)',82,20,0,0),(171,'红薯干','Dried Sweet Potato',338,80,2,0.5),(172,'苏打饼干','Soda Biscuits',408,76,6,14),(173,'爆玉米花（无油无糖)','Popcorn (Oil-free, Sugar-free)',387,78,12,4.5),(174,'魔芋蛋糕','Konjac Cake',75,16,0.5,0.2),(175,'无花果（干）','Dried Fig',361,90,3.1,1.3),(176,'蓝莓干','Dried Blueberries',317,76,4,2),(177,'今川烧','Imagawayaki (Japanese pancake)',221,24,3,12),(178,'无糖美式咖啡','Sugar-free Americano',1,0,0.2,0),(179,'无糖全脂拿铁','Sugar-free Whole Milk Latte',43,4.4,2.5,1.5),(180,'无糖卡布奇诺','Sugar-free Cappuccino',27,2.7,1.5,1),(181,'摩卡咖啡','Mocha Coffee',64,8,2,1.5),(182,'意式浓缩咖啡','Espresso',9,1.7,0.6,0.2),(183,'燕麦拿铁','Oat Milk Latte',50,9,1,1.5),(184,'无糖可乐','Sugar-free Cola',1,0,0,0),(185,'苏打水（无糖)','Sugar-free Soda Water',0,0,0,0),(186,'苹果醋','Apple Cider Vinegar',21,0.9,0,0),(187,'柠檬汁','Lemon Juice',27,8.2,0.4,0.2),(188,'胡萝卜汁饮料','Carrot Juice Drink',24,5.6,0.6,0.1),(189,'沙棘果汁','Sea Buckthorn Juice',47,11,0,0),(190,'葡萄汁','Grape Juice',60,14.8,0.3,0.2),(191,'豆奶','Soy Milk',30,2.5,2.9,1.7),(192,'燕麦奶','Oat Milk',45,6.7,0.5,2.5),(193,'椰奶','Coconut Milk',31,1.1,0.3,3.3),(194,'米浆','Rice Drink',47,9.4,0.3,1),(195,'普洱茶水','Pu\'er Tea',1,0,0,0),(196,'铁观音茶水','Tieguanyin Tea',1,0,0,0),(197,'大麦茶水','Barley Tea',1,0,0,0),(198,'白桃乌龙茶水','White Peach Oolong Tea',3,0.7,0,0),(199,'小青柑（茶水）','Tangerine Peel Tea',3,0.7,0,0),(200,'菊花茶水','Chrysanthemum Tea',1,0,0,0),(201,'苦养茶水','Bitter Tea',1,0,0,0),(202,'洛神花茶水','Hibiscus Tea',0,0,0,0),(203,'玄米茶（茶水)','Brown Rice Tea',0,0,0,0),(204,'红酒（无酒精)','Non-alcoholic Wine',6,1.5,0,0),(205,'煮鸡蛋','Boiled Egg',143,1,13,9),(206,'清蒸鸡胸肉','Steamed Chicken Breast',115,0,24,2.5),(207,'鸡腿（水煮)','Boiled Chicken Leg',187,0,19,12),(208,'水煮去皮鸭腿','Boiled Duck Leg without Skin',115,0,24,2.5),(209,'鹅肉','Goose Meat',161,0,19,11),(210,'清炖乌鸡汤（含肉）','Black Chicken Stew with Meat',37,0,7,1),(211,'鸭肠','Duck Intestine',129,0,15,9),(212,'鸭血','Duck Blood',108,0,17,4),(213,'烩里脊片','Braised Pork Loin Slices',221,0,18,16),(214,'牛肉汤','Beef Soup',77,0,6,5),(215,'羊肉（熟）','Cooked Mutton',217,0,17,16),(216,'牛腱子肉','Beef Shank',122,0,22,3.5),(217,'猪血','Pig Blood',55,0,8,2),(218,'猪肉（腿）','Pork Leg',190,0,18,12),(219,'牛蹄筋（熟）','Cooked Beef Tendon',147,0,36,4),(220,'鲑鱼（三文鱼）','Salmon',139,0,20,6),(221,'巴沙鱼（烤）','Grilled Basa Fish',104,0,23,1.5),(222,'清蒸草鱼','Steamed Grass Carp',126,0,24,3),(223,'清蒸鲈鱼','Steamed Bass',98,0,20,1.8),(224,'清蒸鲫鱼','Steamed Crucian Carp',109,0,22,2),(225,'鳕鱼（烤）','Grilled Cod',96,0,23,0.7),(226,'蒸生蚝','Steamed Oyster',67,4,8,2),(227,'凉拌蛤蜊肉','Marinated Clam Meat',75,3,12,1),(228,'扇贝（鲜)','Fresh Scallop',60,3,11,0.8),(229,'葱拌章鱼','Octopus with Green Onion',149,2,25,2),(230,'白灼基围虾','Poached Shrimp',98,0,23,0.5),(231,'牛奶','Milk',66,5,3.3,3.8),(232,'脱脂牛奶','Skimmed Milk',33,5,3.4,0.2),(233,'酸奶','Yogurt',70,7,3.9,2),(234,'羊乳','Sheep\'s Milk',59,4.8,5.4,3.5),(235,'鲜驼奶','Fresh Camel Milk',72,5,3.6,4),(236,'全脂奶粉','Whole Milk Powder',482,38,26,26),(237,'脱脂奶粉','Skimmed Milk Powder',361,52,35,1),(238,'奶豆腐（鲜)','Fresh Milk Tofu',305,2,28,20),(239,'奶豆腐（脱脂)','Skimmed Milk Tofu',343,12,32,18),(240,'里科塔奶酪','Ricotta Cheese',150,3,11,10),(241,'马苏里拉奶酪（低钠)','Mozzarella Cheese (Low Sodium)',280,2,18,22),(242,'瑞士奶酪（低钠)','Swiss Cheese (Low Sodium)',374,5,27,28),(243,'奶嚼口','Milk Chews',215,30,7,9),(244,NULL,'cake',200,3.5,2.4,2.4),(245,NULL,'beef',150,30,5.5,3.5),(246,NULL,'fried chicken',279,1.6,31.8,11.4),(247,NULL,'hotpot',99999,59999,19999,19999),(248,NULL,'donut',210,100,10,60),(249,NULL,'strawberry',100,20,5,20),(250,NULL,'coffee',250,50,20,30),(251,NULL,'Avocado',300,150,50,50);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foodhistory`
--

DROP TABLE IF EXISTS `foodhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foodhistory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(36) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `date` timestamp NULL DEFAULT (curtime()),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foodhistory`
--

LOCK TABLES `foodhistory` WRITE;
/*!40000 ALTER TABLE `foodhistory` DISABLE KEYS */;
INSERT INTO `foodhistory` VALUES (1,'3b04898d-85ae-455d-a9e9-e5db1cd7832a','beef',100.00,'2023-12-11 07:49:34'),(2,'3b04898d-85ae-455d-a9e9-e5db1cd7832a','beef',100.00,'2023-12-12 07:54:10'),(3,'3b04898d-85ae-455d-a9e9-e5db1cd7832a','beef',100.00,'2023-12-13 07:55:21'),(4,'3b04898d-85ae-455d-a9e9-e5db1cd7832a','beef',200.00,'2023-12-14 07:59:37'),(5,'0808776f-2823-46c9-a8cd-3c31456d4c41','apple',278.00,'2023-12-12 08:01:49'),(6,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','cake',20.00,'2023-12-01 08:10:47'),(7,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','coffee',150.00,'2023-12-02 08:22:27'),(8,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Kiwi',50.00,'2023-12-03 08:23:21'),(9,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Pear',20.00,'2023-12-03 08:23:26'),(10,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Orange',100.00,'2023-12-04 08:23:30'),(11,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Watermelon',50.00,'2023-12-04 08:23:36'),(12,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Avocado',50.00,'2023-12-12 08:24:00'),(13,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Rice',10.00,'2023-12-12 08:24:06'),(14,'8f5283bb-4bb6-42cb-87f1-f0d31b3783e5','Orange',500.00,'2023-12-12 08:52:40'),(15,'8f5283bb-4bb6-42cb-87f1-f0d31b3783e5','Apple',500.00,'2023-12-12 08:54:04'),(16,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Apple',500.00,'2023-12-12 10:28:35'),(17,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','apple',200.00,'2023-12-12 10:29:23'),(18,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','Salmon',500.00,'2023-12-12 10:34:48'),(19,'f40aa7ba-7279-40f7-bba5-f8cd415965ef','cake',200.00,'2023-12-13 00:58:58');
/*!40000 ALTER TABLE `foodhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userprofile`
--

DROP TABLE IF EXISTS `userprofile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userprofile` (
  `id` varchar(36) NOT NULL,
  `name` varchar(255) NOT NULL,
  `sex` int NOT NULL,
  `stringSex` varchar(10) DEFAULT NULL,
  `weight` decimal(5,2) DEFAULT NULL,
  `height` decimal(4,2) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `bmi` decimal(5,2) DEFAULT NULL,
  `bmr` decimal(6,2) DEFAULT NULL,
  `bodyFatRate` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `userprofile_chk_1` CHECK ((`sex` in (0,1))),
  CONSTRAINT `userprofile_chk_2` CHECK ((`stringSex` in (_utf8mb4'male',_utf8mb4'female')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userprofile`
--

LOCK TABLES `userprofile` WRITE;
/*!40000 ALTER TABLE `userprofile` DISABLE KEYS */;
INSERT INTO `userprofile` VALUES ('0808776f-2823-46c9-a8cd-3c31456d4c41','1700zh',0,'male',74.00,1.74,23,24.44,1570.50,18.00),('3b04898d-85ae-455d-a9e9-e5db1cd7832a','qwe',0,'male',70.00,1.70,24,24.93,1752.90,20.00),('76cefc9c-e4db-42c6-8814-ca099d0f6c90','Robin',0,'male',75.00,1.75,55,24.49,1431.50,20.00),('8f5283bb-4bb6-42cb-87f1-f0d31b3783e5','Pony',0,'male',77.00,1.78,52,24.21,1447.40,20.00),('f40aa7ba-7279-40f7-bba5-f8cd415965ef','Jiani',0,'female',52.00,1.71,23,31.14,1731.00,10.00);
/*!40000 ALTER TABLE `userprofile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` varchar(36) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('0808776f-2823-46c9-a8cd-3c31456d4c41','1700zh','1053004561@qq.com','$2a$10$RjBwjSqKWtVlZWnmCdQJse7TdsVuUVzq4kE1j9yi39RlEjKrxThi.'),('3b04898d-85ae-455d-a9e9-e5db1cd7832a','qwe','23@qew','$2a$10$DRxBlmBVKa0Vy57T3X.hTuJFUrLatAMjIrp9YJvmi.g.M/jci9ukC'),('76cefc9c-e4db-42c6-8814-ca099d0f6c90','Robin','Robin@baidu.com','$2a$10$VMw/UHQ.POLofjvHA1QQfOKzEFgRd/BUbNexHbMzO4Vdxf5pcJGrO'),('8f5283bb-4bb6-42cb-87f1-f0d31b3783e5','Pony','Pony@tencent.com','$2a$10$M/tji//RLsV6AF3cwwuTHeDcQ0acSZYuEDp/P9wnKDCCmXZwGJUru'),('f40aa7ba-7279-40f7-bba5-f8cd415965ef','jiani','jiani@jiani.com','$2a$10$9GHPCtbN.F67rsBgHgfbRex1tYttclG79dZQY.S8.NUmsO4kDx2JK');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-12 20:45:35
