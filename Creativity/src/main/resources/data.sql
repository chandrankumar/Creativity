INSERT INTO prod.users(username, password, enabled)
values('user', '123',true);

INSERT INTO prod.users(username, password, enabled)
values('admin', '123',true);


INSERT INTO prod.authorities(username, authority)
values('user','ROLE_USER');

INSERT INTO prod.authorities(username, authority)
values('admin','ROLE_ADMIN');