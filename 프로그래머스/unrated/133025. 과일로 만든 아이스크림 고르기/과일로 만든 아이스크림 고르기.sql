-- 코드를 입력하세요
SELECT I.FLAVOR 
FROM ICECREAM_INFO I JOIN FIRST_HALF F
WHERE I.FLAVOR = F.FLAVOR 
AND I.INGREDIENT_TYPE = 'fruit_based' 
AND F.TOTAL_ORDER > 3000
