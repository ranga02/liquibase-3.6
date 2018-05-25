--liquibase formatted sql

--changeset nvoxland:1 runAlways:true
use unity
go

--changeset nvoxland:2 runAlways:true
select @@servername, db_name(), "sub/sub2-sample.sql"
go
