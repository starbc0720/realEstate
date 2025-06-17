CREATE TABLE IF NOT EXISTS condition_alert (
	idx varchar(26) not null,
	user_id varchar(255),
	loc varchar(255),
	price_max bigint,
	type enum ('JEONSE','RENT','SALE') not null,
	area_min float(23),
	enabled TINYINT(1) DEFAULT 0 not null,
	created_at datetime(6),
	modified_at datetime(6),
	primary key (idx)
);

CREATE TABLE IF NOT EXISTS favorite (
	idx varchar(26) not null,
	user_id varchar(255),
	listing_id varchar(255),
	created_at datetime(6),
	modified_at datetime(6),
	primary key (idx)
);

CREATE TABLE IF NOT EXISTS listing (
	idx varchar(26) not null,
	title varchar(255),
	description TEXT,
	price bigint,
	loc varchar(255),
	area float(23),
	type enum ('JEONSE','RENT','SALE') not null,
	floor integer,
	summary TEXT,
	embedding TEXT,
	created_by varchar(255),
	updated_by varchar(255),
	created_at datetime(6),
	modified_at datetime(6),
	primary key (idx)
);

CREATE TABLE IF NOT EXISTS real_price (
	idx varchar(26) not null,
	apt_nm varchar(255),
	loc varchar(255),
	deal_dt datetime(6),
	price bigint,
	floor float(23),
	src varchar(255),
	created_at datetime(6),
	modified_at datetime(6),
	primary key (idx)
);

CREATE TABLE IF NOT EXISTS user (
	idx varchar(26) not null,
	id varchar(255) not null,
	email varchar(255) not null,
	pwd varchar(255) not null,
	name varchar(255) not null,
	role enum ('ADMIN','GUEST','MANAGER','USER') not null,
	created_at datetime(6),
	modified_at datetime(6),
	primary key (idx)
);
