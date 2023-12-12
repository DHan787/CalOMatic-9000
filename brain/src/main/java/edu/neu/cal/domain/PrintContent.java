/*
 * @Author: Wang
 * @Date: 2023-12-11 22:16
 * @Description: 
 */
package edu.neu.cal.domain;

import edu.neu.cal.utils.TypewriterEffectPrinter;

// 定义一个公共类PrintContent

public class PrintContent {
    public void c10() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Pancake (100g): %d calories%n", pancake);
        TypewriterEffectPrinter.printf("- Maple syrup (20g): %d calories%n", syrup);
        TypewriterEffectPrinter.printf("- Bacon (50g): %d calories%n", bacon);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Beef soup (200g): %d calories%n", soup);
        TypewriterEffectPrinter.printf("- Steamed bun (100g): %d calories%n", bun);
        TypewriterEffectPrinter.printf("- Spinach (100g): %d calories%n", spinach);
        TypewriterEffectPrinter.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Mediterranean grilled salmon (100g): %d calories%n", salmon);
        TypewriterEffectPrinter.printf("- Potato (100g): %d calories%n", potato);
        TypewriterEffectPrinter.printf("- Carrot (100g): %d calories%n", carrot);
        TypewriterEffectPrinter.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Pecans (10g): %d calories%n", pecans);
        TypewriterEffectPrinter.printf("- Pineapple (100g): %d calories%n", pineapple);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c11() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Corn bread (50g): %d calories%n", cornBread);
        TypewriterEffectPrinter.printf("- Ham (50g): %d calories%n", ham);
        TypewriterEffectPrinter.printf("- Orange (150g): %d calories%n", orange);
        TypewriterEffectPrinter.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Spicy shredded potato (150g): %d calories%n", potato);
        TypewriterEffectPrinter.printf("- Noodles (100g): %d calories%n", noodles);
        TypewriterEffectPrinter.printf("- Lettuce (100g): %d calories%n", lettuce);
        TypewriterEffectPrinter.printf("- Juice (200ml): %d calories%n", juice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Roasted chicken breast (100g): %d calories%n", chicken);
        TypewriterEffectPrinter.printf("- Carrot (100g): %d calories%n", carrot);
        TypewriterEffectPrinter.printf("- Mushroom (100g): %d calories%n", mushroom);
        TypewriterEffectPrinter.printf("- Green tea (200ml): %d calorie%n", greenTea);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Peanuts (10g): %d calories%n", peanuts);
        TypewriterEffectPrinter.printf("- Strawberries (100g): %d calories%n", strawberries);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c12() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Whole wheat bread (100g): %d calories%n", bread);
        TypewriterEffectPrinter.printf("- Cheese (50g): %d calories%n", cheese);
        TypewriterEffectPrinter.printf("- Banana (150g): %d calories%n", banana);
        TypewriterEffectPrinter.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Tomato scrambled eggs (150g): %d calories%n", eggs);
        TypewriterEffectPrinter.printf("- Rice (100g): %d calories%n", rice);
        TypewriterEffectPrinter.printf("- Rapeseed (100g): %d calories%n", rapeseed);
        TypewriterEffectPrinter.printf("- Yogurt (100g): %d calories%n", yogurt);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Grilled sea bass (100g): %d calories%n", seaBass);
        TypewriterEffectPrinter.printf("- Sweet potato (100g): %d calories%n", sweetPotato);
        TypewriterEffectPrinter.printf("- Broccoli (100g): %d calories%n", broccoli);
        TypewriterEffectPrinter.printf("- Honey water (200ml): %d calories%n", honeyWater);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Walnuts (10g): %d calories%n", walnuts);
        TypewriterEffectPrinter.printf("- Grapes (100g): %d calories%n", grapes);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c13() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Whole wheat bread (100g): %d calories%n", bread);
        TypewriterEffectPrinter.printf("- Cheese (50g): %d calories%n", cheese);
        TypewriterEffectPrinter.printf("- Banana (150g): %d calories%n", banana);
        TypewriterEffectPrinter.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Tomato meat sauce spaghetti (150g): %d calories%n", spaghetti);
        TypewriterEffectPrinter.printf("- Mixed salad (150g): %d calories%n", salad);
        TypewriterEffectPrinter.printf("- Apple cider vinegar (200ml): %d calories%n", vinegar);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Lemongrass grilled tilapia (100g): %d calories%n", tilapia);
        TypewriterEffectPrinter.printf("- Quinoa (100g): %d calories%n", quinoa);
        TypewriterEffectPrinter.printf("- Tomato (100g): %d calories%n", tomato);
        TypewriterEffectPrinter.printf("- Coconut milk (200ml): %d calories%n", coconutMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Cashews (10g): %d calories%n", cashews);
        TypewriterEffectPrinter.printf("- Cherry (100g): %d calories%n", cherry);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c14() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Baguette (100g): %d calories%n", baguette);
        TypewriterEffectPrinter.printf("- Butter (10g): %d calories%n", butter);
        TypewriterEffectPrinter.printf("- Strawberry jam (20g): %d calories%n", jam);
        TypewriterEffectPrinter.printf("- Orange juice (200ml): %d calories%n", orangeJuice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Chicken salad (150g): %d calories%n", chickenSalad);
        TypewriterEffectPrinter.printf("- Rice cake (100g): %d calories%n", riceCake);
        TypewriterEffectPrinter.printf("- Cucumber (100g): %d calories%n", cucumber);
        TypewriterEffectPrinter.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Spanish seafood rice (150g): %d calories%n", seafoodRice);
        TypewriterEffectPrinter.printf("- Boiled broccoli (100g): %d calories%n", broccoli);
        TypewriterEffectPrinter.printf("- Yogurt (100g): %d calories%n", yogurt);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        TypewriterEffectPrinter.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c15() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Pancake (100g): %d calories%n", pancake);
        TypewriterEffectPrinter.printf("- Maple syrup (20g): %d calories%n", syrup);
        TypewriterEffectPrinter.printf("- Bacon (50g): %d calories%n", bacon);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Beef soup (200g): %d calories%n", soup);
        TypewriterEffectPrinter.printf("- Steamed bun (100g): %d calories%n", bun);
        TypewriterEffectPrinter.printf("- Spinach (100g): %d calories%n", spinach);
        TypewriterEffectPrinter.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Mediterranean grilled salmon (100g): %d calories%n", salmon);
        TypewriterEffectPrinter.printf("- Potato (100g): %d calories%n", potato);
        TypewriterEffectPrinter.printf("- Carrot (100g): %d calories%n", carrot);
        TypewriterEffectPrinter.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Pecans (10g): %d calories%n", pecans);
        TypewriterEffectPrinter.printf("- Pineapple (100g): %d calories%n", pineapple);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c16() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Homemade egg sandwich (150g): %d calories%n", eggSandwich);
        TypewriterEffectPrinter.printf("- Butter (10g): %d calories%n", butter);
        TypewriterEffectPrinter.printf("- Strawberry jam (20g): %d calories%n", jam);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Korean stone pot mixed rice (150g): %d calories%n", mixedRice);
        TypewriterEffectPrinter.printf("- Cucumber (100g): %d calories%n", cucumber);
        TypewriterEffectPrinter.printf("- Yogurt (100g): %d calories%n", yogurt);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Spanish seafood rice (150g): %d calories%n", seafoodRice);
        TypewriterEffectPrinter.printf("- Boiled broccoli (100g): %d calories%n", broccoli);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk2);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Dried walnuts (50g): %d calories%n", walnuts);
        TypewriterEffectPrinter.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        TypewriterEffectPrinter.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c17() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Oatmeal (100g): %d calories%n", oatmeal);
        TypewriterEffectPrinter.printf("- Egg (50g): %d calories%n", egg);
        TypewriterEffectPrinter.printf("- Bacon (50g): %d calories%n", bacon);
        TypewriterEffectPrinter.printf("- Apple (150g): %d calories%n", apple);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Tomato scrambled eggs (150g): %d calories%n", tomatoEggs);
        TypewriterEffectPrinter.printf("- Rice (100g): %d calories%n", rice);
        TypewriterEffectPrinter.printf("- Rapeseed (100g): %d calories%n", rapeseed);
        TypewriterEffectPrinter.printf("- Yogurt (100g): %d calories%n", yogurt);
        TypewriterEffectPrinter.printf("- Juice (200ml): %d calories%n", juice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Roasted chicken breast (100g): %d calories%n", chicken);
        TypewriterEffectPrinter.printf("- Quinoa (100g): %d calories%n", quinoa);
        TypewriterEffectPrinter.printf("- Broccoli (100g): %d calories%n", broccoli);
        TypewriterEffectPrinter.printf("- Lemon juice (200ml): %d calories%n", lemonJuice);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Dried figs (50g): %d calories%n", figs);
        TypewriterEffectPrinter.printf("- Almonds (10g): %d calories%n", almonds);
        TypewriterEffectPrinter.printf("- Blueberries (100g): %d calories%n", blueberries);
        TypewriterEffectPrinter.printf("- Cashews (10g): %d calories%n", cashews);
        TypewriterEffectPrinter.printf("- Cherry (100g): %d calories%n", cherry);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c18() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Steamed bun (100g): %d calories%n", steamedBun);
        TypewriterEffectPrinter.printf("- Cheese (50g): %d calories%n", cheese);
        TypewriterEffectPrinter.printf("- Banana (150g): %d calories%n", banana);
        TypewriterEffectPrinter.printf("- Black soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Tomato with dragon fish (150g): %d calories%n", tomatoFish);
        TypewriterEffectPrinter.printf("- Rice cake (100g): %d calories%n", riceCake);
        TypewriterEffectPrinter.printf("- Cucumber (100g): %d calories%n", cucumber);
        TypewriterEffectPrinter.printf("- Yogurt (100g): %d calories%n", yogurt);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Kale turkey roll (150g): %d calories%n", kaleTurkey);
        TypewriterEffectPrinter.printf("- Millet rice (100g): %d calories%n", milletRice);
        TypewriterEffectPrinter.printf("- Tomato (100g): %d calories%n", tomato);
        TypewriterEffectPrinter.printf("- Rice drink (200ml): %d calories%n", riceDrink);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Dried walnuts (50g): %d calories%n", walnuts);
        TypewriterEffectPrinter.printf("- Cashews (10g): %d calories%n", cashews);
        TypewriterEffectPrinter.printf("- Cherry (100g): %d calories%n", cherry);
        TypewriterEffectPrinter.printf("- Almonds (10g): %d calories%n", almonds);
        TypewriterEffectPrinter.printf("- Blueberries (100g): %d calories%n", blueberries);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }

    public void c19() {
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
        TypewriterEffectPrinter.println(breakfast);
        TypewriterEffectPrinter.printf("- Corn bread (50g): %d calories%n", cornBread);
        TypewriterEffectPrinter.printf("- Butter (10g): %d calories%n", butter);
        TypewriterEffectPrinter.printf("- Strawberry jam (20g): %d calories%n", jam);
        TypewriterEffectPrinter.printf("- Ham (50g): %d calories%n", ham);
        TypewriterEffectPrinter.printf("- Orange (150g): %d calories%n", orange);
        TypewriterEffectPrinter.printf("- Soy milk (200ml): %d calories%n", soyMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", breakfast, breakfastTotal);

        TypewriterEffectPrinter.println(lunch);
        TypewriterEffectPrinter.printf("- Spicy shredded potato (150g): %d calories%n", potato);
        TypewriterEffectPrinter.printf("- Noodles (100g): %d calories%n", noodles);
        TypewriterEffectPrinter.printf("- Lettuce (100g): %d calories%n", lettuce);
        TypewriterEffectPrinter.printf("- Milk (200ml): %d calories%n", milk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", lunch, lunchTotal);

        TypewriterEffectPrinter.println(dinner);
        TypewriterEffectPrinter.printf("- Grilled salmon (100g): %d calories%n", salmon);
        TypewriterEffectPrinter.printf("- Potato (100g): %d calories%n", potato2);
        TypewriterEffectPrinter.printf("- Spinach (100g): %d calories%n", spinach);
        TypewriterEffectPrinter.printf("- Coconut milk (200ml): %d calories%n", coconutMilk);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", dinner, dinnerTotal);

        TypewriterEffectPrinter.println(snacks);
        TypewriterEffectPrinter.printf("- Dried blueberries (50g): %d calories%n", blueberries);
        TypewriterEffectPrinter.printf("- Sunflower seeds (10g): %d calories%n", sunflowerSeeds);
        TypewriterEffectPrinter.printf("- Grapefruit (150g): %d calories%n", grapefruit);
        TypewriterEffectPrinter.printf("- Pecans (10g): %d calories%n", pecans);
        TypewriterEffectPrinter.printf("- Pineapple (100g): %d calories%n", pineapple);
        TypewriterEffectPrinter.printf("%s: %d calories%n%n", snacks, snacksTotal);

        TypewriterEffectPrinter.printf("%s: %d calories%n", total, totalCalories);
    }
}
