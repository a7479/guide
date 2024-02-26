CREATE TABLE IF NOT EXISTS guide
(
    id   BIGINT PRIMARY KEY auto_increment,
    name VARCHAR(128) NOT NULL,
    abr  CHAR(3)      NOT NULL

);

INSERT INTO guide(name, abr)
VALUES ('Sankt-Peterburg', 'spb'),
       ('Moscow', 'msk'),
       ('Novosibirsk', 'nsk'),
       ('Ekaterinburg', 'ekb'),
       ('Samara', 'sam');