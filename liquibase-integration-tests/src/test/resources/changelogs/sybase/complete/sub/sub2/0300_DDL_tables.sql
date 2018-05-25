--liquibase formatted sql

--changeset nvoxland:1 runAlways:true
use framework
go

--changeset nvoxland:2 runAlways:true
select @@servername, db_name(), "sub/sub2/0300_DDL_tables.SQL"
go
