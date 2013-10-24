# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table registrant (
  id                        bigint not null,
  email                     varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  gender                    varchar(255),
  constraint pk_registrant primary key (id))
;

create sequence registrant_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists registrant;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists registrant_seq;

