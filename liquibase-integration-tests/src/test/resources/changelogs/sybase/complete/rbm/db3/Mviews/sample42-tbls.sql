--liquibase formatted sql

--changeset nvoxland:1 runAlways:true
use srx
go

--changeset nvoxland:2 runAlways:true
select @@servername, db_name(), "rbm/db3/Mviews/sample42-tbls.sql"
go
