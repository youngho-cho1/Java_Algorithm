SELECT CATEGORY, PRICE MAX_PRICE, PRODUCT_NAME 
FROM FOOD_PRODUCT
WHERE PRICE IN
(
    SELECT MAX(PRICE) MAX_PRICE
    FROM FOOD_PRODUCT
    GROUP BY CATEGORY
)
AND CATEGORY IN('과자', '국', '김치', '식용유')
ORDER BY PRICE DESC



# SELECT CATEGORY, max(price) MAX_PRICE, PRODUCT_NAME from food_product
# where category in('과자','국','김치','식용유')
# group by category
# order by price desc