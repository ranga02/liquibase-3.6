--liquibase formatted sql

--changeset nvoxland:1 runAlways:true
use srx
go

--changeset nvoxland:2 runAlways:true
select @@servername, db_name(), "sub/9000_DDL_tbl.sql"
go
