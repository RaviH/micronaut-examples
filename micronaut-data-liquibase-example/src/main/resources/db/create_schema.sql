CREATE SCHEMA IF NOT EXISTS example;

CREATE TABLE IF NOT EXISTS example.customer
(
    id                 serial8      NOT NULL,
    first_name          varchar(255) NULL,
    last_name           varchar(255) NULL,
    address_line        varchar(255) NULL,
    city                varchar(255) NULL,
    state               varchar(255) NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);