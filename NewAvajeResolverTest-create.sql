create table metadata (
  id                        bigint not null,
  entity_id                 bigint not null,
  name                      varchar(255) not null,
  string_value              varchar(255),
  integer_value             bigint,
  real_value                double,
  boolean_value             boolean,
  constraint uq_metadata_1 unique (entity_id,name),
  constraint pk_metadata primary key (id))
;

create table entries (
  id                        bigint not null,
  entity_id                 bigint not null,
  region_id                 bigint,
  world_id                  bigint,
  permission                varchar(255) not null,
  value                     boolean not null,
  constraint uq_entries_1 unique (entity_id,region_id,world_id,permission),
  constraint pk_entries primary key (id))
;

create table inheritances (
  id                        bigint not null,
  child_id                  bigint not null,
  parent_id                 bigint not null,
  ordering                  integer not null,
  constraint uq_inheritances_1 unique (child_id,parent_id),
  constraint pk_inheritances primary key (id))
;

create table memberships (
  id                        bigint not null,
  member                    varchar(255),
  display_name              varchar(255),
  group_id                  bigint not null,
  expiration                timestamp,
  constraint uq_memberships_1 unique (member,group_id),
  constraint pk_memberships primary key (id))
;

create table entities (
  id                        bigint not null,
  name                      varchar(255) not null,
  is_group                  boolean not null,
  display_name              varchar(255) not null,
  priority                  integer,
  parent_id                 bigint,
  constraint uq_entities_1 unique (name,is_group),
  constraint pk_entities primary key (id))
;

create table regions (
  id                        bigint not null,
  name                      varchar(255),
  constraint uq_regions_1 unique (name),
  constraint pk_regions primary key (id))
;

create table worlds (
  id                        bigint not null,
  name                      varchar(255),
  constraint uq_worlds_1 unique (name),
  constraint pk_worlds primary key (id))
;

create sequence metadata_seq;

create sequence entries_seq;

create sequence inheritances_seq;

create sequence memberships_seq;

create sequence entities_seq;

create sequence regions_seq;

create sequence worlds_seq;

alter table metadata add constraint fk_metadata_entity_1 foreign key (entity_id) references entities (id) on delete restrict on update restrict;
create index ix_metadata_entity_1 on metadata (entity_id);
alter table entries add constraint fk_entries_entity_2 foreign key (entity_id) references entities (id) on delete restrict on update restrict;
create index ix_entries_entity_2 on entries (entity_id);
alter table entries add constraint fk_entries_region_3 foreign key (region_id) references regions (id) on delete restrict on update restrict;
create index ix_entries_region_3 on entries (region_id);
alter table entries add constraint fk_entries_world_4 foreign key (world_id) references worlds (id) on delete restrict on update restrict;
create index ix_entries_world_4 on entries (world_id);
alter table inheritances add constraint fk_inheritances_child_5 foreign key (child_id) references entities (id) on delete restrict on update restrict;
create index ix_inheritances_child_5 on inheritances (child_id);
alter table inheritances add constraint fk_inheritances_parent_6 foreign key (parent_id) references entities (id) on delete restrict on update restrict;
create index ix_inheritances_parent_6 on inheritances (parent_id);
alter table memberships add constraint fk_memberships_group_7 foreign key (group_id) references entities (id) on delete restrict on update restrict;
create index ix_memberships_group_7 on memberships (group_id);
alter table entities add constraint fk_entities_parent_8 foreign key (parent_id) references entities (id) on delete restrict on update restrict;
create index ix_entities_parent_8 on entities (parent_id);


