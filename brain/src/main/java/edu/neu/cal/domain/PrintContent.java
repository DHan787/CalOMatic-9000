/*
 * @Author: Wang
 * @Date: 2023-12-11 22:16
 * @Description: 
 */
package edu.neu.cal.domain;

// 定义一个公共类PrintContent

public class PrintContent {
    public void c10(){
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";
        int pancake = 217;
        int syrup = 52;
        int bacon = 221;
        int milk = 132;
        int breakfastTotal = pancake + syrup + bacon + milk;

        int soup = 154;
        int bun = 223;
        int spinach = 23;
        int riceDrink = 94;
        int lunchTotal = soup + bun + spinach + riceDrink;

        int salmon = 129;
        int potato = 69;
        int carrot = 27;
        int lemonJuice = 54;
        int dinnerTotal = salmon + potato + carrot + lemonJuice;

        int pecans = 69;
        int pineapple = 44;
        int snacksTotal = pecans + pineapple;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Pancake (100g): %d calories%n", pancake);
        System.out.printf("- Maple syrup (20g): %d calories%n", syrup);
        System.out.printf("- Bacon (50g): %d calories%n", bacon);
        System.out.printf("- Milk (200ml): %d calories%n", milk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Beef soup (200g): %d calories%n", soup);
        System.out.printf("- Steamed bun (100g): %d calories%n", bun);
        System.out.printf("- Spinach (100g): %d calories%n", spinach);
        System.out.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Mediterranean grilled salmon (100g): %d calories%n", salmon);
        System.out.printf("- Potato (100g): %d calories%n", potato);
        System.out.printf("- Carrot (100g): %d calories%n", carrot);
        System.out.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Pecans (10g): %d calories%n", pecans);
        System.out.printf("- Pineapple (100g): %d calories%n", pineapple);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c11(){
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int cornBread = 186;
        int ham = 143;
        int orange = 72;
        int soyMilk = 62;
        int breakfastTotal = cornBread + ham + orange + soyMilk;

        int potato = 114;
        int noodles = 349;
        int lettuce = 16;
        int juice = 48;
        int lunchTotal = potato + noodles + lettuce + juice;

        int chicken = 115;
        int carrot = 27;
        int mushroom = 22;
        int greenTea = 1;
        int dinnerTotal = chicken + carrot + mushroom + greenTea;

        int peanuts = 31;
        int strawberries = 32;
        int snacksTotal = peanuts + strawberries;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Corn bread (50g): %d calories%n", cornBread);
        System.out.printf("- Ham (50g): %d calories%n", ham);
        System.out.printf("- Orange (150g): %d calories%n", orange);
        System.out.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Spicy shredded potato (150g): %d calories%n", potato);
        System.out.printf("- Noodles (100g): %d calories%n", noodles);
        System.out.printf("- Lettuce (100g): %d calories%n", lettuce);
        System.out.printf("- Juice (200ml): %d calories%n", juice);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Roasted chicken breast (100g): %d calories%n", chicken);
        System.out.printf("- Carrot (100g): %d calories%n", carrot);
        System.out.printf("- Mushroom (100g): %d calories%n", mushroom);
        System.out.printf("- Green tea (200ml): %d calorie%n", greenTea);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Peanuts (10g): %d calories%n", peanuts);
        System.out.printf("- Strawberries (100g): %d calories%n", strawberries);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }
    
    public void c12(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int bread = 254;
        int cheese = 150;
        int banana = 93;
        int soyMilk = 78;
        int breakfastTotal = bread + cheese + banana + soyMilk;

        int eggs = 144;
        int rice = 116;
        int rapeseed = 14;
        int yogurt = 70;
        int lunchTotal = eggs + rice + rapeseed + yogurt;

        int seaBass = 98;
        int sweetPotato = 65;
        int broccoli = 26;
        int honeyWater = 64;
        int dinnerTotal = seaBass + sweetPotato + broccoli + honeyWater;

        int walnuts = 65;
        int grapes = 45;
        int snacksTotal = walnuts + grapes;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Whole wheat bread (100g): %d calories%n", bread);
        System.out.printf("- Cheese (50g): %d calories%n", cheese);
        System.out.printf("- Banana (150g): %d calories%n", banana);
        System.out.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Tomato scrambled eggs (150g): %d calories%n", eggs);
        System.out.printf("- Rice (100g): %d calories%n", rice);
        System.out.printf("- Rapeseed (100g): %d calories%n", rapeseed);
        System.out.printf("- Yogurt (100g): %d calories%n", yogurt);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Grilled sea bass (100g): %d calories%n", seaBass);
        System.out.printf("- Sweet potato (100g): %d calories%n", sweetPotato);
        System.out.printf("- Broccoli (100g): %d calories%n", broccoli);
        System.out.printf("- Honey water (200ml): %d calories%n", honeyWater);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Walnuts (10g): %d calories%n", walnuts);
        System.out.printf("- Grapes (100g): %d calories%n", grapes);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c13(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int bread = 254;
        int cheese = 150;
        int banana = 93;
        int soyMilk = 78;
        int breakfastTotal = bread + cheese + banana + soyMilk;

        int spaghetti = 213;
        int salad = 59;
        int vinegar = 42;
        int lunchTotal = spaghetti + salad + vinegar;

        int tilapia = 112;
        int quinoa = 120;
        int tomato = 15;
        int coconutMilk = 62;
        int dinnerTotal = tilapia + quinoa + tomato + coconutMilk;

        int cashews = 56;
        int cherry = 46;
        int snacksTotal = cashews + cherry;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Whole wheat bread (100g): %d calories%n", bread);
        System.out.printf("- Cheese (50g): %d calories%n", cheese);
        System.out.printf("- Banana (150g): %d calories%n", banana);
        System.out.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Tomato meat sauce spaghetti (150g): %d calories%n", spaghetti);
        System.out.printf("- Mixed salad (150g): %d calories%n", salad);
        System.out.printf("- Apple cider vinegar (200ml): %d calories%n", vinegar);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Lemongrass grilled tilapia (100g): %d calories%n", tilapia);
        System.out.printf("- Quinoa (100g): %d calories%n", quinoa);
        System.out.printf("- Tomato (100g): %d calories%n", tomato);
        System.out.printf("- Coconut milk (200ml): %d calories%n", coconutMilk);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Cashews (10g): %d calories%n", cashews);
        System.out.printf("- Cherry (100g): %d calories%n", cherry);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c14(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int baguette = 372;
        int butter = 72;
        int jam = 56;
        int orangeJuice = 96;
        int breakfastTotal = baguette + butter + jam + orangeJuice;

        int chickenSalad = 74;
        int riceCake = 220;
        int cucumber = 16;
        int soyMilk = 60;
        int lunchTotal = chickenSalad + riceCake + cucumber + soyMilk;

        int seafoodRice = 135;
        int broccoli = 26;
        int yogurt = 70;
        int dinnerTotal = seafoodRice + broccoli + yogurt;

        int sunflowerSeeds = 62;
        int grapefruit = 63;
        int snacksTotal = sunflowerSeeds + grapefruit;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Baguette (100g): %d calories%n", baguette);
        System.out.printf("- Butter (10g): %d calories%n", butter);
        System.out.printf("- Strawberry jam (20g): %d calories%n", jam);
        System.out.printf("- Orange juice (200ml): %d calories%n", orangeJuice);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Chicken salad (150g): %d calories%n", chickenSalad);
        System.out.printf("- Rice cake (100g): %d calories%n", riceCake);
        System.out.printf("- Cucumber (100g): %d calories%n", cucumber);
        System.out.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Spanish seafood rice (150g): %d calories%n", seafoodRice);
        System.out.printf("- Boiled broccoli (100g): %d calories%n", broccoli);
        System.out.printf("- Yogurt (100g): %d calories%n", yogurt);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        System.out.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c15(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int pancake = 217;
        int syrup = 52;
        int bacon = 221;
        int milk = 132;
        int breakfastTotal = pancake + syrup + bacon + milk;

        int soup = 154;
        int bun = 223;
        int spinach = 23;
        int riceDrink = 94;
        int lunchTotal = soup + bun + spinach + riceDrink;

        int salmon = 129;
        int potato = 69;
        int carrot = 27;
        int lemonJuice = 54;
        int dinnerTotal = salmon + potato + carrot + lemonJuice;

        int pecans = 69;
        int pineapple = 44;
        int snacksTotal = pecans + pineapple;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Pancake (100g): %d calories%n", pancake);
        System.out.printf("- Maple syrup (20g): %d calories%n", syrup);
        System.out.printf("- Bacon (50g): %d calories%n", bacon);
        System.out.printf("- Milk (200ml): %d calories%n", milk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Beef soup (200g): %d calories%n", soup);
        System.out.printf("- Steamed bun (100g): %d calories%n", bun);
        System.out.printf("- Spinach (100g): %d calories%n", spinach);
        System.out.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Mediterranean grilled salmon (100g): %d calories%n", salmon);
        System.out.printf("- Potato (100g): %d calories%n", potato);
        System.out.printf("- Carrot (100g): %d calories%n", carrot);
        System.out.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Pecans (10g): %d calories%n", pecans);
        System.out.printf("- Pineapple (100g): %d calories%n", pineapple);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c16(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int eggSandwich = 314;
        int butter = 72;
        int jam = 56;
        int milk = 132;
        int breakfastTotal = eggSandwich + butter + jam + milk;

        int mixedRice = 170;
        int cucumber = 16;
        int yogurt = 70;
        int lunchTotal = mixedRice + cucumber + yogurt;

        int seafoodRice = 135;
        int broccoli = 26;
        int milk2 = 132;
        int dinnerTotal = seafoodRice + broccoli + milk2;

        int walnuts = 323;
        int sunflowerSeeds = 62;
        int grapefruit = 63;
        int snacksTotal = walnuts + sunflowerSeeds + grapefruit;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Homemade egg sandwich (150g): %d calories%n", eggSandwich);
        System.out.printf("- Butter (10g): %d calories%n", butter);
        System.out.printf("- Strawberry jam (20g): %d calories%n", jam);
        System.out.printf("- Milk (200ml): %d calories%n", milk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Korean stone pot mixed rice (150g): %d calories%n", mixedRice);
        System.out.printf("- Cucumber (100g): %d calories%n", cucumber);
        System.out.printf("- Yogurt (100g): %d calories%n", yogurt);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Spanish seafood rice (150g): %d calories%n", seafoodRice);
        System.out.printf("- Boiled broccoli (100g): %d calories%n", broccoli);
        System.out.printf("- Milk (200ml): %d calories%n", milk2);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Dried walnuts (50g): %d calories%n", walnuts);
        System.out.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        System.out.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c17(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int oatmeal = 46;
        int egg = 72;
        int bacon = 221;
        int apple = 80;
        int milk = 132;
        int breakfastTotal = oatmeal + egg + bacon + apple + milk;

        int tomatoEggs = 144;
        int rice = 116;
        int rapeseed = 14;
        int yogurt = 70;
        int juice = 48;
        int lunchTotal = tomatoEggs + rice + rapeseed + yogurt + juice;

        int chicken = 115;
        int quinoa = 120;
        int broccoli = 26;
        int lemonJuice = 54;
        int dinnerTotal = chicken + quinoa + broccoli + lemonJuice;

        int figs = 181;
        int almonds = 58;
        int blueberries = 57;
        int cashews = 56;
        int cherry = 46;
        int snacksTotal = figs + almonds + blueberries + cashews + cherry;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Oatmeal (100g): %d calories%n", oatmeal);
        System.out.printf("- Egg (50g): %d calories%n", egg);
        System.out.printf("- Bacon (50g): %d calories%n", bacon);
        System.out.printf("- Apple (150g): %d calories%n", apple);
        System.out.printf("- Milk (200ml): %d calories%n", milk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Tomato scrambled eggs (150g): %d calories%n", tomatoEggs);
        System.out.printf("- Rice (100g): %d calories%n", rice);
        System.out.printf("- Rapeseed (100g): %d calories%n", rapeseed);
        System.out.printf("- Yogurt (100g): %d calories%n", yogurt);
        System.out.printf("- Juice (200ml): %d calories%n", juice);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Roasted chicken breast (100g): %d calories%n", chicken);
        System.out.printf("- Quinoa (100g): %d calories%n", quinoa);
        System.out.printf("- Broccoli (100g): %d calories%n", broccoli);
        System.out.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Dried figs (50g): %d calories%n", figs);
        System.out.printf("- Almonds (10g): %d calories%n", almonds);
        System.out.printf("- Blueberries (100g): %d calories%n", blueberries);
        System.out.printf("- Cashews (10g): %d calories%n", cashews);
        System.out.printf("- Cherry (100g): %d calories%n", cherry);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c18(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int steamedBun = 223;
        int cheese = 150;
        int banana = 93;
        int soyMilk = 78;
        int breakfastTotal = steamedBun + cheese + banana + soyMilk;

        int tomatoFish = 96;
        int riceCake = 220;
        int cucumber = 16;
        int yogurt = 70;
        int lunchTotal = tomatoFish + riceCake + cucumber + yogurt;

        int kaleTurkey = 122;
        int milletRice = 120;
        int tomato = 15;
        int riceDrink = 94;
        int dinnerTotal = kaleTurkey + milletRice + tomato + riceDrink;

        int walnuts = 323;
        int cashews = 56;
        int cherry = 46;
        int almonds = 58;
        int blueberries = 57;
        int snacksTotal = walnuts + cashews + cherry + almonds + blueberries;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Steamed bun (100g): %d calories%n", steamedBun);
        System.out.printf("- Cheese (50g): %d calories%n", cheese);
        System.out.printf("- Banana (150g): %d calories%n", banana);
        System.out.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Tomato with dragon fish (150g): %d calories%n", tomatoFish);
        System.out.printf("- Rice cake (100g): %d calories%n", riceCake);
        System.out.printf("- Cucumber (100g): %d calories%n", cucumber);
        System.out.printf("- Yogurt (100g): %d calories%n", yogurt);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Kale turkey roll (150g): %d calories%n", kaleTurkey);
        System.out.printf("- Millet rice (100g): %d calories%n", milletRice);
        System.out.printf("- Tomato (100g): %d calories%n", tomato);
        System.out.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Dried walnuts (50g): %d calories%n", walnuts);
        System.out.printf("- Cashews (10g): %d calories%n", cashews);
        System.out.printf("- Cherry (100g): %d calories%n", cherry);
        System.out.printf("- Almonds (10g): %d calories%n", almonds);
        System.out.printf("- Blueberries (100g): %d calories%n", blueberries);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c19(){
        // 定义变量
        String breakfast = "Breakfast:";
        String lunch = "Lunch:";
        String dinner = "Dinner:";
        String snacks = "Snacks:";
        String total = "Total calories:";

        int cornBread = 186;
        int butter = 72;
        int jam = 56;
        int ham = 143;
        int orange = 72;
        int soyMilk = 62;
        int breakfastTotal = cornBread + butter + jam + ham + orange + soyMilk;

        int potato = 114;
        int noodles = 349;
        int lettuce = 16;
        int milk = 132;
        int lunchTotal = potato + noodles + lettuce + milk;

        int salmon = 139;
        int potato2 = 69;
        int spinach = 23;
        int coconutMilk = 62;
        int dinnerTotal = salmon + potato2 + spinach + coconutMilk;

        int blueberries = 159;
        int sunflowerSeeds = 62;
        int grapefruit = 63;
        int pecans = 69;
        int pineapple = 44;
        int snacksTotal = blueberries + sunflowerSeeds + grapefruit + pecans + pineapple;

        int totalCalories = breakfastTotal + lunchTotal + dinnerTotal + snacksTotal;

        // 输出内容
        System.out.println(breakfast);
        System.out.printf("- Corn bread (50g): %d calories%n", cornBread);
        System.out.printf("- Butter (10g): %d calories%n", butter);
        System.out.printf("- Strawberry jam (20g): %d calories%n", jam);
        System.out.printf("- Ham (50g): %d calories%n", ham);
        System.out.printf("- Orange (150g): %d calories%n", orange);
        System.out.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        System.out.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        System.out.println(lunch);
        System.out.printf("- Spicy shredded potato (150g): %d calories%n", potato);
        System.out.printf("- Noodles (100g): %d calories%n", noodles);
        System.out.printf("- Lettuce (100g): %d calories%n", lettuce);
        System.out.printf("- Milk (200ml): %d calories%n", milk);
        System.out.printf("%s: %d calories%n%n", lunch, lunchTotal);

        System.out.println(dinner);
        System.out.printf("- Grilled salmon (100g): %d calories%n", salmon);
        System.out.printf("- Potato (100g): %d calories%n", potato2);
        System.out.printf("- Spinach (100g): %d calories%n", spinach);
        System.out.printf("- Coconut milk (200ml): %d calories%n", coconutMilk);
        System.out.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        System.out.println(snacks);
        System.out.printf("- Dried blueberries (50g): %d calories%n", blueberries);
        System.out.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        System.out.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        System.out.printf("- Pecans (10g): %d calories%n", pecans);
        System.out.printf("- Pineapple (100g): %d calories%n", pineapple);
        System.out.printf("%s: %d calories%n%n", snacks, snacksTotal);

        System.out.printf("%s: %d calories%n", total, totalCalories);
    }
}
