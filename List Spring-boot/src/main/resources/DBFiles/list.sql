create database if not exists list;

create table if not exists users
(
    id        int primary key not null unique auto_increment,
    firstName varchar(255)    not null,
    lastName  varchar(255)    not null,
    email     varchar(255)    not null unique,
    passwords varchar(255)    not null
);

create table if not exists datas
(
    id     int primary key not null unique auto_increment,
    object varchar(255)
);

