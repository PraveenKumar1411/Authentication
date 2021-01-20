  
DROP TABLE IF EXISTS user;

DROP TABLE IF EXISTS authorities;

create table user(
      username varchar_ignorecase(50) not null primary key,
      password varchar_ignorecase(50) not null);
     -- enabled boolean not null);

  create table authorities (
      username varchar_ignorecase(50) not null,
      authority varchar_ignorecase(50) not null,
      constraint fk_authorities_users foreign key(username) references user(username));
      
  create unique index ix_auth_username on authorities (username,authority);