INSERT INTO accounts ([username],[password],[role])
VALUES ('Hi', 123,1),
       ('Hello', 123,1),
	   ('Tuong',123,0),
	   ('Thao',123,0)
select*from accounts
select*from categories
INSERT INTO categories ([category_id],[name])
VALUES (1, 'SUV'),
      (2, 'SEDAN'),
	  (3, 'COUPE'),
	  (4, 'HATCHBACK'),
	  (5, 'MVP')
select*from products

INSERT INTO products ([product_id],[description],[discount],[entered_date],[image],[name],[price],[quantity],[status],[categoryid])
VALUES (1, N'Mercedes-Benz GLC thế hệ 2 hoàn toàn mới chính thức ra mắt tại Việt Nam.','3000000','2021-02-12','pic12.jpg','Mercedes-Benz GLC','9000000','10',N'đã thanh toán',1),
       (2, N'Honda Civic là mẫu xe phổ thông cỡ trung khá phổ biến trên toàn cầu.','2000000','2022-03-16','pic13.jpg','Honda Civic','6000000','9',N'chưa thanh toán ',3),
	   (3, N'Mazda2 phiên bản nâng cấp facelift mới được nhập khẩu trực tiếp từ Thái Lan.','1000000','2021-05-21','pic14.jpg','Mazda2','6000000','8',N'chưa thanh toán ',3),
	   (4 ,N'Sau nhiều chờ đợi, Hyundai Elantra 2023 đã chính thức ra mắt khách hàng trong nước.','4000000','2022-06-22','pic15.jpg','Hyundai Elantra','7000000','7',N'đã thanh toán ',3),
	   (5, N'Mitsubishi Attrage 2021 sở hữu phong cách ngoại thất mạnh mẽ, nam tính hơn trước. ','2000000','2022-01-19','pic16.jpg','Mitsubishi Attrage','8000000','6',N'đã thanh toán ',2),
	   (6, N'Honda City được ra mắt tại Việt nam tháng 1/2021 với 3 phiên bản là bản 1.5G.','5000000','2021-05-04','pic20.jpg','Honda City','9000000','4',N'chưa thanh toán ',3)

select*from customers	   
INSERT INTO [dbo].[customers]([customer_id],[email],[name],[password],[phone],[registered_date],[status])
VALUES (1, 'thanh@gmail.com',N'Trần Tiến Thành','1234','0923457832','2023-01-02',N'chưa thanh toán'),
        (2, 'quyen@gmail.com',N'Lê Thị Tú Quyên','1234','0934984293','2023-04-21',N'chưa thanh toán'),
		(3, 'tuong@gmail.com',N'Lê Cát Tường','1234','0842348931','2023-04-01',N'đã thanh toán'),
		(4, 'mai@gmail.com',N'Phạm Xuân Mai','1234','0858328931','2023-02-10',N'chưa thanh toán'),
		(5, 'duy@gmail.com',N'Nguyễn Thành Duy','1234','0845438238','2023-06-01',N'chưa thanh toán')

select*from orders

INSERT INTO [dbo].[orders] ([order_id],[amount],[order_date],[status],[customerid])
VALUES (1,1,'2023-01-02',N'chưa thanh toán',1),
       (2,1,'2023-02-10',N'chưa thanh toán',4),
	   (3,1,'2023-04-01',N'đã thanh toán',3),
	   (4,1,'2023-04-21',N'chưa thanh toán',2)

select*from orderdetails

INSERT INTO [dbo].[orderdetails] ([order_detail_id],[price],[quantity],[orderid],[productid])
VALUES (1,'3000000','10',1,1),
        (2,'2000000','9',2,2),
		(3,'4000000','7',4,4),
		(4,'5000000','4',3,6)
 
