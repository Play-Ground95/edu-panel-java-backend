CREATE TABLE  IF NOT EXISTS lecture(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL ,
    designation VARCHAR(600) NOT NULL ,
    qualifications VARCHAR(600) NOT NULL ,
    picture VARCHAR(200) DEFAULT NULL,
    linkdin VARCHAR(2000) DEFAULT NULL

);

CREATE TABLE IF NOT EXISTS full_time_rank(
    lecture_id INT NOT NULL ,
    `rank` INT NOT NULL ,
    CONSTRAINT pk PRIMARY KEY (lecture_id,`rank`),
    CONSTRAINT fk FOREIGN KEY (lecture_id) REFERENCES  lecture(id)
);

CREATE TABLE IF NOT EXISTS part_time_rank(
            lecture_id INT NOT NULL ,
            `rank` INT NOT NULL ,
            CONSTRAINT pk_part PRIMARY KEY (lecture_id,`rank`),
            CONSTRAINT fk_part FOREIGN KEY (lecture_id) REFERENCES  lecture(id)
);