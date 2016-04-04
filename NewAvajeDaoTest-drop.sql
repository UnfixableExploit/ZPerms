SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists metadata;

drop table if exists entries;

drop table if exists inheritances;

drop table if exists memberships;

drop table if exists entities;

drop table if exists regions;

drop table if exists worlds;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists metadata_seq;

drop sequence if exists entries_seq;

drop sequence if exists inheritances_seq;

drop sequence if exists memberships_seq;

drop sequence if exists entities_seq;

drop sequence if exists regions_seq;

drop sequence if exists worlds_seq;

