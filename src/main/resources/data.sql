CREATE TABLE customer (
	id bigserial NOT NULL,
	email varchar(255) NULL,
	"name" varchar(255) NULL,
	surname varchar(255) NULL,
	"version" int4 NOT NULL,
	CONSTRAINT customer_pkey PRIMARY KEY (id)
);

CREATE TABLE orders (
	id bigserial NOT NULL,
	customer_id int8 NULL,
	date_created timestamp NULL,
	total_book_count int8 NULL,
	total_price numeric(19, 2) NULL,
	"version" int4 NOT NULL,
	CONSTRAINT orders_pkey PRIMARY KEY (id)
);

CREATE TABLE customer_order_list (
	customer_id int8 NOT NULL,
	order_list_id int8 NOT NULL,
	CONSTRAINT uk_1dnfg9w75acijyonpxp577tnn UNIQUE (order_list_id)
);
ALTER TABLE customer_order_list ADD CONSTRAINT fk2o54sbdqerxidaooyhfiu3nuo FOREIGN KEY (customer_id) REFERENCES customer(id);
ALTER TABLE customer_order_list ADD CONSTRAINT fkc4q5akkf6y5yflatgatrhb5yd FOREIGN KEY (order_list_id) REFERENCES orders(id);


CREATE TABLE payment (
	id bigserial NOT NULL,
	"version" int4 NOT NULL,
	order_id int8 NULL,
	CONSTRAINT payment_pkey PRIMARY KEY (id)
);
ALTER TABLE payment ADD CONSTRAINT fklouu98csyullos9k25tbpk4va FOREIGN KEY (order_id) REFERENCES orders(id);

CREATE TABLE book (
	id bigserial NOT NULL,
	description varchar(255) NULL,
	name varchar(255) NULL,
	price numeric(19, 2) NULL,
	remaining_stock int8 NULL,
	"version" int4 NOT NULL,
	writer varchar(255) NULL,
	CONSTRAINT book_pkey PRIMARY KEY (id)
);
CREATE TABLE orders_book_list (
	order_id int8 NOT NULL,
	book_list_id int8 NOT NULL
);
ALTER TABLE orders_book_list ADD CONSTRAINT fk2jvmfr2qcxh2qml1w6140dsci FOREIGN KEY (book_list_id) REFERENCES book(id);
ALTER TABLE orders_book_list ADD CONSTRAINT fk9gt62g2h1lrekekf81om3dl0i FOREIGN KEY (order_id) REFERENCES orders(id);


