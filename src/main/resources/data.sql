INSERT into  USER (userName, password ) values ('user', 'pass');
INSERT into  USER (userName, password ) values ('admin', 'pass' );

INSERT into  authorities (userName, authority ) values ('user', 'ROLE_user');
INSERT into  authorities (userName, authority ) values ('admin', 'ROLE_admin' );
