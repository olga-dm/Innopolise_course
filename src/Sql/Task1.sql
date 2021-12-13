select name,value from prices join goods on prices.goods_id=goods.id
where value=(select max(value) from prices)

select name,value from quantity join goods on quantity.goods_id=goods.id
where value=0

select manufacturer.name, avg(prices.value) as avg_p from goods
join prices on prices.goods_id=goods.id
join suppliers on goods.supplier_id=suppliers.id
join manufacturer on suppliers.manufacturer_id=manufacturer.id
group by manufacturer.id
order by avg_p desc
limit 1

select goods.name,prices.value,manufacturer.name from goods
join prices on prices.goods_id=goods.id
join suppliers on goods.supplier_id=suppliers.id
join manufacturer on suppliers.manufacturer_id=manufacturer.id
where manufacturer.location like 'Moscow'