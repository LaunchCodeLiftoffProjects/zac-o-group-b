-- To store the Recipe details
CREATE TABLE recipe (
recipe_id INTEGER PRIMARY KEY AUTO_INCREMENT,
recipe_name VARCHAR(250),
recipe_details TEXT
);

-- To Store the ingredients details
CREATE TABLE ingredients (
ingredients_id INTEGER PRIMARY KEY AUTO_INCREMENT,
ingredients_name VARCHAR(250)
);

-- To Store the Recipe Ingredients details
CREATE TABLE recipe_ingredients (
recipe_ingredients_id INTEGER PRIMARY KEY AUTO_INCREMENT,
ingredients_id_r INTEGER,
recipe_id_r INTEGER,
FOREIGN KEY (recipe_id_r) REFERENCES recipe(recipe_id)
);


ALTER TABLE recipe ADD COLUMN recipe_description TEXT;

ALTER TABLE recipe ADD COLUMN recipe_img_url VARCHAR(3000);

INSERT INTO recipe (recipe_name, recipe_description, recipe_details) values ('Honey-Garlic Slow Cooker Chicken Thighs','Serve with basmati rice or quinoa and steamed or roasted vegetables.','<b>Step 1</b><br>
Lay chicken thighs into the bottom of a 4-quart slow cooker.<br><br>

<b>Step 2</b><br>
Whisk soy sauce, ketchup, honey, garlic, and basil together in a bowl; pour over the chicken.<br><br>

<b>Step 3</b><br>
Cook on Low for 6 hours.');

INSERT INTO ingredients (ingredients_name) values ('Chicken');
INSERT INTO ingredients (ingredients_name) values ('Soy Sauce');
INSERT INTO ingredients (ingredients_name) values ('Ketchup');
INSERT INTO ingredients (ingredients_name) values ('Honey');
INSERT INTO ingredients (ingredients_name) values ('Garlic');
INSERT INTO ingredients (ingredients_name) values ('Basil');

select * from ingredients;

select * from recipe;

INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (1,1);
INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (2,1);
INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (3,1);
INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (4,1);
INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (5,1);
INSERT into recipe_ingredients (ingredients_id_r,recipe_id_r) values (6,1);
