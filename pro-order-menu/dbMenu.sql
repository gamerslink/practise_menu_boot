-- 創建資料庫
create database if not exists dbMenu;

-- 使用資料庫
use dbMenu;

-- 餐點
create table menu (
	menuId int auto_increment comment '餐點ID',
    menuName varchar(200) comment '餐點名稱',
    menuPrice int comment '餐點價格',
    primary key(menuId)
);

insert into menu (menuName, menuPrice)
values 
('燙青菜', '50'),
('宮保雞丁', '100'),
('青椒炒肉絲', '100'),
('薑絲炒大腸', '100');


-- 訂單明細
create table orderList (
	orderId int auto_increment comment '訂單ID',
    menuId int comment '餐點ID',
    menuName varchar(200) comment '餐點名稱',
    quantity int comment '訂單數量',
    price int comment '單價',
    totalPrice int comment '總金額',
    primary key(orderId),
    constraint FK_orderList_menuId
    foreign key (menuId)
    references menu(menuId)
);



insert into orderlist (menuId, menuName, quantity, price)
values 
(1, '燙青菜', 1, 50, 50),
(2, '宮保雞丁', 1, 100, 100),
(3, '青椒炒肉絲', 1, 100, 100),
(4, '薑絲炒大腸', 1, 100, 100);
