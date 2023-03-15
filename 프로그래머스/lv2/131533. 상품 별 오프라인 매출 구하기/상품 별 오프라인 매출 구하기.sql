-- 코드를 입력하세요
# SELECT product_code  from product;
SELECT p.PRODUCT_CODE, sum(p.price * o.sales_amount) as SALES
from product p join offline_sale o
on o.product_id = p.product_id
group by p.product_code
order by sales desc, product_code