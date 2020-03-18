Drop table prod.authorities;
Drop table prod.users;
create table prod.users(
      username varchar(50) not null primary key,
      password varchar(50) not null,
      enabled boolean not null);
      
create table prod.authorities(
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references prod.users(username));

create unique index ix_auth_username on prod.authorities (username,authority);