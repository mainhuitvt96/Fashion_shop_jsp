create database fashion_shop;
use fashion_shop;
create table catagories(
id bigint auto_increment,
`name` nvarchar(200) not null,
is_delete bit(1) default 0,
constraint pk_catagories primary key (id)
);
create table products (
id bigint auto_increment,
`name` nvarchar(255) not null,
image nvarchar(100) not null,
price bigint not null,
quantity int not null,
title nvarchar(255) not null,
`description` nvarchar (5000) not null,
category_id bigint,
sell_id bigint,
availability nvarchar(100),
is_delete bit(1) default 0,
constraint pk_products primary key (id),
constraint fk_products_categories foreign key (category_id) references catagories(id),
constraint fk_products_users foreign key (sell_id) references users(id));
create table roles(
id int auto_increment,
`name` nvarchar(50) not null,
`description` nvarchar (100) not null,
constraint fk_roles primary key (id)
);
create table users(
id bigint auto_increment,
username nvarchar(100) not null,
`password` nvarchar(100) not null,
full_name nvarchar(255) not null,
email nvarchar(255) not null,
phone nvarchar(20),
wallet bigint,
role_id int,
is_delete bit(1) default 0,
constraint pk_users primary key(id),
constraint fk_users_roles foreign key (role_id) references roles(id)
);
create table address(
id bigint auto_increment,
id_user bigint not null,
street nvarchar(255) not null,
district nvarchar(100) not null,
city nvarchar(100) not null,
zip_code nvarchar(10) not null,
is_delete bit(1) default 0,
constraint pk_address primary key (id),
constraint fk_address_users foreign key (id_user) references users(id));
create table cart(
id int auto_increment,
id_user bigint not null,
is_delete bit(1) default 0,
constraint pk_cart primary key (id),
constraint fk_cart_users foreign key (id_user) references users(id)
);
create table cart_item (
id int auto_increment,
id_cart int not null,
id_product bigint not null,
quantity_slected int not null,
sub_total bigint,
is_delete bit(1) default 0,
constraint pk_cart_item primary key (id),
constraint fk_cart_item_cart foreign key (id_cart) references cart(id),
constraint fk_cart_item_products foreign key (id_product) references products(id));
create table orders(
id bigint auto_increment,
id_user bigint not null,
order_date date not null,
total_price bigint,
is_delete bit(1) default 0,
constraint pk_orders primary key (id),
constraint fk_orders_users foreign key (id_user) references users(id));
create table order_detail(
id bigint auto_increment,
id_order bigint not null,
id_product bigint not null,
quantity_to_buy int not null,
sub_total_price bigint,
is_delete bit(1) default 0,
constraint pk_order_detail primary key (id),
constraint fk_order_detail_products foreign key (id_product) references products(id),
constraint fk_order_detail_orders foreign key (id_order) references orders(id)
);
alter table cart
add column total_price bigint;
alter table  products add column brand nvarchar(100);
-- alter table  products  alter column image nvarchar(5000);-- 