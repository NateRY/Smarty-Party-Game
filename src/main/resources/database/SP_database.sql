use SmartyParty;

create table if not exists player(
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(250),
    score INT
);

create table if not exists game(
id INT PRIMARY KEY AUTO_INCREMENT,
round INT,
score INT,
date VARCHAR(45),
level INT
);


create table if not exists question(
id INT PRIMARY KEY AUTO_INCREMENT,
question VARCHAR(250),
hint VARCHAR(45),
answer VARCHAR(15),
optionOne VARCHAR(15),
optionTwo VARCHAR(15),
optionThree VARCHAR(15),
level INT,
subject VARCHAR(20)

);

ALTER TABLE question ADD CONSTRAINT unique_question UNIQUE(question);