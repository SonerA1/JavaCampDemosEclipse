--Select
--ANSII
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
Select * from Products where CategoryID=1 or categoryID=3

Select * from Products where CategoryID=1 and UnitPrice>=10

Select * from Products where CategoryID=1 order by UnitPrice desc --ascending artan --descending düşen

Select count(*) from Products where CategoryID = 2 --kategoriid si iki olan kaç ürün var olur

Select CategoryID,count(*) from Products where UnitPrice>20
group by CategoryID having count(*)<10 --category id ye gore kaç ürün var 

Select Products.ProductID,Products.ProductName, Products.UnitPrice,Categories.CategoryName
 from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID --Tüm ürünleri getir/ kategorilerle bir araya getir
where Products.UnitPrice>10

--DTO Data Transformation Object

Select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID--inner join sadece eşleşen kayıtları getirir--left solda olup sağda olmayanlar
inner join Orders o
on o.OrderID = od.OrderID


Select * from Customers c  left join Orders o--inner dediğimizde 830 -- left832 müşterilerde olup siparişlerde olmayanlar.
on c.CustomerID = o.CustomerID
where o.CustomerID is null -- geri kalan 2 taneyi gösterir 
