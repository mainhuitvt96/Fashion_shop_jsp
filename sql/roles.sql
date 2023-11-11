SELECT * FROM fashion_shop.roles;
INSERT INTO `fashion_shop`.`roles` (`id`, `name`, `description`) VALUES 
(1, 'Admin', 'Admin được tất các các quyền'),
(2, 'Seller', 'Người bán hàng, được quyền thêm, xóa, sửa sản phẩm, ... của 1 cửa hàng mà seller thuộc về.'),
(3, 'Customer', 'Xem danh sách phẩm, mua hàng, thêm sản phẩm vào giỏ hàng, thanh toán,...');
